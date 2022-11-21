import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

// ignore: must_be_immutable
class OutputArea extends StatefulWidget {
  OutputArea({Key? key, required this.output}) : super(key: key);
  String output;

  @override
  _OutputAreaState createState() => _OutputAreaState();
}

class _OutputAreaState extends State<OutputArea> {
  @override
  Widget build(BuildContext context) {
    return Container(
      alignment: Alignment.centerRight,
      padding: const EdgeInsets.symmetric(vertical: 24.0, horizontal: 12.0),
      child: Text(
        widget.output,
        style: const TextStyle(fontSize: 48.0, fontWeight: FontWeight.bold),
      ),
    );
  }
}
