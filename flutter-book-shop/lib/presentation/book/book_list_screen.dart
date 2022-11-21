import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:to_do_list_app/data/model/book.dart';
import 'package:to_do_list_app/presentation/book/book_view_model.dart';

class BookListScreen extends StatefulWidget {
  //const BookListScreen({Key? key}) : super(key: key);
  BookViewModel bookViewModel = BookViewModel();

  @override
  _BookListScreenState createState() => _BookListScreenState();
}

class _BookListScreenState extends State<BookListScreen> {
  List<dynamic> listBook = <Book>[];

  @override
  void initState() {
    super.initState();
    _getListBook();
  }

  _getListBook() async {
    listBook = await widget.bookViewModel.getBook();
    Future.delayed(const Duration(microseconds: 100), () {
      setState(() {
        listBook = listBook;
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Container(
        child: Column(
          children: [
            Row(
              children: [
                Padding(
                  padding: const EdgeInsets.only(left: 150.0),
                  child: ElevatedButton(
                    onPressed: () {
                      final status = Navigator.pushNamed(context, '/book/add');
                      if (status == 'Submitted') {
                        setState(() {
                          _getListBook();
                        });
                      }
                    },
                    child: Text('Add Book'),
                  ),
                ),
              ],
            ),
            Row(
              children: [
                Padding(
                  padding: const EdgeInsets.only(left: 135.0),
                  child: Text(
                    'Book List',
                    style:
                        TextStyle(fontSize: 30.0, fontWeight: FontWeight.bold),
                  ),
                ),
              ],
            ),
            Expanded(
                child: Card(
              child: Scrollbar(
                  child: ListView.builder(
                itemBuilder: (context, index) {
                  return Column(
                    children: [
                      Row(
                        children: [
                          Expanded(
                              child: ListTile(
                            leading: Icon(Icons.book, size: 40.0),
                            title: Text(listBook[index].title),
                          )),
                        ],
                      ),
                      Divider(
                        height: 5.0,
                      )
                    ],
                  );
                },
                itemCount: listBook.length,
              )),
            ))
          ],
        ),
      ),
    );
  }
}
