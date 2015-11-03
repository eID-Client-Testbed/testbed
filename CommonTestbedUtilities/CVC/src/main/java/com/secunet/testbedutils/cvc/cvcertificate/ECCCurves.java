package com.secunet.testbedutils.cvc.cvcertificate;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECCurve;
/**
 * This class stores all trusted curve parameters
 * @author meier.marcus
 *
 */
public enum ECCCurves {

	/**
	 * Brainpool P160R1 curve
	 */
	BRAINPOOLP160R1(createFp(
		new BigInteger("00E95E4A5F737059DC60DFC7AD95B3D8139515620F",16),
		new BigInteger("340E7BE2A280EB74E2BE61BADA745D97E8F7C300",16),
		new BigInteger("1E589A8595423412134FAA2DBDEC95C8D8675E58",16),
		new BigInteger("BED5AF16EA3F6A4F62938C4631EB5AF7BDBCDBC3",16),
		new BigInteger("1667CB477A1A8EC338F94741669C976316DA6321",16),
		new BigInteger("00E95E4A5F737059DC60DF5991D45029409E60FC09",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P160T1 curve
	 */
	BRAINPOOLP160T1(createFp(
		new BigInteger("00E95E4A5F737059DC60DFC7AD95B3D8139515620F",16),
		new BigInteger("E95E4A5F737059DC60DFC7AD95B3D8139515620C",16),
		new BigInteger("7A556B6DAE535B7B51ED2C4D7DAA7A0B5C55F380",16),
		new BigInteger("B199B13B9B34EFC1397E64BAEB05ACC265FF2378",16),
		new BigInteger("ADD6718B7C7C1961F0991B842443772152C9E0AD",16),
		new BigInteger("00E95E4A5F737059DC60DF5991D45029409E60FC09",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P192R1 curve
	 */
	BRAINPOOLP192R1(createFp(
		new BigInteger("00C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86297",16),
		new BigInteger("6A91174076B1E0E19C39C031FE8685C1CAE040E5C69A28EF",16),
		new BigInteger("469A28EF7C28CCA3DC721D044F4496BCCA7EF4146FBF25C9",16),
		new BigInteger("C0A0647EAAB6A48753B033C56CB0F0900A2F5C4853375FD6",16),
		new BigInteger("14B690866ABD5BB88B5F4828C1490002E6773FA2FA299B8F",16),
		new BigInteger("00C302F41D932A36CDA7A3462F9E9E916B5BE8F1029AC4ACC1",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P192T1 curve
	 */
	BRAINPOOLP192T1(createFp(
		new BigInteger("00C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86297",16),
		new BigInteger("C302F41D932A36CDA7A3463093D18DB78FCE476DE1A86294",16),
		new BigInteger("13D56FFAEC78681E68F9DEB43B35BEC2FB68542E27897B79",16),
		new BigInteger("3AE9E58C82F63C30282E1FE7BBF43FA72C446AF6F4618129",16),
		new BigInteger("097E2C5667C2223A902AB5CA449D0084B7E5B3DE7CCC01C9",16),
		new BigInteger("00C302F41D932A36CDA7A3462F9E9E916B5BE8F1029AC4ACC1",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P224R1
	 */
	BRAINPOOLP224R1(createFp(
		new BigInteger("00D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF",16),
		new BigInteger("68A5E62CA9CE6C1C299803A6C1530B514E182AD8B0042A59CAD29F43",16),
		new BigInteger("2580F63CCFE44138870713B1A92369E33E2135D266DBB372386C400B",16),
		new BigInteger("0D9029AD2C7E5CF4340823B2A87DC68C9E4CE3174C1E6EFDEE12C07D",16),
		new BigInteger("58AA56F772C0726F24C6B89E4ECDAC24354B9E99CAA3F6D3761402CD",16),
		new BigInteger("00D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P224T1
	 */
	BRAINPOOLP224T1(createFp(
		new BigInteger("00D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF",16),
		new BigInteger("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FC",16),
		new BigInteger("4B337D934104CD7BEF271BF60CED1ED20DA14C08B3BB64F18A60888D",16),
		new BigInteger("6AB1E344CE25FF3896424E7FFE14762ECB49F8928AC0C76029B4D580",16),
		new BigInteger("0374E9F5143E568CD23F3F4D7C0D4B1E41C8CC0D1C6ABD5F1A46DB4C",16),
		new BigInteger("00D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P256R1
	 */
	BRAINPOOLP256R1(createFp(
		new BigInteger("00A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377",16),
		new BigInteger("7D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9",16),
		new BigInteger("26DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B6",16),
		new BigInteger("8BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262",16),
		new BigInteger("547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F046997",16),
		new BigInteger("00A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool 256T1
	 */
	BRAINPOOLP256T1(createFp(
		new BigInteger("00A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377",16),
		new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5374",16),
		new BigInteger("662C61C430D84EA4FE66A7733D0B76B7BF93EBC4AF2F49256AE58101FEE92B04",16),
		new BigInteger("A3E8EB3CC1CFE7B7732213B23A656149AFA142C47AAFBC2B79A191562E1305F4",16),
		new BigInteger("2D996C823439C56D7F7B22E14644417E69BCB6DE39D027001DABE8F35B25C9BE",16),
		new BigInteger("00A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P320R1 
	 */
	BRAINPOOLP320R1(createFp(
		new BigInteger("00D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E27",16),
		new BigInteger("3EE30B568FBAB0F883CCEBD46D3F3BB8A2A73513F5EB79DA66190EB085FFA9F492F375A97D860EB4",16),
		new BigInteger("520883949DFDBC42D3AD198640688A6FE13F41349554B49ACC31DCCD884539816F5EB4AC8FB1F1A6",16),
		new BigInteger("43BD7E9AFB53D8B85289BCC48EE5BFE6F20137D10A087EB6E7871E2A10A599C710AF8D0D39E20611",16),
		new BigInteger("14FDD05545EC1CC8AB4093247F77275E0743FFED117182EAA9C77877AAAC6AC7D35245D1692E8EE1",16),
		new BigInteger("00D35E472036BC4FB7E13C785ED201E065F98FCFA5B68F12A32D482EC7EE8658E98691555B44C59311",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P320T1
	 */
	BRAINPOOLP320T1(createFp(
		new BigInteger("00D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E27",16),
		new BigInteger("D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E24",16),
		new BigInteger("A7F561E038EB1ED560B3D147DB782013064C19F27ED27C6780AAF77FB8A547CEB5B4FEF422340353",16),
		new BigInteger("925BE9FB01AFC6FB4D3E7D4990010F813408AB106C4F09CB7EE07868CC136FFF3357F624A21BED52",16),
		new BigInteger("63BA3A7A27483EBF6671DBEF7ABB30EBEE084E58A0B077AD42A5A0989D1EE71B1B9BC0455FB0D2C3",16),
		new BigInteger("00D35E472036BC4FB7E13C785ED201E065F98FCFA5B68F12A32D482EC7EE8658E98691555B44C59311",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P384R1
	 */
	BRAINPOOLP384R1(createFp(
		new BigInteger("008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53",16),
		new BigInteger("7BC382C63D8C150C3C72080ACE05AFA0C2BEA28E4FB22787139165EFBA91F90F8AA5814A503AD4EB04A8C7DD22CE2826",16),
		new BigInteger("04A8C7DD22CE28268B39B55416F0447C2FB77DE107DCD2A62E880EA53EEB62D57CB4390295DBC9943AB78696FA504C11",16),
		new BigInteger("1D1C64F068CF45FFA2A63A81B7C13F6B8847A3E77EF14FE3DB7FCAFE0CBD10E8E826E03436D646AAEF87B2E247D4AF1E",16),
		new BigInteger("8ABE1D7520F9C2A45CB1EB8E95CFD55262B70B29FEEC5864E19C054FF99129280E4646217791811142820341263C5315",16),
		new BigInteger("008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E9046565",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P384T1
	 */
	BRAINPOOLP384T1(createFp(
		new BigInteger("008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC53",16),
		new BigInteger("8CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B412B1DA197FB71123ACD3A729901D1A71874700133107EC50",16),
		new BigInteger("7F519EADA7BDA81BD826DBA647910F8C4B9346ED8CCDC64E4B1ABD11756DCE1D2074AA263B88805CED70355A33B471EE",16),
		new BigInteger("18DE98B02DB9A306F2AFCD7235F72A819B80AB12EBD653172476FECD462AABFFC4FF191B946A5F54D8D0AA2F418808CC",16),
		new BigInteger("25AB056962D30651A114AFD2755AD336747F93475B7A1FCA3B88F2B6A208CCFE469408584DC2B2912675BF5B9E582928",16),
		new BigInteger("008CB91E82A3386D280F5D6F7E50E641DF152F7109ED5456B31F166E6CAC0425A7CF3AB6AF6B7FC3103B883202E9046565",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P512R1
	 */
	BRAINPOOLP512R1(createFp(
		new BigInteger("00AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA703308717D4D9B009BC66842AECDA12AE6A380E62881FF2F2D82C68528AA6056583A48F3",16),
		new BigInteger("7830A3318B603B89E2327145AC234CC594CBDD8D3DF91610A83441CAEA9863BC2DED5D5AA8253AA10A2EF1C98B9AC8B57F1117A72BF2C7B9E7C1AC4D77FC94CA",16),
		new BigInteger("3DF91610A83441CAEA9863BC2DED5D5AA8253AA10A2EF1C98B9AC8B57F1117A72BF2C7B9E7C1AC4D77FC94CADC083E67984050B75EBAE5DD2809BD638016F723",16),
		new BigInteger("81AEE4BDD82ED9645A21322E9C4C6A9385ED9F70B5D916C1B43B62EEF4D0098EFF3B1F78E2D0D48D50D1687B93B97D5F7C6D5047406A5E688B352209BCB9F822",16),
		new BigInteger("7DDE385D566332ECC0EABFA9CF7822FDF209F70024A57B1AA000C55B881F8111B2DCDE494A5F485E5BCA4BD88A2763AED1CA2B2FA8F0540678CD1E0F3AD80892",16),
		new BigInteger("00AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA70330870553E5C414CA92619418661197FAC10471DB1D381085DDADDB58796829CA90069",16),
		new BigInteger("01",16))),
	/**
	 * Brainpool P512T1
	 */
	BRAINPOOLP512T1(createFp(
		new BigInteger("00AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA703308717D4D9B009BC66842AECDA12AE6A380E62881FF2F2D82C68528AA6056583A48F3",16),
		new BigInteger("AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA703308717D4D9B009BC66842AECDA12AE6A380E62881FF2F2D82C68528AA6056583A48F0",16),
		new BigInteger("7CBBBCF9441CFAB76E1890E46884EAE321F70C0BCB4981527897504BEC3E36A62BCDFA2304976540F6450085F2DAE145C22553B465763689180EA2571867423E",16),
		new BigInteger("640ECE5C12788717B9C1BA06CBC2A6FEBA85842458C56DDE9DB1758D39C0313D82BA51735CDB3EA499AA77A7D6943A64F7A3F25FE26F06B51BAA2696FA9035DA",16),
		new BigInteger("5B534BD595F5AF0FA2C892376C84ACE1BB4E3019B71634C01131159CAE03CEE9D9932184BEEF216BD71DF2DADF86A627306ECFF96DBB8BACE198B61E00F8B332",16),
		new BigInteger("00AADD9DB8DBE9C48B3FD4E6AE33C9FC07CB308DB3B3C9D20ED6639CCA70330870553E5C414CA92619418661197FAC10471DB1D381085DDADDB58796829CA90069",16),
		new BigInteger("01",16))),
		

	/**
	 * ASN.1 SECP112R1
	 */
	ASN1SECP112R1(createFp(
		new BigInteger("DB7C2ABF62E35E668076BEAD208B",16),
		new BigInteger("DB7C2ABF62E35E668076BEAD2088",16),
		new BigInteger("659EF8BA043916EEDE8911702B22",16),
		new BigInteger("09487239995A5EE76B55F9C2F098",16),
		new BigInteger("A89CE5AF8724C0A23E0E0FF77500",16),
		new BigInteger("DB7C2ABF62E35E7628DFAC6561C5",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP160R1
	 */
	ASN1SECP160R1(createFp("secp160r1",
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC",16),
		new BigInteger("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45",16),
		new BigInteger("4A96B5688EF573284664698968C38BB913CBFC82",16),
		new BigInteger("23A628553168947D59DCC912042351377AC5FB32",16),
		new BigInteger("0100000000000000000001F4C8F927AED3CA752257",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP160K1
	 */
	ASN1SECP160K1(createFp("secp160k1",
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73",16),
		new BigInteger("0000000000000000000000000000000000000000",16),
		new BigInteger("0000000000000000000000000000000000000007",16),
		new BigInteger("3B4C382CE37AA192A4019E763036F4F5DD4D7EBB",16),
		new BigInteger("938CF935318FDCED6BC28286531733C3F03C4FEE",16),
		new BigInteger("0100000000000000000001B8FA16DFAB9ACA16B6B3",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP256K1
	 */
	ASN1SECP256K1(createFp("secp256k1",
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F",16),
		new BigInteger("0000000000000000000000000000000000000000000000000000000000000000",16),
		new BigInteger("0000000000000000000000000000000000000000000000000000000000000007",16),
		new BigInteger("79BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798",16),
		new BigInteger("483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP128R1
	 */
	ASN1SECP128R1(createFp(
		new BigInteger("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF",16),
		new BigInteger("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC",16),
		new BigInteger("E87579C11079F43DD824993C2CEE5ED3",16),
		new BigInteger("161FF7528B899B2D0C28607CA52C5B86",16),
		new BigInteger("CF5AC8395BAFEB13C02DA292DDED7A83",16),
		new BigInteger("FFFFFFFE0000000075A30D1B9038A115",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP160R2
	 */
	ASN1SECP160R2(createFp("secp160r2",
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70",16),
		new BigInteger("B4E134D3FB59EB8BAB57274904664D5AF50388BA",16),
		new BigInteger("52DCB034293A117E1F4FF11B30F7199D3144CE6D",16),
		new BigInteger("FEAFFEF2E331F296E071FA0DF9982CFEA7D43F2E",16),
		new BigInteger("0100000000000000000000351EE786A818F3A1A16B",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP192K1
	 */
	ASN1SECP192K1(createFp("secp192k1",
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37",16),
		new BigInteger("000000000000000000000000000000000000000000000000",16),
		new BigInteger("000000000000000000000000000000000000000000000003",16),
		new BigInteger("DB4FF10EC057E9AE26B07D0280B7F4341DA5D1B1EAE06C7D",16),
		new BigInteger("9B2F2F6D9C5628A7844163D015BE86344082AA88D95E2F9D",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP224K1
	 */
	ASN1SECP224K1(createFp("secp224k1",
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D",16),
		new BigInteger("00000000000000000000000000000000000000000000000000000000",16),
		new BigInteger("00000000000000000000000000000000000000000000000000000005",16),
		new BigInteger("A1455B334DF099DF30FC28A169A467E9E47075A90F7E650EB6B7A45C",16),
		new BigInteger("7E089FED7FBA344282CAFBD6F7E319F7C0B0BD59E2CA4BDB556D61A5",16),
		new BigInteger("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP224R1
	 */
	ASN1SECP224R1(createFp("secp224r1",
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE",16),
		new BigInteger("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4",16),
		new BigInteger("B70E0CBD6BB4BF7F321390B94A03C1D356C21122343280D6115C1D21",16),
		new BigInteger("BD376388B5F723FB4C22DFE6CD4375A05A07476444D5819985007E34",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP384R1
	 */
	ASN1SECP384R1(createFp("secp384r1",
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC",16),
		new BigInteger("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF",16),
		new BigInteger("AA87CA22BE8B05378EB1C71EF320AD746E1D3B628BA79B9859F741E082542A385502F25DBF55296C3A545E3872760AB7",16),
		new BigInteger("3617DE4A96262C6F5D9E98BF9292DC29F8F41DBD289A147CE9DA3113B5F0B8C00A60B1CE1D7E819D7A431D7C90EA0E5F",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973",16),
		new BigInteger("01",16))),
	/**
	 * ASN.1 SECP521R1
	 */
	ASN1SECP521R1(createFp("secp521r1",
		new BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF",16),
		new BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC",16),
		new BigInteger("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00",16),
		new BigInteger("00C6858E06B70404E9CD9E3ECB662395B4429C648139053FB521F828AF606B4D3DBAA14B5E77EFE75928FE1DC127A2FFA8DE3348B3C1856A429BF97E7E31C2E5BD66",16),
		new BigInteger("011839296A789A3BC0045C8A5FB42C7D1BD998F54449579B446817AFBD17273E662C97EE72995EF42640C550B9013FAD0761353C7086A272C24088BE94769FD16650",16),
		new BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409",16),
		new BigInteger("01",16))),

	/**
	 * ASN.1 SECP192R1
	 */
	ASN1SECP192R1(createFp("secp192r1",
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC",16),
		new BigInteger("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1",16),
		new BigInteger("188DA80EB03090F67CBF20EB43A18800F4FF0AFD82FF1012",16),
		new BigInteger("07192B95FFC8DA78631011ED6B24CDD573F977A11E794811",16),
		new BigInteger("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831",16),
		new BigInteger("01",16))),
			
	/**
	 * ASN.1 SECP256R1
	 */
	ASN1SECP256R1(createFp("secp256r1",
		new BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF",16),
		new BigInteger("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC",16),
		new BigInteger("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B",16),
		new BigInteger("6B17D1F2E12C4247F8BCE6E563A440F277037D812DEB33A0F4A13945D898C296",16),
		new BigInteger("4FE342E2FE1A7F9B8EE7EB4A7C0F9E162BCE33576B315ECECBB6406837BF51F5",16),
		new BigInteger("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551",16),
		new BigInteger("01",16))),
				

	
	/**
	 * ASN.1 SECT163K1
	 */
	ASN1SECT163K1(createF2m("sect163k1",163,3,6,7,
		new BigInteger("01",16),
		new BigInteger("01",16),
		new BigInteger("02FE13C0537BBC11ACAA07D793DE4E6D5E5C94EEE8",16),
		new BigInteger("0289070FB05D38FF58321F2E800536D538CCDAA3D9",16),
		new BigInteger("04000000000000000000020108A2E0CC0D99F8A5EF",16),
		new BigInteger("02",16))),
		
	/**
	 * ASN.1 SECT163R1
	 */
	ASN1SECT163R1(createF2m("sect163r1",163,3,6,7,
		new BigInteger("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2",16),
		new BigInteger("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9",16),
		new BigInteger("0369979697AB43897789566789567F787A7876A654",16),
		new BigInteger("00435EDB42EFAFB2989D51FEFCE3C80988F41FF883",16),
		new BigInteger("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B",16),
		new BigInteger("02",16))),
	/**
	 * ASN.1 SECT163R2
	 */
	ASN1SECT163R2(createF2m("sect163r2",163,3,6,7,
		new BigInteger("01",16),
		new BigInteger("020A601907B8C953CA1481EB10512F78744A3205FD",16),
		new BigInteger("03F0EBA16286A2D57EA0991168D4994637E8343E36",16),
		new BigInteger("00D51FBC6C71A0094FA2CDD545B11C5C0C797324F1",16),
		new BigInteger("040000000000000000000292FE77E70C12A4234C33",16),
		new BigInteger("02",16))),
		
	/**
	 * ASN.1 SECT193r1
	 */
	ASN1SECT193R1(createF2m("sect193r1",193,15,
		new BigInteger("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01",16),
		new BigInteger("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814",16),
		new BigInteger("01F481BC5F0FF84A74AD6CDF6FDEF4BF6179625372D8C0C5E1",16),
		new BigInteger("0025E399F2903712CCF3EA9E3A1AD17FB0B3201B6AF7CE1B05",16),
		new BigInteger("01000000000000000000000000C7F34A778F443ACC920EBA49",16),
		new BigInteger("02",16))),
	/**
	 * ASN.1 SECT193r2
	 */
	ASN1SECT193R2(createF2m("sect193r2",193,15,
		new BigInteger("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B",16),
		new BigInteger("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE",16),
		new BigInteger("00D9B67D192E0367C803F39E1A7E82CA14A651350AAE617E8F",16),
		new BigInteger("01CE94335607C304AC29E7DEFBD9CA01F596F927224CDECF6C",16),
		new BigInteger("010000000000000000000000015AAB561B005413CCD4EE99D5",16),
		new BigInteger("02",16))),		
	/**
	 * ASN.1 SECT233K1
	 */
	ASN1SECT233K1(createF2m("sect233k1",233,74,
			new BigInteger("00",16),
			new BigInteger("01",16),
			new BigInteger("017232BA853A7E731AF129F22FF4149563A419C26BF50A4C9D6EEFAD6126",16),
			new BigInteger("01DB537DECE819B7F70F555A67C427A8CD9BF18AEB9B56E0C11056FAE6A3",16),
			new BigInteger("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF",16),
			new BigInteger("04",16))),
	/**
	 * ASN.1 SECT233R1
	 */
	ASN1SECT233R1(createF2m("sect233r1",233,74,
		new BigInteger("01",16),
		new BigInteger("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD",16),
		new BigInteger("00FAC9DFCBAC8313BB2139F1BB755FEF65BC391F8B36F8F8EB7371FD558B",16),
		new BigInteger("01006A08A41903350678E58528BEBF8A0BEFF867A7CA36716F7E01F81052",16),
		new BigInteger("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7",16),
		new BigInteger("02",16))),

	/**
	 * ASN.1 SECT239K1
	 */
	ASN1SECT239K1(createF2m("sect239k1",239,158,
			new BigInteger("00",16),
			new BigInteger("01",16),
			new BigInteger("29A0B6A887A983E9730988A68727A8B2D126C44CC2CC7B2A6555193035DC",16),
			new BigInteger("76310804F12E549BDB011C103089E73510ACB275FC312A5DC6B76553F0CA",16),
			new BigInteger("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5",16),
			new BigInteger("04",16))),
	/**
	 * ASN.1 SECT283K1
	 */
	ASN1SECT283K1(createF2m("sect283k1",283,5,7,12,
		new BigInteger("00",16),
		new BigInteger("01",16),
		new BigInteger("0503213F78CA44883F1A3B8162F188E553CD265F23C1567A16876913B0C2AC2458492836",16),
		new BigInteger("01CCDA380F1C9E318D90F95D07E5426FE87E45C0E8184698E45962364E34116177DD2259",16),
		new BigInteger("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61",16),
		new BigInteger("04",16))),	
	/**
	 * ASN.1 SECT283R1
	 */
	ASN1SECT283R1(createF2m("sect283r1",283,5,7,12,
		new BigInteger("01",16),
		new BigInteger("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5",16),
		new BigInteger("05F939258DB7DD90E1934F8C70B0DFEC2EED25B8557EAC9C80E2E198F8CDBECD86B12053",16),
		new BigInteger("03676854FE24141CB98FE6D4B20D02B4516FF702350EDDB0826779C813F0DF45BE8112F4",16),
		new BigInteger("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307",16),
		new BigInteger("02",16))),	
	/**
	 * ASN.1 SECT409K1
	 */
	ASN1SECT409K1(createF2m("sect409k1",409,87,
		new BigInteger("00",16),
		new BigInteger("01",16),
		new BigInteger("0060F05F658F49C1AD3AB1890F7184210EFD0987E307C84C27ACCFB8F9F67CC2C460189EB5AAAA62EE222EB1B35540CFE9023746",16),
		new BigInteger("01E369050B7C4E42ACBA1DACBF04299C3460782F918EA427E6325165E9EA10E3DA5F6C42E9C55215AA9CA27A5863EC48D8E0286B",16),
		new BigInteger("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF",16),
		new BigInteger("04",16))),	
	/**
	 * ASN.1 SECT409R1
	 */
	ASN1SECT409R1(createF2m("sect409r1",409,87,
		new BigInteger("01",16),
		new BigInteger("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F",16),
		new BigInteger("015D4860D088DDB3496B0C6064756260441CDE4AF1771D4DB01FFE5B34E59703DC255A868A1180515603AEAB60794E54BB7996A7",16),
		new BigInteger("0061B1CFAB6BE5F32BBFA78324ED106A7636B9C5A7BD198D0158AA4F5488D08F38514F1FDF4B4F40D2181B3681C364BA0273C706",16),
		new BigInteger("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173",16),
		new BigInteger("02",16))),	
	/**
	 * ASN.1 SECT571K1
	 */
	ASN1SECT571K1(createF2m("sect571k1",571,2,5,10,
		new BigInteger("00",16),
		new BigInteger("01",16),
		new BigInteger("026EB7A859923FBC82189631F8103FE4AC9CA2970012D5D46024804801841CA44370958493B205E647DA304DB4CEB08CBBD1BA39494776FB988B47174DCA88C7E2945283A01C8972",16),
		new BigInteger("0349DC807F4FBF374F4AEADE3BCA95314DD58CEC9F307A54FFC61EFC006D8A2C9D4979C0AC44AEA74FBEBBB9F772AEDCB620B01A7BA7AF1B320430C8591984F601CD4C143EF1C7A3",16),
		new BigInteger("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001",16),
		new BigInteger("04",16))),	
	/**
	 * ASN.1 SECT571R1
	 */
	ASN1SECT571R1(createF2m("sect571r1",571,2,5,10,
		new BigInteger("01",16),
		new BigInteger("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A",16),
		new BigInteger("0303001D34B856296C16C0D40D3CD7750A93D1D2955FA80AA5F40FC8DB7B2ABDBDE53950F4C0D293CDD711A35B67FB1499AE60038614F1394ABFA3B4C850D927E1E7769C8EEC2D19",16),
		new BigInteger("037BF27342DA639B6DCCFFFEB73D69D78C6C27A6009CBBCA1980F8533921E8A684423E43BAB08A576291AF8F461BB2A8B3531D2F0485C19B16E2F1516E23DD3C1A4827AF1B8AC15B",16),
		new BigInteger("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47",16),
		new BigInteger("02",16)));	


	
	
	
	/**
	 * reverse lookup map
	 */
	private static final HashMap<ECParameterSpec,ECCCurves> lookup = new HashMap<ECParameterSpec,ECCCurves>();
	/**
	 * initialize the reverse lookup map
	 */
	static {
		for(ECCCurves cur : EnumSet.allOf(ECCCurves.class))
			lookup.put(cur.getECParameter(), cur);
	}
	
	private ECParameterSpec m_ecParameter;
	/**
	 * 
	 * @brief private constructor 
	 *
	 * @param param consigns an initialized ECParameterSpec
	 */
	private ECCCurves( ECParameterSpec param)
	{
		this.m_ecParameter = param;
	}
	
	/**
	 * 
	 * @brief This method will return the domain parameter of an curve as ECParameterSpec
	 * 
	 * @return returns the domain parameter of an ECCCurves enum
	 */
	public ECParameterSpec getECParameter()
	{
		return this.m_ecParameter;
	}
	/**
	 * 
	 * @brief reverse lookup method which returns the enum specifier for the given domain parameter 
	 * 
	 * 
	 * 
	 * @param ec consigns an parameter spec with EC domain parameter
	 * @return returns an enum if we know the given domain parameter else it will return null
	 */
	public static ECCCurves getECCCuveEnum(ECParameterSpec ec)
	{
		Set<ECParameterSpec> keys = lookup.keySet();
		Iterator<ECParameterSpec> it = keys.iterator();
		while(it.hasNext())
		{
			ECParameterSpec key = it.next();
			if(key.getCofactor() == ec.getCofactor() &&
					key.getCurve().getA().equals(ec.getCurve().getA()) &&
					key.getCurve().getB().equals(ec.getCurve().getB()) &&
					key.getCurve().getField().hashCode() == ec.getCurve().getField().hashCode() &&
					key.getGenerator().getAffineX().equals(ec.getGenerator().getAffineX()) &&
					key.getGenerator().getAffineY().equals(ec.getGenerator().getAffineY()) &&
					key.getOrder().equals(ec.getOrder())
					)
			{
				return lookup.get(key);
			}
		}
		
		return null;
	}
	/**
	 * 
	 * @brief reverse lookup method which returns the enum specifier for the given domain parameter 
	 * 
	 * 
	 * 
	 * @param ec consigns an parameter spec with EC domain parameter
	 * @return returns an enum if we know the given domain parameter else it will return null
	 */
	public static ECCCurves getECCCuveEnum(org.bouncycastle.jce.spec.ECParameterSpec ec)
	{
		ECParameterSpec spec = EC5Util.convertSpec(EC5Util.convertCurve(ec.getCurve(),ec.getSeed() ),ec);
		
		return getECCCuveEnum(spec);
	}
	/**
	 * 
	 * @brief a little helper method to create the ECParameterSpec more easily for a Prime curve
	 * 
	 * @param p prime 
	 * @param a first coefficient
	 * @param b second coefficient 
	 * @param Gx x coordinate of base point g
	 * @param Gy y coordinate of base point g
	 * @param r order of point G
	 * @param f cofactor
	 * @return returns a instance of ECParameterSpec
	 */
	static public ECParameterSpec createFp(BigInteger p, BigInteger a,BigInteger b, BigInteger Gx,BigInteger Gy, BigInteger r,BigInteger f)
	{
		ECCurve.Fp curve = new ECCurve.Fp(p,a,b);
		
		org.bouncycastle.jce.spec.ECParameterSpec spec = new org.bouncycastle.jce.spec.ECParameterSpec(curve,curve.createPoint(Gx,Gy),r,f);
		
		return EC5Util.convertSpec(EC5Util.convertCurve(curve,spec.getSeed() ),spec);
	}
	/**
	 * 
	 * @brief a little helper method to create the ECParameterSpec more easily for a Prime curve
	 * 
	 * @param name curve name
	 * @param p prime 
	 * @param a first coefficient
	 * @param b second coefficient 
	 * @param Gx x coordinate of base point g
	 * @param Gy y coordinate of base point g
	 * @param r order of point G
	 * @param f cofactor
	 * @return returns a instance of ECParameterSpec
	 */
	static public ECParameterSpec createFp(String name,BigInteger p, BigInteger a,BigInteger b, BigInteger Gx,BigInteger Gy, BigInteger r,BigInteger f)
	{
		ECCurve.Fp curve = new ECCurve.Fp(p,a,b);
		
		ECNamedCurveSpec spec = new ECNamedCurveSpec(name,curve,curve.createPoint(Gx,Gy),r,f);
		
		return spec;
	}
	/**
	 * 
	 * @brief a little helper method to create the ECParameterSpec more easily for a f2m curve
	 * 
	 * @param m 
	 * @param k 
	 * @param a first coefficient
	 * @param b second coefficient 
	 * @param Gx x coordinate of base point g
	 * @param Gy y coordinate of base point g
	 * @param r order of point G
	 * @param f cofactor
	 * @return returns a instance of ECParameterSpec
	 */
	static public ECParameterSpec createF2m(int m, int k, BigInteger a,BigInteger b, BigInteger Gx,BigInteger Gy, BigInteger r,BigInteger f)
	{
		ECCurve.F2m curve = new ECCurve.F2m(m,k,a,b,r,f);
		
		org.bouncycastle.jce.spec.ECParameterSpec spec = new org.bouncycastle.jce.spec.ECParameterSpec(curve,curve.createPoint(Gx,Gy, false),r,f);
		
		return EC5Util.convertSpec(EC5Util.convertCurve(curve,spec.getSeed() ),spec);
	}
	/**
	 * 
	 * @brief a little helper method to create the ECParameterSpec more easily for a f2m curve
	 * 
	 * @param m 
	 * @param k1
	 * @param k2
	 * @param k3
	 * @param a first coefficient
	 * @param b second coefficient 
	 * @param Gx x coordinate of base point g
	 * @param Gy y coordinate of base point g
	 * @param r order of point G
	 * @param f cofactor
	 * @return returns a instance of ECParameterSpec
	 */
	static public ECParameterSpec createF2m(int m, int k1, int k2, int k3, BigInteger a,BigInteger b, BigInteger Gx,BigInteger Gy, BigInteger r,BigInteger f)
	{
		ECCurve.F2m curve = new ECCurve.F2m(m,k1,k2,k3,a,b,r,f);
		
		org.bouncycastle.jce.spec.ECParameterSpec spec = new org.bouncycastle.jce.spec.ECParameterSpec(curve,curve.createPoint(Gx,Gy, false),r,f);
		
		return EC5Util.convertSpec(EC5Util.convertCurve(curve,spec.getSeed() ),spec);
	}
	/**
	 * 
	 * @brief a little helper method to create the ECParameterSpec more easily for a f2m curve
	 * 
	 * @param name curve name
	 * @param m 
	 * @param k 
	 * @param a first coefficient
	 * @param b second coefficient 
	 * @param Gx x coordinate of base point g
	 * @param Gy y coordinate of base point g
	 * @param r order of point G
	 * @param f cofactor
	 * @return returns a instance of ECParameterSpec
	 */
	static public ECParameterSpec createF2m(String name,int m, int k, BigInteger a,BigInteger b, BigInteger Gx,BigInteger Gy, BigInteger r,BigInteger f)
	{
		ECCurve.F2m curve = new ECCurve.F2m(m,k,a,b,r,f);
		
		ECNamedCurveSpec spec = new ECNamedCurveSpec(name,curve,curve.createPoint(Gx,Gy, false),r,f);
		
		return spec;
	}
	/**
	 * 
	 * @brief a little helper method to create the ECParameterSpec more easily for a f2m curve
	 * 
	 * @param name curve name
	 * @param m 
	 * @param k1
	 * @param k2
	 * @param k3
	 * @param a first coefficient
	 * @param b second coefficient 
	 * @param Gx x coordinate of base point g
	 * @param Gy y coordinate of base point g
	 * @param r order of point G
	 * @param f cofactor
	 * @return returns a instance of ECParameterSpec
	 */
	static public ECParameterSpec createF2m(String name,int m, int k1, int k2, int k3, BigInteger a,BigInteger b, BigInteger Gx,BigInteger Gy, BigInteger r,BigInteger f)
	{
		ECCurve.F2m curve = new ECCurve.F2m(m,k1,k2,k3,a,b,r,f);
		
		ECNamedCurveSpec spec = new ECNamedCurveSpec(name,curve,curve.createPoint(Gx,Gy, false),r,f);
		
		return spec;
	}
}
