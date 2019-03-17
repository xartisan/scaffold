package com.perye.manage.encrypted;


import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@RunWith( SpringRunner.class )
@SpringBootTest
public class JasyptStringEncryptorTest {

	/**
	 * 前提是配置文件设置了 用于加密/解密属性的主密码
	 * <pre>
	 *     jasypt:
	 *       encryptor:
	 *         password: 你的密钥
	 * </pre>
	 * <p>
	 * 使用示例 : ENC(加密串)
	 */
	@Autowired
	private StringEncryptor stringEncryptor;

	@Test
	public void name () throws Exception {
		final String username = stringEncryptor.encrypt( "root" );
		final String password = stringEncryptor.encrypt( "qq1212" );

		System.err.println( "username = " + username );
		System.err.println( "password = " + password );

	}
}
