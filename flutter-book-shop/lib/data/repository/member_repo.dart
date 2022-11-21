import 'package:to_do_list_app/data/api/api_helper.dart';
import 'package:to_do_list_app/data/model/member.dart';
import 'package:to_do_list_app/data/model/member_response.dart';

class MemberRepo {
  final ApiHelper _apiHelper = ApiHelper.INSTANCE;

  Future<Member> addProduct(Member newMember) async {
    final response =
        await _apiHelper.postData('/member/add', newMember.toMap());
    return Member.fromMap(response);
  }

  Future<List<dynamic>> getProduct() async {
    final response = await _apiHelper.getData('/member');
    return MemberResponse.fromList(response).members;
  }

  deleteProduct(int id, int status) async {
    String path = '/member' + id.toString() + '/' + status.toString();
    final response = await _apiHelper.deleteData(path);
    return Member.fromMap(response);
  }
}
