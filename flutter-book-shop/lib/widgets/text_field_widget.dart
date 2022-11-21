import 'package:flutter/material.dart';

class TextFieldWidget extends StatelessWidget {
  final TextEditingController tec;
  final String hintText;
  String? Function(String? value)? validate;
  TextFieldWidget(
      {Key? key, required this.tec, required this.hintText, this.validate})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return TextFormField(
      controller: tec,
      decoration: InputDecoration(
        hintText: hintText,
      ),
      validator: validate,
    );
  }
}
