import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class SingleButton extends StatelessWidget {
  const SingleButton(
      {Key? key, required this.value, required this.buttonPressed})
      : super(key: key);
  final String value;
  final VoidCallback buttonPressed;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.only(left: 5.0, right: 5.0),
      child: MaterialButton(
          onPressed: buttonPressed,
          child: Text(
            value,
            style: const TextStyle(
                fontWeight: FontWeight.bold,
                fontSize: 48.0,
                color: Colors.white),
          ),
          color: Colors.indigo,
          height: 75.0,
          elevation: 30.0,
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(20.0),
            side: const BorderSide(color: Colors.indigoAccent),
          )),
    );
  }
}
