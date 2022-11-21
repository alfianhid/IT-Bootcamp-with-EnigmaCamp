import 'package:calculator/widgets/list_of_function.dart';
import 'package:calculator/widgets/output_area.dart';
import 'package:calculator/widgets/single_button.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class ButtonArea extends StatefulWidget {
  const ButtonArea({Key? key}) : super(key: key);

  @override
  _ButtonAreaState createState() => _ButtonAreaState();
}

class _ButtonAreaState extends State<ButtonArea> {
  seven() {
    setState(() {
      OutputArea(output: '7');
    });
  }

  @override
  Widget build(BuildContext context) {
    return Container(
      alignment: Alignment.bottomCenter,
      padding: const EdgeInsets.only(top: 225.0),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        children: [
          Padding(
            padding: const EdgeInsets.only(bottom: 7.0),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: [
                SingleButton(value: '7', buttonPressed: seven),
                const SingleButton(value: '8', buttonPressed: eight),
                const SingleButton(value: '9', buttonPressed: nine),
                const SingleButton(value: '/', buttonPressed: divide),
              ],
            ),
          ),
          Padding(
            padding: const EdgeInsets.only(bottom: 7.0),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: const [
                SingleButton(value: '4', buttonPressed: four),
                SingleButton(value: '5', buttonPressed: five),
                SingleButton(value: '6', buttonPressed: six),
                SingleButton(value: '*', buttonPressed: multiply),
              ],
            ),
          ),
          Padding(
            padding: const EdgeInsets.only(bottom: 7.0),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: const [
                SingleButton(value: '1', buttonPressed: one),
                SingleButton(value: '2', buttonPressed: two),
                SingleButton(value: '3', buttonPressed: three),
                SingleButton(value: '-', buttonPressed: minus),
              ],
            ),
          ),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: const [
              SingleButton(value: 'C', buttonPressed: clear),
              SingleButton(value: '0', buttonPressed: zero),
              SingleButton(value: '=', buttonPressed: result),
              SingleButton(value: '+', buttonPressed: plus),
            ],
          ),
        ],
      ),
    );
  }
}
