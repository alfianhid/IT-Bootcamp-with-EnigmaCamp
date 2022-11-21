import 'package:flutter/material.dart';
import 'package:to_do_list_app/presentation/book/book_form_screen.dart';
import 'package:to_do_list_app/presentation/member/member_form_screen.dart';
import 'package:to_do_list_app/presentation/member/member_list_screen.dart';

import 'presentation/book/book_list_screen.dart';

class StoreApp extends StatefulWidget {
  const StoreApp({Key? key}) : super(key: key);

  @override
  _StoreAppState createState() => _StoreAppState();
}

class _StoreAppState extends State<StoreApp> {
  int _currentPage = 0;
  final List _pages = [BookListScreen(), MemberListScreen()];

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: SafeArea(
        child: Scaffold(
          appBar: AppBar(
            title: Center(child: Text('Enigma Bookshop')),
          ),
          body: _pages[_currentPage],
          bottomNavigationBar: BottomNavigationBar(
            currentIndex: _currentPage,
            items: [
              BottomNavigationBarItem(icon: Icon(Icons.book), label: 'Book'),
              BottomNavigationBarItem(
                  icon: Icon(Icons.perm_identity), label: 'Member'),
            ],
            onTap: (int index) {
              setState(() {
                _currentPage = index;
              });
            },
          ),
        ),
      ),
      routes: {
        '/book/add': (context) => BookFormScreen(),
        '/member/add': (context) => MemberFormScreen(),
      },
    );
  }
}
