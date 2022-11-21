import 'package:to_do_list_app/data/model/member.dart';

class MemberResponse {
  List<dynamic> members;

  MemberResponse({required this.members});

  factory MemberResponse.fromList(List<dynamic> listOfMember) {
    List<dynamic> listMember =
        listOfMember.map((e) => Member.fromMap(e)).toList();

    return MemberResponse(members: listMember);
  }
}
