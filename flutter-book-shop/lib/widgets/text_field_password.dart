import 'package:flutter/material.dart';

class TextFieldPassword extends StatelessWidget {
  final TextEditingController tec;
  final String hintText;
  String? Function(String? value)? validate;
  TextFieldPassword(
      {Key? key, required this.tec, required this.hintText, this.validate})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return TextFormField(
      obscureText: true,
      enableSuggestions: false,
      autocorrect: false,
      obscuringCharacter: "*",
      controller: tec,
      decoration: InputDecoration(
        hintText: hintText,
      ),
      validator: validate,
    );
  }
}
