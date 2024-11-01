package com.xiaoyi.pay.config;
import java.io.FileWriter;
import java.io.IOException;




public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "9021000141666538";


    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCP+Sjy7m7V7rnA9rZZERGnqBhYnQCquTRbtOONKNE1iBLY//F3SYhbA7jblZIHNT9ficGDMS5zHwCr9CyiJq7uhrCZBOUKppch8soQLLk88SvUXOj74Jmmdp4H65ieWTJGUa+3XBpenEMPpJqSItm6RbpOxQQ3i8qNq/2/Ms2CeyCytljut1ao28MqOpvv5CtEcJgtTXkZTKgPPdlOFOVDlxvbbcL7zPrOto2rDVBv7XqjKOQAcInSpuC8EUQ0nGEI07n8xiRK+jqBS4/AOUTfnnDLkeyWhQhouoaKBfH4nydowY+9nVJmvaKOfxLlfQI0GEDBRXWKAfOTElIQLMofAgMBAAECggEBAIF419JfiVzp6jIVq7Y9G1tiV0KZLlhZZTRzX485/aneTNTIliVoAy+WEU+nGkNRJ0SLZXLNb7AnWTtJwjmv//CRP47cT/1cAt2MsRoKniqn13qKcxrPyF1inosQ25bLL+L84sBKG4ypicUvibGRlatluT3M/xXUqLruyKqAzT9gjdlCtg+R0UYATptRi4+Gs3XJ5a9hM9CXSOirBJ+13UKZLbEZG/4HqfbCBKrehASQv2FG00k6Z2b2tvjWR7iHAzoWmsGu+3XBKHZG5+RjKuV4WKIXTRtf/hqlNTtFpN/OS+HXa9egdUQIqZIy9cb4j5tXHqqpMRLKfLIPkO/fJ8ECgYEA3pwOcG46gz8o4ubmFsm6eIwqvLTkg1unksOV+qVYgiajtW7oXAYM+2NfSppOvrxvlFxK39P2z05TXiYo9ITZpWp/Was69dVZyh+02I0PHxHeRX6aYFmfOV4NmceK/3AtEq3Co78dHueZJD4KnPCzZtxInOM7aLapjzsmc7nnqAUCgYEApZGQCcg2EnMKHLYkXLIotlBz4qhwUB3aWQXKxSQe6lJVOAX6+Ps5e3KESFN8B1CksphuqK2LnzKjX6EkvQOMIAFSuNMMOBCFKxfRc0jwd2169M2Bgc0n3HpzT4QOvJP3/WDOa+lR0vFfk/xOescrJ6319cyPk5Eqqe1TcaSPdtMCgYEAjHQeUCXcWU8SdweEiUBCnSijFmlz/MVpl5o8GOcWTxgeFq2hgd53dm2ehC2UHZg7Nnp863iLswUSaMbe9FiWEl59d5AoJU+11Wfn7PIjZlEZ0vMsaDpj0ghbwHk8ZCrc5Xoo4rQEpaku4MUcYSUlrHK0hfiBVXJazXpeqonTdhkCgYAMUinC4JhNhSwSeOd50nQ/JPuKuXgqLh6Kk2jEhOycCWZ4FdHYZ3GeoyX+79+B99lZxQgvG0MRpMYNnsNKIZJy60ZJpML7BRez3kDi8GGcsZP91bE2hJrbyGz+VNh35hcFTwftdd518Spoq9T3RA0NFeAA26kvlRT0skmMYm+eqwKBgQCtrbjSqTkXIhxsVYcd5SfD7cu+hSoGhXNWJ/niS500innoBtX02wTkUTh4SxWnNiXaoiNA5Vc61pEFsdW1I843E0Y7Nn0KiEAdhDkAu0TML5lHWmRjSwk64dUdUjyKfcfYlBgNHWNR7wrVK9ay77InrRz9NJ9Gj3GLtEqwFTzZow==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAktGLLmircE2onKIDw4HaUr1DycN5zFs42MEX147uN59rSZODBdazzJyXu0tJ6oMlVTHxtzcYGFDoukGq2AFZ7b2uE29bLl5VuMJGM+vEGigz4QPPByXpijOC9mbL4QPH3wlfi37XR3iTsPJg5rJqclzKuTcTmaEPwI5DLjBhuyU/CvoFwLboHAm3EFxlaDJkkAMtpjBUF9XUJz22MY7Pz/qGBu29HqfslJkrhIwGLoMoWB0f01jfdiPKGM7rNlAsH3+yXytyfbBGGhskUPPuwy4I/eyPZTmezbILjLyElOjcEB5rY/yWbMCtrcsw9ye8cMri6kyrFy1j2DADL1PiCwIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.0.0.1:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";

    // 日志目录
    public static String log_path = "./";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


