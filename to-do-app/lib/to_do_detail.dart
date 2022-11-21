import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ToDoDetail extends StatefulWidget {
  const ToDoDetail({Key? key}) : super(key: key);

  @override
  _ToDoDetailState createState() => _ToDoDetailState();
}

class _ToDoDetailState extends State<ToDoDetail> {
  @override
  Widget build(BuildContext context) {
    return SafeArea(
        child: Scaffold(
      appBar: AppBar(
        title: Text('Details'),
      ),
      body: SafeArea(
          child: Column(
        children: [
          Row(
            children: [
              Text('Berpindah!'),
            ],
          ),
        ],
      )),
    ));
  }
}
