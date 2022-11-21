import 'package:dio/dio.dart';

class ApiHelper {
  ApiHelper._privateConstructor();

  static ApiHelper INSTANCE = ApiHelper._privateConstructor();

  final _dio = Dio(BaseOptions(baseUrl: 'http://172.28.128.1:8080'));

  Future<dynamic> postData(String path, Map<String, dynamic> data) async {
    try {
      Response response = await _dio.post(path, data: data);
      if (response.statusCode == 200 || response.statusCode == 201) {
        return response.data;
      } else {
        throw Exception('Failed to post data');
      }
    } catch (e) {
      print(e);
      throw Exception('Could not connected to server.');
    }
  }

  Future<dynamic> getData(String path,
      {Map<String, dynamic>? queryParam}) async {
    try {
      Response response = await _dio.get(path, queryParameters: queryParam);
      if (response.statusCode == 200 || response.statusCode == 201) {
        return response.data;
      } else {
        throw Exception('Failed to post data');
      }
    } catch (e) {
      print(e);
      throw Exception('Could not connected to server.');
    }
  }

  deleteData(String path) async {
    try {
      Response response = await _dio.delete(path);
      if (response.statusCode == 200 || response.statusCode == 201) {
        return response.data;
      } else {
        throw Exception('Failed to delete data');
      }
    } catch (e) {
      print(e);
      throw Exception('Could not connected to server.');
    }
  }
}
