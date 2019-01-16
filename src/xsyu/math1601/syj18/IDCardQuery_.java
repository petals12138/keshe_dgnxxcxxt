package xsyu.math1601.syj18;

public class IDCardQuery_ {
	public boolean legal(char c,int[] b) {
		int sum=0,d,m=0;
	    sum = b[0]*7 + b[1]*9 + b[2]*10 + b[3]*5 + b[4]*8 + b[5]*4 + b[6]*2
	        + b[7]*1 + b[8]*6 + b[9]*3 +b[10]*7 + b[11]*9 + b[12]*10 + b[13]*5
	        + b[14]*8 + b[15]*4 + b[16]*2;
	    d = sum%11;
	    switch(d) {//1 0 X 9 8 7 6 5 4 3 2
	        case 0: if(c=='1') m = 1;break;
	        case 1: if(c=='0') m = 1;break;
	        case 2: if(c=='X'||c=='x') m = 1;break;
	        case 3: if(c=='9') m = 1;break;
	        case 4: if(c=='8') m = 1;break;
	        case 5: if(c=='7') m = 1;break;
	        case 6: if(c=='6') m = 1;break;
	        case 7: if(c=='5') m = 1;break;
	        case 8: if(c=='4') m = 1;break;
	        case 9: if(c=='3') m = 1;break;
	        case 10: if(c=='2') m = 1;break;
	    }
	    if(m!=1||b[6]>2||b[10]>1||b[12]>3) {
	    	return false;
	    }else {
			return true;
		}
	}

	public String getDate(int[] b) {
		String s = new String();
		s = "出生日期："+b[6]+b[7]+b[8]+b[9]+"年"+b[10]+b[11]+"月"+b[12]+b[13]+"日";
		return s;
	}

	public String getAge(int[] b) {
		int sum, age;
		String s = new String();
		sum = b[6]*1000+b[7]*100+b[8]*10+b[9];
		age = 2018 - sum;
		s = "年龄："+age;
		return s;
	}

	public String getConstellation(int[] b) {
		String s = new String();
		int sum;
		sum = b[10]*1000+b[11]*100+b[12]*10+b[13];
		if (sum>=1222||sum<=119) {
			s="星座：摩羯座";
		} else if (sum>=1123) {
			s="星座：射手座";
		} else if (sum>=1024) {
			s="星座：天蝎座";
		} else if (sum>=923) {
			s="星座：天秤座";
		} else if (sum>=823) {
			s="星座：处女座";
		} else if (sum>=723) {
			s="星座：狮子座";
		} else if (sum>=622) {
			s="星座：巨蟹座";
		} else if (sum>=521) {
			s="星座：双子座";
		} else if (sum>=420) {
			s="星座：金牛座";
		} else if (sum>=321) {
			s="星座：白羊座";
		} else if (sum>=219) {
			s="星座：双鱼座";
		} else {
			s="星座：水瓶座";
		} 
		return s;
	}

	public String getZodiac(int[] b) {
		int sum, age, m;
		String s = new String();
		sum = b[6]*1000+b[7]*100+b[8]*10+b[9];
		age = 2018 - sum;
		m = age%12;
		switch (m) {
		case 0:
			s = "犬";
			break;
		case 1:
			s = "鸡";
			break;
		case 2:
			s = "猴";
			break;
		case 3:
			s = "羊";
			break;
		case 4:
			s = "马";
			break;
		case 5:
			s = "蛇";
			break;
		case 6:
			s = "龙";
			break;
		case 7:
			s = "兔";
			break;
		case 8:
			s = "虎";
			break;
		case 9:
			s = "牛";
			break;
		case 10:
			s = "鼠";
			break;
		case 11:
			s = "猪";
			break;
		}
		return "生肖："+s;
	}

	public String getSex(int[] b) {
		String s = new String();
		if(b[16]%2==0) {
			s= "性别：女";
	        return s;
		} else {
	    	s= "性别：男";
	        return s;
		}
	}

	public String getAddress(int[] b) {
		int d;
		String s = new String();
		d = b[0] * 100000 + b[1] * 10000 + b[2] * 1000 + b[3] * 100 + b[4] * 10 + b[5];
		switch (d) {
		case 110000:
			s = "北京市";
			break;
		case 110100:
			s = "北京市市辖区";
			break;
		case 110101:
			s = "北京市东城区";
			break;
		case 110102:
			s = "北京市西城区";
			break;
		case 110103:
			s = "北京市崇文区";
			break;
		case 110104:
			s = "北京市宣武区";
			break;
		case 110105:
			s = "北京市朝阳区";
			break;
		case 110106:
			s = "北京市丰台区";
			break;
		case 110107:
			s = "北京市石景山区";
			break;
		case 110108:
			s = "北京市海淀区";
			break;
		case 110109:
			s = "北京市门头沟区";
			break;
		case 110111:
			s = "北京市房山区";
			break;
		case 110112:
			s = "北京市通州区";
			break;
		case 110113:
			s = "北京市顺义区";
			break;
		case 110114:
			s = "北京市昌平区";
			break;
		case 110115:
			s = "北京市大兴区";
			break;
		case 110116:
			s = "北京市怀柔区";
			break;
		case 110117:
			s = "北京市平谷区";
			break;
		case 110228:
			s = "北京市密云县";
			break;
		case 110229:
			s = "北京市延庆县";
			break;
		case 120000:
			s = "天津市";
			break;
		case 120100:
			s = "天津市市辖区";
			break;
		case 120101:
			s = "天津市和平区";
			break;
		case 120102:
			s = "天津市河东区";
			break;
		case 120103:
			s = "天津市河西区";
			break;
		case 120104:
			s = "天津市南开区";
			break;
		case 120105:
			s = "天津市河北区";
			break;
		case 120106:
			s = "天津市红桥区";
			break;
		case 120107:
			s = "天津市塘沽区";
			break;
		case 120108:
			s = "天津市汉沽区";
			break;
		case 120109:
			s = "天津市大港区";
			break;
		case 120110:
			s = "天津市东丽区";
			break;
		case 120111:
			s = "天津市西青区";
			break;
		case 120112:
			s = "天津市津南区";
			break;
		case 120113:
			s = "天津市北辰区";
			break;
		case 120114:
			s = "天津市武清区";
			break;
		case 120115:
			s = "天津市宝坻区";
			break;
		case 120221:
			s = "天津市宁河县";
			break;
		case 120223:
			s = "天津市静海县";
			break;
		case 120225:
			s = "天津市蓟县";
			break;
		case 130000:
			s = "河北省";
			break;
		case 130100:
			s = "河北省石家庄市";
			break;
		case 130101:
			s = "河北省石家庄市市辖区";
			break;
		case 130102:
			s = "河北省石家庄市长安区";
			break;
		case 130103:
			s = "河北省石家庄市桥东区";
			break;
		case 130104:
			s = "河北省石家庄市桥西区";
			break;
		case 130105:
			s = "河北省石家庄市新华区";
			break;
		case 130107:
			s = "河北省石家庄市井陉矿区";
			break;
		case 130108:
			s = "河北省石家庄市裕华区";
			break;
		case 130121:
			s = "河北省井陉县";
			break;
		case 130123:
			s = "河北省正定县";
			break;
		case 130124:
			s = "河北省栾城县";
			break;
		case 130125:
			s = "河北省行唐县";
			break;
		case 130126:
			s = "河北省灵寿县";
			break;
		case 130127:
			s = "河北省高邑县";
			break;
		case 130128:
			s = "河北省深泽县";
			break;
		case 130129:
			s = "河北省赞皇县";
			break;
		case 130130:
			s = "河北省无极县";
			break;
		case 130131:
			s = "河北省平山县";
			break;
		case 130132:
			s = "河北省元氏县";
			break;
		case 130133:
			s = "河北省赵县";
			break;
		case 130181:
			s = "河北省辛集市";
			break;
		case 130182:
			s = "河北省藁城市";
			break;
		case 130183:
			s = "河北省晋州市";
			break;
		case 130184:
			s = "河北省新乐市";
			break;
		case 130185:
			s = "河北省鹿泉市";
			break;
		case 130200:
			s = "河北省唐山市";
			break;
		case 130201:
			s = "河北省唐山市市辖区";
			break;
		case 130202:
			s = "河北省唐山市路南区";
			break;
		case 130203:
			s = "河北省唐山市路北区";
			break;
		case 130204:
			s = "河北省唐山市古冶区";
			break;
		case 130205:
			s = "河北省唐山市开平区";
			break;
		case 130207:
			s = "河北省唐山市丰南区";
			break;
		case 130208:
			s = "河北省唐山市丰润区";
			break;
		case 130223:
			s = "河北省滦县";
			break;
		case 130224:
			s = "河北省滦南县";
			break;
		case 130225:
			s = "河北省乐亭县";
			break;
		case 130227:
			s = "河北省迁西县";
			break;
		case 130229:
			s = "河北省玉田县";
			break;
		case 130230:
			s = "河北省唐海县";
			break;
		case 130281:
			s = "河北省遵化市";
			break;
		case 130283:
			s = "河北省迁安市";
			break;
		case 130300:
			s = "河北省秦皇岛市";
			break;
		case 130301:
			s = "河北省秦皇岛市市辖区";
			break;
		case 130302:
			s = "河北省秦皇岛市海港区";
			break;
		case 130303:
			s = "河北省秦皇岛市山海关区";
			break;
		case 130304:
			s = "河北省秦皇岛市北戴河区";
			break;
		case 130321:
			s = "河北省青龙满族自治县";
			break;
		case 130322:
			s = "河北省昌黎县";
			break;
		case 130323:
			s = "河北省抚宁县";
			break;
		case 130324:
			s = "河北省卢龙县";
			break;
		case 130400:
			s = "河北省邯郸市";
			break;
		case 130401:
			s = "河北省邯郸市市辖区";
			break;
		case 130402:
			s = "河北省邯郸市邯山区";
			break;
		case 130403:
			s = "河北省邯郸市丛台区";
			break;
		case 130404:
			s = "河北省邯郸市复兴区";
			break;
		case 130406:
			s = "河北省邯郸市峰峰矿区";
			break;
		case 130421:
			s = "河北省邯郸县";
			break;
		case 130423:
			s = "河北省临漳县";
			break;
		case 130424:
			s = "河北省成安县";
			break;
		case 130425:
			s = "河北省大名县";
			break;
		case 130426:
			s = "河北省涉县";
			break;
		case 130427:
			s = "河北省磁县";
			break;
		case 130428:
			s = "河北省肥乡县";
			break;
		case 130429:
			s = "河北省永年县";
			break;
		case 130430:
			s = "河北省邱县";
			break;
		case 130431:
			s = "河北省鸡泽县";
			break;
		case 130432:
			s = "河北省广平县";
			break;
		case 130433:
			s = "河北省馆陶县";
			break;
		case 130434:
			s = "河北省魏县";
			break;
		case 130435:
			s = "河北省曲周县";
			break;
		case 130481:
			s = "河北省武安市";
			break;
		case 130500:
			s = "河北省邢台市";
			break;
		case 130501:
			s = "河北省邢台市市辖区";
			break;
		case 130502:
			s = "河北省邢台市桥东区";
			break;
		case 130503:
			s = "河北省邢台市桥西区";
			break;
		case 130521:
			s = "河北省邢台县";
			break;
		case 130522:
			s = "河北省临城县";
			break;
		case 130523:
			s = "河北省内丘县";
			break;
		case 130524:
			s = "河北省柏乡县";
			break;
		case 130525:
			s = "河北省隆尧县";
			break;
		case 130526:
			s = "河北省任县";
			break;
		case 130527:
			s = "河北省南和县";
			break;
		case 130528:
			s = "河北省宁晋县";
			break;
		case 130529:
			s = "河北省巨鹿县";
			break;
		case 130530:
			s = "河北省新河县";
			break;
		case 130531:
			s = "河北省广宗县";
			break;
		case 130532:
			s = "河北省平乡县";
			break;
		case 130533:
			s = "河北省威县";
			break;
		case 130534:
			s = "河北省清河县";
			break;
		case 130535:
			s = "河北省临西县";
			break;
		case 130581:
			s = "河北省南宫市";
			break;
		case 130582:
			s = "河北省沙河市";
			break;
		case 130600:
			s = "河北省保定市";
			break;
		case 130601:
			s = "河北省保定市市辖区";
			break;
		case 130602:
			s = "河北省保定市新市区";
			break;
		case 130603:
			s = "河北省保定市北市区";
			break;
		case 130604:
			s = "河北省保定市南市区";
			break;
		case 130621:
			s = "河北省满城县";
			break;
		case 130622:
			s = "河北省清苑县";
			break;
		case 130623:
			s = "河北省涞水县";
			break;
		case 130624:
			s = "河北省阜平县";
			break;
		case 130625:
			s = "河北省徐水县";
			break;
		case 130626:
			s = "河北省定兴县";
			break;
		case 130627:
			s = "河北省唐县";
			break;
		case 130628:
			s = "河北省高阳县";
			break;
		case 130629:
			s = "河北省容城县";
			break;
		case 130630:
			s = "河北省涞源县";
			break;
		case 130631:
			s = "河北省望都县";
			break;
		case 130632:
			s = "河北省安新县";
			break;
		case 130633:
			s = "河北省易县";
			break;
		case 130634:
			s = "河北省曲阳县";
			break;
		case 130635:
			s = "河北省蠡县";
			break;
		case 130636:
			s = "河北省顺平县";
			break;
		case 130637:
			s = "河北省博野县";
			break;
		case 130638:
			s = "河北省雄县";
			break;
		case 130681:
			s = "河北省涿州市";
			break;
		case 130682:
			s = "河北省定州市";
			break;
		case 130683:
			s = "河北省安国市";
			break;
		case 130684:
			s = "河北省高碑店市";
			break;
		case 130700:
			s = "河北省张家口市";
			break;
		case 130701:
			s = "河北省张家口市市辖区";
			break;
		case 130702:
			s = "河北省张家口市桥东区";
			break;
		case 130703:
			s = "河北省张家口市桥西区";
			break;
		case 130705:
			s = "河北省张家口市宣化区";
			break;
		case 130706:
			s = "河北省张家口市下花园区";
			break;
		case 130721:
			s = "河北省宣化县";
			break;
		case 130722:
			s = "河北省张北县";
			break;
		case 130723:
			s = "河北省康保县";
			break;
		case 130724:
			s = "河北省沽源县";
			break;
		case 130725:
			s = "河北省尚义县";
			break;
		case 130726:
			s = "河北省蔚县";
			break;
		case 130727:
			s = "河北省阳原县";
			break;
		case 130728:
			s = "河北省怀安县";
			break;
		case 130729:
			s = "河北省万全县";
			break;
		case 130730:
			s = "河北省怀来县";
			break;
		case 130731:
			s = "河北省涿鹿县";
			break;
		case 130732:
			s = "河北省赤城县";
			break;
		case 130733:
			s = "河北省崇礼县";
			break;
		case 130800:
			s = "河北省承德市";
			break;
		case 130801:
			s = "河北省承德市市辖区";
			break;
		case 130802:
			s = "河北省承德市双桥区";
			break;
		case 130803:
			s = "河北省承德市双滦区";
			break;
		case 130804:
			s = "河北省承德市鹰手营子矿区";
			break;
		case 130821:
			s = "河北省承德县";
			break;
		case 130822:
			s = "河北省兴隆县";
			break;
		case 130823:
			s = "河北省平泉县";
			break;
		case 130824:
			s = "河北省滦平县";
			break;
		case 130825:
			s = "河北省隆化县";
			break;
		case 130826:
			s = "河北省丰宁满族自治县";
			break;
		case 130827:
			s = "河北省宽城满族自治县";
			break;
		case 130828:
			s = "河北省围场满族蒙古族自治县";
			break;
		case 130900:
			s = "河北省沧州市";
			break;
		case 130901:
			s = "河北省沧州市市辖区";
			break;
		case 130902:
			s = "河北省沧州市新华区";
			break;
		case 130903:
			s = "河北省沧州市运河区";
			break;
		case 130921:
			s = "河北省沧县";
			break;
		case 130922:
			s = "河北省青县";
			break;
		case 130923:
			s = "河北省东光县";
			break;
		case 130924:
			s = "河北省海兴县";
			break;
		case 130925:
			s = "河北省盐山县";
			break;
		case 130926:
			s = "河北省肃宁县";
			break;
		case 130927:
			s = "河北省南皮县";
			break;
		case 130928:
			s = "河北省吴桥县";
			break;
		case 130929:
			s = "河北省献县";
			break;
		case 130930:
			s = "河北省孟村回族自治县";
			break;
		case 130981:
			s = "河北省泊头市";
			break;
		case 130982:
			s = "河北省任丘市";
			break;
		case 130983:
			s = "河北省黄骅市";
			break;
		case 130984:
			s = "河北省河间市";
			break;
		case 131000:
			s = "河北省廊坊市";
			break;
		case 131001:
			s = "河北省廊坊市市辖区";
			break;
		case 131002:
			s = "河北省廊坊市安次区";
			break;
		case 131003:
			s = "河北省廊坊市广阳区";
			break;
		case 131022:
			s = "河北省固安县";
			break;
		case 131023:
			s = "河北省永清县";
			break;
		case 131024:
			s = "河北省香河县";
			break;
		case 131025:
			s = "河北省大城县";
			break;
		case 131026:
			s = "河北省文安县";
			break;
		case 131028:
			s = "河北省大厂回族自治县";
			break;
		case 131081:
			s = "河北省霸州市";
			break;
		case 131082:
			s = "河北省三河市";
			break;
		case 131100:
			s = "河北省衡水市";
			break;
		case 131101:
			s = "河北省衡水市市辖区";
			break;
		case 131102:
			s = "河北省衡水市桃城区";
			break;
		case 131121:
			s = "河北省枣强县";
			break;
		case 131122:
			s = "河北省武邑县";
			break;
		case 131123:
			s = "河北省武强县";
			break;
		case 131124:
			s = "河北省饶阳县";
			break;
		case 131125:
			s = "河北省安平县";
			break;
		case 131126:
			s = "河北省故城县";
			break;
		case 131127:
			s = "河北省景县";
			break;
		case 131128:
			s = "河北省阜城县";
			break;
		case 131181:
			s = "河北省冀州市";
			break;
		case 131182:
			s = "河北省深州市";
			break;
		case 140000:
			s = "山西省";
			break;
		case 140100:
			s = "山西省太原市";
			break;
		case 140101:
			s = "山西省太原市市辖区";
			break;
		case 140105:
			s = "山西省太原市小店区";
			break;
		case 140106:
			s = "山西省太原市迎泽区";
			break;
		case 140107:
			s = "山西省太原市杏花岭区";
			break;
		case 140108:
			s = "山西省太原市尖草坪区";
			break;
		case 140109:
			s = "山西省太原市万柏林区";
			break;
		case 140110:
			s = "山西省太原市晋源区";
			break;
		case 140121:
			s = "山西省清徐县";
			break;
		case 140122:
			s = "山西省阳曲县";
			break;
		case 140123:
			s = "山西省娄烦县";
			break;
		case 140181:
			s = "山西省古交市";
			break;
		case 140200:
			s = "山西省大同市";
			break;
		case 140201:
			s = "山西省大同市市辖区";
			break;
		case 140202:
			s = "山西省大同市城区";
			break;
		case 140203:
			s = "山西省大同市矿区";
			break;
		case 140211:
			s = "山西省大同市南郊区";
			break;
		case 140212:
			s = "山西省大同市新荣区";
			break;
		case 140221:
			s = "山西省阳高县";
			break;
		case 140222:
			s = "山西省天镇县";
			break;
		case 140223:
			s = "山西省广灵县";
			break;
		case 140224:
			s = "山西省灵丘县";
			break;
		case 140225:
			s = "山西省浑源县";
			break;
		case 140226:
			s = "山西省左云县";
			break;
		case 140227:
			s = "山西省大同县";
			break;
		case 140300:
			s = "山西省阳泉市";
			break;
		case 140301:
			s = "山西省阳泉市市辖区";
			break;
		case 140302:
			s = "山西省阳泉市城区";
			break;
		case 140303:
			s = "山西省阳泉市矿区";
			break;
		case 140311:
			s = "山西省阳泉市郊区";
			break;
		case 140321:
			s = "山西省平定县";
			break;
		case 140322:
			s = "山西省盂县";
			break;
		case 140400:
			s = "山西省长治市";
			break;
		case 140401:
			s = "山西省长治市市辖区";
			break;
		case 140402:
			s = "山西省长治市城区";
			break;
		case 140411:
			s = "山西省长治市郊区";
			break;
		case 140421:
			s = "山西省长治县";
			break;
		case 140423:
			s = "山西省襄垣县";
			break;
		case 140424:
			s = "山西省屯留县";
			break;
		case 140425:
			s = "山西省平顺县";
			break;
		case 140426:
			s = "山西省黎城县";
			break;
		case 140427:
			s = "山西省壶关县";
			break;
		case 140428:
			s = "山西省长子县";
			break;
		case 140429:
			s = "山西省武乡县";
			break;
		case 140430:
			s = "山西省沁县";
			break;
		case 140431:
			s = "山西省沁源县";
			break;
		case 140481:
			s = "山西省潞城市";
			break;
		case 140500:
			s = "山西省晋城市";
			break;
		case 140501:
			s = "山西省晋城市市辖区";
			break;
		case 140502:
			s = "山西省晋城市城　区";
			break;
		case 140521:
			s = "山西省沁水县";
			break;
		case 140522:
			s = "山西省阳城县";
			break;
		case 140524:
			s = "山西省陵川县";
			break;
		case 140525:
			s = "山西省泽州县";
			break;
		case 140581:
			s = "山西省高平市";
			break;
		case 140600:
			s = "山西省朔州市";
			break;
		case 140601:
			s = "山西省朔州市市辖区";
			break;
		case 140602:
			s = "山西省朔州市朔城区";
			break;
		case 140603:
			s = "山西省朔州市平鲁区";
			break;
		case 140621:
			s = "山西省山阴县";
			break;
		case 140622:
			s = "山西省应县";
			break;
		case 140623:
			s = "山西省右玉县";
			break;
		case 140624:
			s = "山西省怀仁县";
			break;
		case 140700:
			s = "山西省晋中市";
			break;
		case 140701:
			s = "山西省晋中市市辖区";
			break;
		case 140702:
			s = "山西省晋中市榆次区";
			break;
		case 140721:
			s = "山西省榆社县";
			break;
		case 140722:
			s = "山西省左权县";
			break;
		case 140723:
			s = "山西省和顺县";
			break;
		case 140724:
			s = "山西省昔阳县";
			break;
		case 140725:
			s = "山西省寿阳县";
			break;
		case 140726:
			s = "山西省太谷县";
			break;
		case 140727:
			s = "山西省祁县";
			break;
		case 140728:
			s = "山西省平遥县";
			break;
		case 140729:
			s = "山西省灵石县";
			break;
		case 140781:
			s = "山西省介休市";
			break;
		case 140800:
			s = "山西省运城市";
			break;
		case 140801:
			s = "山西省运城市市辖区";
			break;
		case 140802:
			s = "山西省运城市盐湖区";
			break;
		case 140821:
			s = "山西省临猗县";
			break;
		case 140822:
			s = "山西省万荣县";
			break;
		case 140823:
			s = "山西省闻喜县";
			break;
		case 140824:
			s = "山西省稷山县";
			break;
		case 140825:
			s = "山西省新绛县";
			break;
		case 140826:
			s = "山西省绛县";
			break;
		case 140827:
			s = "山西省垣曲县";
			break;
		case 140828:
			s = "山西省夏县";
			break;
		case 140829:
			s = "山西省平陆县";
			break;
		case 140830:
			s = "山西省芮城县";
			break;
		case 140881:
			s = "山西省永济市";
			break;
		case 140882:
			s = "山西省河津市";
			break;
		case 140900:
			s = "山西省忻州市";
			break;
		case 140901:
			s = "山西省忻州市市辖区";
			break;
		case 140902:
			s = "山西省忻州市忻府区";
			break;
		case 140921:
			s = "山西省定襄县";
			break;
		case 140922:
			s = "山西省五台县";
			break;
		case 140923:
			s = "山西省代县";
			break;
		case 140924:
			s = "山西省繁峙县";
			break;
		case 140925:
			s = "山西省宁武县";
			break;
		case 140926:
			s = "山西省静乐县";
			break;
		case 140927:
			s = "山西省神池县";
			break;
		case 140928:
			s = "山西省五寨县";
			break;
		case 140929:
			s = "山西省岢岚县";
			break;
		case 140930:
			s = "山西省河曲县";
			break;
		case 140931:
			s = "山西省保德县";
			break;
		case 140932:
			s = "山西省偏关县";
			break;
		case 140981:
			s = "山西省原平市";
			break;
		case 141000:
			s = "山西省临汾市";
			break;
		case 141001:
			s = "山西省临汾市市辖区";
			break;
		case 141002:
			s = "山西省临汾市尧都区";
			break;
		case 141021:
			s = "山西省曲沃县";
			break;
		case 141022:
			s = "山西省翼城县";
			break;
		case 141023:
			s = "山西省襄汾县";
			break;
		case 141024:
			s = "山西省洪洞县";
			break;
		case 141025:
			s = "山西省古县";
			break;
		case 141026:
			s = "山西省安泽县";
			break;
		case 141027:
			s = "山西省浮山县";
			break;
		case 141028:
			s = "山西省吉县";
			break;
		case 141029:
			s = "山西省乡宁县";
			break;
		case 141030:
			s = "山西省大宁县";
			break;
		case 141031:
			s = "山西省隰县";
			break;
		case 141032:
			s = "山西省永和县";
			break;
		case 141033:
			s = "山西省蒲县";
			break;
		case 141034:
			s = "山西省汾西县";
			break;
		case 141081:
			s = "山西省侯马市";
			break;
		case 141082:
			s = "山西省霍州市";
			break;
		case 141100:
			s = "山西省吕梁市";
			break;
		case 141101:
			s = "山西省吕梁市市辖区";
			break;
		case 141102:
			s = "山西省吕梁市离石区";
			break;
		case 141121:
			s = "山西省文水县";
			break;
		case 141122:
			s = "山西省交城县";
			break;
		case 141123:
			s = "山西省兴县";
			break;
		case 141124:
			s = "山西省临县";
			break;
		case 141125:
			s = "山西省柳林县";
			break;
		case 141126:
			s = "山西省石楼县";
			break;
		case 141127:
			s = "山西省岚县";
			break;
		case 141128:
			s = "山西省方山县";
			break;
		case 141129:
			s = "山西省中阳县";
			break;
		case 141130:
			s = "山西省交口县";
			break;
		case 141181:
			s = "山西省孝义市";
			break;
		case 141182:
			s = "山西省汾阳市";
			break;
		case 150000:
			s = "内蒙古自治区";
			break;
		case 150100:
			s = "内蒙古呼和浩特市";
			break;
		case 150101:
			s = "内蒙古呼和浩特市市辖区";
			break;
		case 150102:
			s = "内蒙古呼和浩特市新城区";
			break;
		case 150103:
			s = "内蒙古呼和浩特市回民区";
			break;
		case 150104:
			s = "内蒙古呼和浩特市玉泉区";
			break;
		case 150105:
			s = "内蒙古呼和浩特市赛罕区";
			break;
		case 150121:
			s = "内蒙古土默特左旗";
			break;
		case 150122:
			s = "内蒙古托克托县";
			break;
		case 150123:
			s = "内蒙古和林格尔县";
			break;
		case 150124:
			s = "内蒙古清水河县";
			break;
		case 150125:
			s = "内蒙古武川县";
			break;
		case 150200:
			s = "内蒙古包头市";
			break;
		case 150201:
			s = "内蒙古包头市市辖区";
			break;
		case 150202:
			s = "内蒙古包头市东河区";
			break;
		case 150203:
			s = "内蒙古包头市昆都仑区";
			break;
		case 150204:
			s = "内蒙古包头市青山区";
			break;
		case 150205:
			s = "内蒙古包头市石拐区";
			break;
		case 150206:
			s = "内蒙古包头市白云鄂博矿区";
			break;
		case 150207:
			s = "内蒙古包头市九原区";
			break;
		case 150221:
			s = "内蒙古土默特右旗";
			break;
		case 150222:
			s = "内蒙古固阳县";
			break;
		case 150223:
			s = "内蒙古达尔罕茂明安联合旗";
			break;
		case 150300:
			s = "内蒙古乌海市";
			break;
		case 150301:
			s = "内蒙古乌海市市辖区";
			break;
		case 150302:
			s = "内蒙古乌海市海勃湾区";
			break;
		case 150303:
			s = "内蒙古乌海市海南区";
			break;
		case 150304:
			s = "内蒙古乌海市乌达区";
			break;
		case 150400:
			s = "内蒙古赤峰市";
			break;
		case 150401:
			s = "内蒙古赤峰市市辖区";
			break;
		case 150402:
			s = "内蒙古赤峰市红山区";
			break;
		case 150403:
			s = "内蒙古赤峰市元宝山区";
			break;
		case 150404:
			s = "内蒙古赤峰市松山区";
			break;
		case 150421:
			s = "内蒙古阿鲁科尔沁旗";
			break;
		case 150422:
			s = "内蒙古巴林左旗";
			break;
		case 150423:
			s = "内蒙古巴林右旗";
			break;
		case 150424:
			s = "内蒙古林西县";
			break;
		case 150425:
			s = "内蒙古克什克腾旗";
			break;
		case 150426:
			s = "内蒙古翁牛特旗";
			break;
		case 150428:
			s = "内蒙古喀喇沁旗";
			break;
		case 150429:
			s = "内蒙古宁城县";
			break;
		case 150430:
			s = "内蒙古敖汉旗";
			break;
		case 150500:
			s = "内蒙古通辽市";
			break;
		case 150501:
			s = "内蒙古通辽市市辖区";
			break;
		case 150502:
			s = "内蒙古通辽市科尔沁区";
			break;
		case 150521:
			s = "内蒙古科尔沁左翼中旗";
			break;
		case 150522:
			s = "内蒙古科尔沁左翼后旗";
			break;
		case 150523:
			s = "内蒙古开鲁县";
			break;
		case 150524:
			s = "内蒙古库伦旗";
			break;
		case 150525:
			s = "内蒙古奈曼旗";
			break;
		case 150526:
			s = "内蒙古扎鲁特旗";
			break;
		case 150581:
			s = "内蒙古霍林郭勒市";
			break;
		case 150600:
			s = "内蒙古鄂尔多斯市";
			break;
		case 150601:
			s = "内蒙古鄂尔多斯市市辖区";
			break;
		case 150602:
			s = "内蒙古鄂尔多斯市东胜区";
			break;
		case 150621:
			s = "内蒙古达拉特旗";
			break;
		case 150622:
			s = "内蒙古准格尔旗";
			break;
		case 150623:
			s = "内蒙古鄂托克前旗";
			break;
		case 150624:
			s = "内蒙古鄂托克旗";
			break;
		case 150625:
			s = "内蒙古杭锦旗";
			break;
		case 150626:
			s = "内蒙古乌审旗";
			break;
		case 150627:
			s = "内蒙古伊金霍洛旗";
			break;
		case 150700:
			s = "内蒙古呼伦贝尔市";
			break;
		case 150701:
			s = "内蒙古呼伦贝尔市市辖区";
			break;
		case 150702:
			s = "内蒙古呼伦贝尔市海拉尔区";
			break;
		case 150721:
			s = "内蒙古阿荣旗";
			break;
		case 150722:
			s = "内蒙古莫力达瓦达斡尔族自治旗";
			break;
		case 150723:
			s = "内蒙古鄂伦春自治旗";
			break;
		case 150724:
			s = "内蒙古鄂温克族自治旗";
			break;
		case 150725:
			s = "内蒙古陈巴尔虎旗";
			break;
		case 150726:
			s = "内蒙古新巴尔虎左旗";
			break;
		case 150727:
			s = "内蒙古新巴尔虎右旗";
			break;
		case 150781:
			s = "内蒙古满洲里市";
			break;
		case 150782:
			s = "内蒙古牙克石市";
			break;
		case 150783:
			s = "内蒙古扎兰屯市";
			break;
		case 150784:
			s = "内蒙古额尔古纳市";
			break;
		case 150785:
			s = "内蒙古根河市";
			break;
		case 150800:
			s = "内蒙古巴彦淖尔市";
			break;
		case 150801:
			s = "内蒙古巴彦淖尔市市辖区";
			break;
		case 150802:
			s = "内蒙古巴彦淖尔市临河区";
			break;
		case 150821:
			s = "内蒙古五原县";
			break;
		case 150822:
			s = "内蒙古磴口县";
			break;
		case 150823:
			s = "内蒙古乌拉特前旗";
			break;
		case 150824:
			s = "内蒙古乌拉特中旗";
			break;
		case 150825:
			s = "内蒙古乌拉特后旗";
			break;
		case 150826:
			s = "内蒙古杭锦后旗";
			break;
		case 150900:
			s = "内蒙古乌兰察布市";
			break;
		case 150901:
			s = "内蒙古乌兰察布市市辖区";
			break;
		case 150902:
			s = "内蒙古乌兰察布市集宁区";
			break;
		case 150921:
			s = "内蒙古卓资县";
			break;
		case 150922:
			s = "内蒙古化德县";
			break;
		case 150923:
			s = "内蒙古商都县";
			break;
		case 150924:
			s = "内蒙古兴和县";
			break;
		case 150925:
			s = "内蒙古凉城县";
			break;
		case 150926:
			s = "内蒙古察哈尔右翼前旗";
			break;
		case 150927:
			s = "内蒙古察哈尔右翼中旗";
			break;
		case 150928:
			s = "内蒙古察哈尔右翼后旗";
			break;
		case 150929:
			s = "内蒙古四子王旗";
			break;
		case 150981:
			s = "内蒙古丰镇市";
			break;
		case 152200:
			s = "内蒙古兴安盟";
			break;
		case 152201:
			s = "内蒙古乌兰浩特市";
			break;
		case 152202:
			s = "内蒙古阿尔山市";
			break;
		case 152221:
			s = "内蒙古科尔沁右翼前旗";
			break;
		case 152222:
			s = "内蒙古科尔沁右翼中旗";
			break;
		case 152223:
			s = "内蒙古扎赉特旗";
			break;
		case 152224:
			s = "内蒙古突泉县";
			break;
		case 152500:
			s = "内蒙古锡林郭勒盟";
			break;
		case 152501:
			s = "内蒙古二连浩特市";
			break;
		case 152502:
			s = "内蒙古锡林浩特市";
			break;
		case 152522:
			s = "内蒙古阿巴嘎旗";
			break;
		case 152523:
			s = "内蒙古苏尼特左旗";
			break;
		case 152524:
			s = "内蒙古苏尼特右旗";
			break;
		case 152525:
			s = "内蒙古东乌珠穆沁旗";
			break;
		case 152526:
			s = "内蒙古西乌珠穆沁旗";
			break;
		case 152527:
			s = "内蒙古太仆寺旗";
			break;
		case 152528:
			s = "内蒙古镶黄旗";
			break;
		case 152529:
			s = "内蒙古正镶白旗";
			break;
		case 152530:
			s = "内蒙古正蓝旗";
			break;
		case 152531:
			s = "内蒙古多伦县";
			break;
		case 152900:
			s = "内蒙古阿拉善盟";
			break;
		case 152921:
			s = "内蒙古阿拉善左旗";
			break;
		case 152922:
			s = "内蒙古阿拉善右旗";
			break;
		case 152923:
			s = "内蒙古额济纳旗";
			break;
		case 210000:
			s = "辽宁省";
			break;
		case 210100:
			s = "辽宁省沈阳市";
			break;
		case 210101:
			s = "辽宁省沈阳市市辖区";
			break;
		case 210102:
			s = "辽宁省沈阳市和平区";
			break;
		case 210103:
			s = "辽宁省沈阳市沈河区";
			break;
		case 210104:
			s = "辽宁省沈阳市大东区";
			break;
		case 210105:
			s = "辽宁省沈阳市皇姑区";
			break;
		case 210106:
			s = "辽宁省沈阳市铁西区";
			break;
		case 210111:
			s = "辽宁省沈阳市苏家屯区";
			break;
		case 210112:
			s = "辽宁省沈阳市东陵区";
			break;
		case 210113:
			s = "辽宁省沈阳市沈北新区";
			break;
		case 210114:
			s = "辽宁省沈阳市于洪区";
			break;
		case 210122:
			s = "辽宁省辽中县";
			break;
		case 210123:
			s = "辽宁省康平县";
			break;
		case 210124:
			s = "辽宁省法库县";
			break;
		case 210181:
			s = "辽宁省新民市";
			break;
		case 210200:
			s = "辽宁省大连市";
			break;
		case 210201:
			s = "辽宁省大连市市辖区";
			break;
		case 210202:
			s = "辽宁省大连市中山区";
			break;
		case 210203:
			s = "辽宁省大连市西岗区";
			break;
		case 210204:
			s = "辽宁省大连市沙河口区";
			break;
		case 210211:
			s = "辽宁省大连市甘井子区";
			break;
		case 210212:
			s = "辽宁省大连市旅顺口区";
			break;
		case 210213:
			s = "辽宁省大连市金州区";
			break;
		case 210224:
			s = "辽宁省长海县";
			break;
		case 210281:
			s = "辽宁省瓦房店市";
			break;
		case 210282:
			s = "辽宁省普兰店市";
			break;
		case 210283:
			s = "辽宁省庄河市";
			break;
		case 210300:
			s = "辽宁省鞍山市";
			break;
		case 210301:
			s = "辽宁省鞍山市市辖区";
			break;
		case 210302:
			s = "辽宁省鞍山市铁东区";
			break;
		case 210303:
			s = "辽宁省鞍山市铁西区";
			break;
		case 210304:
			s = "辽宁省鞍山市立山区";
			break;
		case 210311:
			s = "辽宁省鞍山市千山区";
			break;
		case 210321:
			s = "辽宁省台安县";
			break;
		case 210323:
			s = "辽宁省岫岩满族自治县";
			break;
		case 210381:
			s = "辽宁省海城市";
			break;
		case 210400:
			s = "辽宁省抚顺市";
			break;
		case 210401:
			s = "辽宁省抚顺市市辖区";
			break;
		case 210402:
			s = "辽宁省抚顺市新抚区";
			break;
		case 210403:
			s = "辽宁省抚顺市东洲区";
			break;
		case 210404:
			s = "辽宁省抚顺市望花区";
			break;
		case 210411:
			s = "辽宁省抚顺市顺城区";
			break;
		case 210421:
			s = "辽宁省抚顺县";
			break;
		case 210422:
			s = "辽宁省新宾满族自治县";
			break;
		case 210423:
			s = "辽宁省清原满族自治县";
			break;
		case 210500:
			s = "辽宁省本溪市";
			break;
		case 210501:
			s = "辽宁省本溪市市辖区";
			break;
		case 210502:
			s = "辽宁省本溪市平山区";
			break;
		case 210503:
			s = "辽宁省本溪市溪湖区";
			break;
		case 210504:
			s = "辽宁省本溪市明山区";
			break;
		case 210505:
			s = "辽宁省本溪市南芬区";
			break;
		case 210521:
			s = "辽宁省本溪满族自治县";
			break;
		case 210522:
			s = "辽宁省桓仁满族自治县";
			break;
		case 210600:
			s = "辽宁省丹东市";
			break;
		case 210601:
			s = "辽宁省丹东市市辖区";
			break;
		case 210602:
			s = "辽宁省丹东市元宝区";
			break;
		case 210603:
			s = "辽宁省丹东市振兴区";
			break;
		case 210604:
			s = "辽宁省丹东市振安区";
			break;
		case 210624:
			s = "辽宁省宽甸满族自治县";
			break;
		case 210681:
			s = "辽宁省东港市";
			break;
		case 210682:
			s = "辽宁省凤城市";
			break;
		case 210700:
			s = "辽宁省锦州市";
			break;
		case 210701:
			s = "辽宁省锦州市市辖区";
			break;
		case 210702:
			s = "辽宁省锦州市古塔区";
			break;
		case 210703:
			s = "辽宁省锦州市凌河区";
			break;
		case 210711:
			s = "辽宁省锦州市太和区";
			break;
		case 210726:
			s = "辽宁省黑山县";
			break;
		case 210727:
			s = "辽宁省义县";
			break;
		case 210781:
			s = "辽宁省凌海市";
			break;
		case 210782:
			s = "辽宁省北镇市";
			break;
		case 210800:
			s = "辽宁省营口市";
			break;
		case 210801:
			s = "辽宁省营口市市辖区";
			break;
		case 210802:
			s = "辽宁省营口市站前区";
			break;
		case 210803:
			s = "辽宁省营口市西市区";
			break;
		case 210804:
			s = "辽宁省营口市鲅鱼圈区";
			break;
		case 210811:
			s = "辽宁省营口市老边区";
			break;
		case 210881:
			s = "辽宁省盖州市";
			break;
		case 210882:
			s = "辽宁省大石桥市";
			break;
		case 210900:
			s = "辽宁省阜新市";
			break;
		case 210901:
			s = "辽宁省阜新市市辖区";
			break;
		case 210902:
			s = "辽宁省阜新市海州区";
			break;
		case 210903:
			s = "辽宁省阜新市新邱区";
			break;
		case 210904:
			s = "辽宁省阜新市太平区";
			break;
		case 210905:
			s = "辽宁省阜新市清河门区";
			break;
		case 210911:
			s = "辽宁省阜新市细河区";
			break;
		case 210921:
			s = "辽宁省阜新蒙古族自治县";
			break;
		case 210922:
			s = "辽宁省彰武县";
			break;
		case 211000:
			s = "辽宁省辽阳市";
			break;
		case 211001:
			s = "辽宁省辽阳市市辖区";
			break;
		case 211002:
			s = "辽宁省辽阳市白塔区";
			break;
		case 211003:
			s = "辽宁省辽阳市文圣区";
			break;
		case 211004:
			s = "辽宁省辽阳市宏伟区";
			break;
		case 211005:
			s = "辽宁省辽阳市弓长岭区";
			break;
		case 211011:
			s = "辽宁省辽阳市太子河区";
			break;
		case 211021:
			s = "辽宁省辽阳县";
			break;
		case 211081:
			s = "辽宁省灯塔市";
			break;
		case 211100:
			s = "辽宁省盘锦市";
			break;
		case 211101:
			s = "辽宁省盘锦市市辖区";
			break;
		case 211102:
			s = "辽宁省盘锦市双台子区";
			break;
		case 211103:
			s = "辽宁省盘锦市兴隆台区";
			break;
		case 211121:
			s = "辽宁省大洼县";
			break;
		case 211122:
			s = "辽宁省盘山县";
			break;
		case 211200:
			s = "辽宁省铁岭市";
			break;
		case 211201:
			s = "辽宁省铁岭市市辖区";
			break;
		case 211202:
			s = "辽宁省铁岭市银州区";
			break;
		case 211204:
			s = "辽宁省铁岭市清河区";
			break;
		case 211221:
			s = "辽宁省铁岭县";
			break;
		case 211223:
			s = "辽宁省西丰县";
			break;
		case 211224:
			s = "辽宁省昌图县";
			break;
		case 211281:
			s = "辽宁省调兵山市";
			break;
		case 211282:
			s = "辽宁省开原市";
			break;
		case 211300:
			s = "辽宁省朝阳市";
			break;
		case 211301:
			s = "辽宁省朝阳市市辖区";
			break;
		case 211302:
			s = "辽宁省朝阳市双塔区";
			break;
		case 211303:
			s = "辽宁省朝阳市龙城区";
			break;
		case 211321:
			s = "辽宁省朝阳县";
			break;
		case 211322:
			s = "辽宁省建平县";
			break;
		case 211324:
			s = "辽宁省喀喇沁左翼蒙古族自治县";
			break;
		case 211381:
			s = "辽宁省北票市";
			break;
		case 211382:
			s = "辽宁省凌源市";
			break;
		case 211400:
			s = "辽宁省葫芦岛市";
			break;
		case 211401:
			s = "辽宁省葫芦岛市市辖区";
			break;
		case 211402:
			s = "辽宁省葫芦岛市连山区";
			break;
		case 211403:
			s = "辽宁省葫芦岛市龙港区";
			break;
		case 211404:
			s = "辽宁省葫芦岛市南票区";
			break;
		case 211421:
			s = "辽宁省绥中县";
			break;
		case 211422:
			s = "辽宁省建昌县";
			break;
		case 211481:
			s = "辽宁省兴城市";
			break;
		case 220000:
			s = "吉林省";
			break;
		case 220100:
			s = "吉林省长春市";
			break;
		case 220101:
			s = "吉林省长春市市辖区";
			break;
		case 220102:
			s = "吉林省长春市南关区";
			break;
		case 220103:
			s = "吉林省长春市宽城区";
			break;
		case 220104:
			s = "吉林省长春市朝阳区";
			break;
		case 220105:
			s = "吉林省长春市二道区";
			break;
		case 220106:
			s = "吉林省长春市绿园区";
			break;
		case 220112:
			s = "吉林省长春市双阳区";
			break;
		case 220122:
			s = "吉林省农安县";
			break;
		case 220181:
			s = "吉林省九台市";
			break;
		case 220182:
			s = "吉林省榆树市";
			break;
		case 220183:
			s = "吉林省德惠市";
			break;
		case 220200:
			s = "吉林省吉林市";
			break;
		case 220201:
			s = "吉林省吉林市市辖区";
			break;
		case 220202:
			s = "吉林省吉林市昌邑区";
			break;
		case 220203:
			s = "吉林省吉林市龙潭区";
			break;
		case 220204:
			s = "吉林省吉林市船营区";
			break;
		case 220211:
			s = "吉林省吉林市丰满区";
			break;
		case 220221:
			s = "吉林省永吉县";
			break;
		case 220281:
			s = "吉林省蛟河市";
			break;
		case 220282:
			s = "吉林省桦甸市";
			break;
		case 220283:
			s = "吉林省舒兰市";
			break;
		case 220284:
			s = "吉林省磐石市";
			break;
		case 220300:
			s = "吉林省四平市";
			break;
		case 220301:
			s = "吉林省四平市市辖区";
			break;
		case 220302:
			s = "吉林省四平市铁西区";
			break;
		case 220303:
			s = "吉林省四平市铁东区";
			break;
		case 220322:
			s = "吉林省梨树县";
			break;
		case 220323:
			s = "吉林省伊通满族自治县";
			break;
		case 220381:
			s = "吉林省公主岭市";
			break;
		case 220382:
			s = "吉林省双辽市";
			break;
		case 220400:
			s = "吉林省辽源市";
			break;
		case 220401:
			s = "吉林省辽源市市辖区";
			break;
		case 220402:
			s = "吉林省辽源市龙山区";
			break;
		case 220403:
			s = "吉林省辽源市西安区";
			break;
		case 220421:
			s = "吉林省东丰县";
			break;
		case 220422:
			s = "吉林省东辽县";
			break;
		case 220500:
			s = "吉林省通化市";
			break;
		case 220501:
			s = "吉林省辽源市市辖区";
			break;
		case 220502:
			s = "吉林省辽源市东昌区";
			break;
		case 220503:
			s = "吉林省辽源市二道江区";
			break;
		case 220521:
			s = "吉林省通化县";
			break;
		case 220523:
			s = "吉林省辉南县";
			break;
		case 220524:
			s = "吉林省柳河县";
			break;
		case 220581:
			s = "吉林省梅河口市";
			break;
		case 220582:
			s = "吉林省集安市";
			break;
		case 220600:
			s = "吉林省白山市";
			break;
		case 220601:
			s = "吉林省白山市市辖区";
			break;
		case 220602:
			s = "吉林省白山市八道江区";
			break;
		case 220605:
			s = "吉林省白山市江源区";
			break;
		case 220621:
			s = "吉林省抚松县";
			break;
		case 220622:
			s = "吉林省靖宇县";
			break;
		case 220623:
			s = "吉林省长白朝鲜族自治县";
			break;
		case 220681:
			s = "吉林省临江市";
			break;
		case 220700:
			s = "吉林省松原市";
			break;
		case 220701:
			s = "吉林省松原市市辖区";
			break;
		case 220702:
			s = "吉林省松原市宁江区";
			break;
		case 220721:
			s = "吉林省前郭尔罗斯蒙古族自治县";
			break;
		case 220722:
			s = "吉林省长岭县";
			break;
		case 220723:
			s = "吉林省乾安县";
			break;
		case 220724:
			s = "吉林省扶余县";
			break;
		case 220800:
			s = "吉林省白城市";
			break;
		case 220801:
			s = "吉林省白城市市辖区";
			break;
		case 220802:
			s = "吉林省白城市洮北区";
			break;
		case 220821:
			s = "吉林省镇赉县";
			break;
		case 220822:
			s = "吉林省通榆县";
			break;
		case 220881:
			s = "吉林省洮南市";
			break;
		case 220882:
			s = "吉林省大安市";
			break;
		case 222400:
			s = "吉林省延边朝鲜族自治州";
			break;
		case 222401:
			s = "吉林省延吉市";
			break;
		case 222402:
			s = "吉林省图们市";
			break;
		case 222403:
			s = "吉林省敦化市";
			break;
		case 222404:
			s = "吉林省珲春市";
			break;
		case 222405:
			s = "吉林省龙井市";
			break;
		case 222406:
			s = "吉林省和龙市";
			break;
		case 222424:
			s = "吉林省汪清县";
			break;
		case 222426:
			s = "吉林省安图县";
			break;
		case 230000:
			s = "黑龙江省";
			break;
		case 230101:
			s = "黑龙江省哈尔滨市市辖区";
			break;
		case 230102:
			s = "黑龙江省哈尔滨市道里区";
			break;
		case 230103:
			s = "黑龙江省哈尔滨市南岗区";
			break;
		case 230104:
			s = "黑龙江省哈尔滨市道外区";
			break;
		case 230108:
			s = "黑龙江省哈尔滨市平房区";
			break;
		case 230109:
			s = "黑龙江省哈尔滨市松北区";
			break;
		case 230110:
			s = "黑龙江省哈尔滨市香坊区";
			break;
		case 230111:
			s = "黑龙江省哈尔滨市呼兰区";
			break;
		case 230123:
			s = "黑龙江省依兰县";
			break;
		case 230124:
			s = "黑龙江省方正县";
			break;
		case 230125:
			s = "黑龙江省宾县";
			break;
		case 230126:
			s = "黑龙江省巴彦县";
			break;
		case 230127:
			s = "黑龙江省木兰县";
			break;
		case 230128:
			s = "黑龙江省通河县";
			break;
		case 230129:
			s = "黑龙江省延寿县";
			break;
		case 230182:
			s = "黑龙江省双城市";
			break;
		case 230183:
			s = "黑龙江省尚志市";
			break;
		case 230184:
			s = "黑龙江省五常市";
			break;
		case 230200:
			s = "黑龙江省齐齐哈尔市";
			break;
		case 230201:
			s = "黑龙江省齐齐哈尔市市辖区";
			break;
		case 230202:
			s = "黑龙江省齐齐哈尔市龙沙区";
			break;
		case 230203:
			s = "黑龙江省齐齐哈尔市建华区";
			break;
		case 230204:
			s = "黑龙江省齐齐哈尔市铁锋区";
			break;
		case 230205:
			s = "黑龙江省齐齐哈尔市昂昂溪区";
			break;
		case 230206:
			s = "黑龙江省齐齐哈尔市富拉尔基区";
			break;
		case 230207:
			s = "黑龙江省齐齐哈尔市碾子山区";
			break;
		case 230208:
			s = "黑龙江省齐齐哈尔市梅里斯达斡尔族区";
			break;
		case 230221:
			s = "黑龙江省龙江县";
			break;
		case 230223:
			s = "黑龙江省依安县";
			break;
		case 230224:
			s = "黑龙江省泰来县";
			break;
		case 230225:
			s = "黑龙江省甘南县";
			break;
		case 230227:
			s = "黑龙江省富裕县";
			break;
		case 230229:
			s = "黑龙江省克山县";
			break;
		case 230230:
			s = "黑龙江省克东县";
			break;
		case 230231:
			s = "黑龙江省拜泉县";
			break;
		case 230281:
			s = "黑龙江省讷河市";
			break;
		case 230300:
			s = "黑龙江省鸡西市";
			break;
		case 230301:
			s = "黑龙江省鸡西市市辖区";
			break;
		case 230302:
			s = "黑龙江省鸡西市鸡冠区";
			break;
		case 230303:
			s = "黑龙江省鸡西市恒山区";
			break;
		case 230304:
			s = "黑龙江省鸡西市滴道区";
			break;
		case 230305:
			s = "黑龙江省鸡西市梨树区";
			break;
		case 230306:
			s = "黑龙江省鸡西市城子河区";
			break;
		case 230307:
			s = "黑龙江省鸡西市麻山区";
			break;
		case 230321:
			s = "黑龙江省鸡东县";
			break;
		case 230381:
			s = "黑龙江省虎林市";
			break;
		case 230382:
			s = "黑龙江省密山市";
			break;
		case 230400:
			s = "黑龙江省鹤岗市";
			break;
		case 230401:
			s = "黑龙江省鹤岗市市辖区";
			break;
		case 230402:
			s = "黑龙江省鹤岗市向阳区";
			break;
		case 230403:
			s = "黑龙江省鹤岗市工农区";
			break;
		case 230404:
			s = "黑龙江省鹤岗市南山区";
			break;
		case 230405:
			s = "黑龙江省鹤岗市兴安区";
			break;
		case 230406:
			s = "黑龙江省鹤岗市东山区";
			break;
		case 230407:
			s = "黑龙江省鹤岗市兴山区";
			break;
		case 230421:
			s = "黑龙江省萝北县";
			break;
		case 230422:
			s = "黑龙江省绥滨县";
			break;
		case 230500:
			s = "黑龙江省双鸭山市";
			break;
		case 230501:
			s = "黑龙江省双鸭山市市辖区";
			break;
		case 230502:
			s = "黑龙江省双鸭山市尖山区";
			break;
		case 230503:
			s = "黑龙江省双鸭山市岭东区";
			break;
		case 230505:
			s = "黑龙江省双鸭山市四方台区";
			break;
		case 230506:
			s = "黑龙江省双鸭山市宝山区";
			break;
		case 230521:
			s = "黑龙江省集贤县";
			break;
		case 230522:
			s = "黑龙江省友谊县";
			break;
		case 230523:
			s = "黑龙江省宝清县";
			break;
		case 230524:
			s = "黑龙江省饶河县";
			break;
		case 230600:
			s = "黑龙江省大庆市";
			break;
		case 230601:
			s = "黑龙江省大庆市市辖区";
			break;
		case 230602:
			s = "黑龙江省大庆市萨尔图区";
			break;
		case 230603:
			s = "黑龙江省大庆市龙凤区";
			break;
		case 230604:
			s = "黑龙江省大庆市让胡路区";
			break;
		case 230605:
			s = "黑龙江省大庆市红岗区";
			break;
		case 230606:
			s = "黑龙江省大庆市大同区";
			break;
		case 230621:
			s = "黑龙江省肇州县";
			break;
		case 230622:
			s = "黑龙江省肇源县";
			break;
		case 230623:
			s = "黑龙江省林甸县";
			break;
		case 230624:
			s = "黑龙江省杜尔伯特蒙古族自治县";
			break;
		case 230700:
			s = "黑龙江省伊春市";
			break;
		case 230701:
			s = "黑龙江省伊春市市辖区";
			break;
		case 230702:
			s = "黑龙江省伊春市伊春区";
			break;
		case 230703:
			s = "黑龙江省伊春市南岔区";
			break;
		case 230704:
			s = "黑龙江省伊春市友好区";
			break;
		case 230705:
			s = "黑龙江省伊春市西林区";
			break;
		case 230706:
			s = "黑龙江省伊春市翠峦区";
			break;
		case 230707:
			s = "黑龙江省伊春市新青区";
			break;
		case 230708:
			s = "黑龙江省伊春市美溪区";
			break;
		case 230709:
			s = "黑龙江省伊春市金山屯区";
			break;
		case 230710:
			s = "黑龙江省伊春市五营区";
			break;
		case 230711:
			s = "黑龙江省伊春市乌马河区";
			break;
		case 230712:
			s = "黑龙江省伊春市汤旺河区";
			break;
		case 230713:
			s = "黑龙江省伊春市带岭区";
			break;
		case 230714:
			s = "黑龙江省伊春市乌伊岭区";
			break;
		case 230715:
			s = "黑龙江省伊春市红星区";
			break;
		case 230716:
			s = "黑龙江省伊春市上甘岭区";
			break;
		case 230722:
			s = "黑龙江省嘉荫县";
			break;
		case 230781:
			s = "黑龙江省铁力市";
			break;
		case 230800:
			s = "黑龙江省佳木斯市";
			break;
		case 230801:
			s = "黑龙江省佳木斯市市辖区";
			break;
		case 230803:
			s = "黑龙江省佳木斯市向阳区";
			break;
		case 230804:
			s = "黑龙江省佳木斯市前进区";
			break;
		case 230805:
			s = "黑龙江省佳木斯市东风区";
			break;
		case 230811:
			s = "黑龙江省佳木斯市郊区";
			break;
		case 230822:
			s = "黑龙江省桦南县";
			break;
		case 230826:
			s = "黑龙江省桦川县";
			break;
		case 230828:
			s = "黑龙江省汤原县";
			break;
		case 230833:
			s = "黑龙江省抚远县";
			break;
		case 230881:
			s = "黑龙江省同江市";
			break;
		case 230882:
			s = "黑龙江省富锦市";
			break;
		case 230900:
			s = "黑龙江省七台河市";
			break;
		case 230901:
			s = "黑龙江省七台河市市辖区";
			break;
		case 230902:
			s = "黑龙江省七台河市新兴区";
			break;
		case 230903:
			s = "黑龙江省七台河市桃山区";
			break;
		case 230904:
			s = "黑龙江省七台河市茄子河区";
			break;
		case 230921:
			s = "黑龙江省勃利县";
			break;
		case 231000:
			s = "黑龙江省牡丹江市";
			break;
		case 231001:
			s = "黑龙江省牡丹江市市辖区";
			break;
		case 231002:
			s = "黑龙江省牡丹江市东安区";
			break;
		case 231003:
			s = "黑龙江省牡丹江市阳明区";
			break;
		case 231004:
			s = "黑龙江省牡丹江市爱民区";
			break;
		case 231005:
			s = "黑龙江省牡丹江市西安区";
			break;
		case 231024:
			s = "黑龙江省东宁县";
			break;
		case 231025:
			s = "黑龙江省林口县";
			break;
		case 231081:
			s = "黑龙江省绥芬河市";
			break;
		case 231083:
			s = "黑龙江省海林市";
			break;
		case 231084:
			s = "黑龙江省宁安市";
			break;
		case 231085:
			s = "黑龙江省穆棱市";
			break;
		case 231100:
			s = "黑龙江省黑河市";
			break;
		case 231101:
			s = "黑龙江省黑河市市辖区";
			break;
		case 231102:
			s = "黑龙江省黑河市爱辉区";
			break;
		case 231121:
			s = "黑龙江省嫩江县";
			break;
		case 231123:
			s = "黑龙江省逊克县";
			break;
		case 231124:
			s = "黑龙江省孙吴县";
			break;
		case 231181:
			s = "黑龙江省北安市";
			break;
		case 231182:
			s = "黑龙江省五大连池市";
			break;
		case 231200:
			s = "黑龙江省绥化市";
			break;
		case 231201:
			s = "黑龙江省绥化市市辖区";
			break;
		case 231202:
			s = "黑龙江省绥化市北林区";
			break;
		case 231221:
			s = "黑龙江省望奎县";
			break;
		case 231222:
			s = "黑龙江省兰西县";
			break;
		case 231223:
			s = "黑龙江省青冈县";
			break;
		case 231224:
			s = "黑龙江省庆安县";
			break;
		case 231225:
			s = "黑龙江省明水县";
			break;
		case 231226:
			s = "黑龙江省绥棱县";
			break;
		case 231281:
			s = "黑龙江省安达市";
			break;
		case 231282:
			s = "黑龙江省肇东市";
			break;
		case 231283:
			s = "黑龙江省海伦市";
			break;
		case 232700:
			s = "黑龙江省大兴安岭地区";
			break;
		case 232701:
			s = "黑龙江省加格达奇区";
			break;
		case 232702:
			s = "黑龙江省松岭区";
			break;
		case 232703:
			s = "黑龙江省新林区";
			break;
		case 232704:
			s = "黑龙江省呼中区";
			break;
		case 232721:
			s = "黑龙江省呼玛县";
			break;
		case 232722:
			s = "黑龙江省塔河县";
			break;
		case 232723:
			s = "黑龙江省漠河县";
			break;
		case 310000:
			s = "上海市";
			break;
		case 310100:
			s = "上海市市辖区";
			break;
		case 310101:
			s = "上海市黄浦区";
			break;
		case 310103:
			s = "上海市卢湾区";
			break;
		case 310104:
			s = "上海市徐汇区";
			break;
		case 310105:
			s = "上海市长宁区";
			break;
		case 310106:
			s = "上海市静安区";
			break;
		case 310107:
			s = "上海市普陀区";
			break;
		case 310108:
			s = "上海市闸北区";
			break;
		case 310109:
			s = "上海市虹口区";
			break;
		case 310110:
			s = "上海市杨浦区";
			break;
		case 310112:
			s = "上海市闵行区";
			break;
		case 310113:
			s = "上海市宝山区";
			break;
		case 310114:
			s = "上海市嘉定区";
			break;
		case 310115:
			s = "上海市浦东新区";
			break;
		case 310116:
			s = "上海市金山区";
			break;
		case 310117:
			s = "上海市松江区";
			break;
		case 310118:
			s = "上海市青浦区";
			break;
		case 310119:
			s = "上海市南汇区";
			break;
		case 310120:
			s = "上海市奉贤区";
			break;
		case 310230:
			s = "上海市崇明县";
			break;
		case 320000:
			s = "江苏省";
			break;
		case 320100:
			s = "江苏省南京市";
			break;
		case 320101:
			s = "江苏省南京市市辖区";
			break;
		case 320102:
			s = "江苏省南京市玄武区";
			break;
		case 320103:
			s = "江苏省南京市白下区";
			break;
		case 320104:
			s = "江苏省南京市秦淮区";
			break;
		case 320105:
			s = "江苏省南京市建邺区";
			break;
		case 320106:
			s = "江苏省南京市鼓楼区";
			break;
		case 320107:
			s = "江苏省南京市下关区";
			break;
		case 320111:
			s = "江苏省南京市浦口区";
			break;
		case 320113:
			s = "江苏省南京市栖霞区";
			break;
		case 320114:
			s = "江苏省南京市雨花台区";
			break;
		case 320115:
			s = "江苏省南京市江宁区";
			break;
		case 320116:
			s = "江苏省南京市六合区";
			break;
		case 320124:
			s = "江苏省溧水县";
			break;
		case 320125:
			s = "江苏省高淳县";
			break;
		case 320200:
			s = "江苏省无锡市";
			break;
		case 320201:
			s = "江苏省无锡市市辖区";
			break;
		case 320202:
			s = "江苏省无锡市崇安区";
			break;
		case 320203:
			s = "江苏省无锡市南长区";
			break;
		case 320204:
			s = "江苏省无锡市北塘区";
			break;
		case 320205:
			s = "江苏省无锡市锡山区";
			break;
		case 320206:
			s = "江苏省无锡市惠山区";
			break;
		case 320211:
			s = "江苏省无锡市滨湖区";
			break;
		case 320281:
			s = "江苏省江阴市";
			break;
		case 320282:
			s = "江苏省宜兴市";
			break;
		case 320300:
			s = "江苏省徐州市";
			break;
		case 320301:
			s = "江苏省徐州市市辖区";
			break;
		case 320302:
			s = "江苏省徐州市鼓楼区";
			break;
		case 320303:
			s = "江苏省徐州市云龙区";
			break;
		case 320304:
			s = "江苏省徐州市九里区";
			break;
		case 320305:
			s = "江苏省徐州市贾汪区";
			break;
		case 320311:
			s = "江苏省徐州市泉山区";
			break;
		case 320321:
			s = "江苏省丰县";
			break;
		case 320322:
			s = "江苏省沛县";
			break;
		case 320323:
			s = "江苏省铜山县";
			break;
		case 320324:
			s = "江苏省睢宁县";
			break;
		case 320381:
			s = "江苏省新沂市";
			break;
		case 320382:
			s = "江苏省邳州市";
			break;
		case 320400:
			s = "江苏省常州市";
			break;
		case 320401:
			s = "江苏省常州市市辖区";
			break;
		case 320402:
			s = "江苏省常州市天宁区";
			break;
		case 320404:
			s = "江苏省常州市钟楼区";
			break;
		case 320405:
			s = "江苏省常州市戚墅堰区";
			break;
		case 320411:
			s = "江苏省常州市新北区";
			break;
		case 320412:
			s = "江苏省常州市武进区";
			break;
		case 320481:
			s = "江苏省溧阳市";
			break;
		case 320482:
			s = "江苏省金坛市";
			break;
		case 320500:
			s = "江苏省苏州市";
			break;
		case 320501:
			s = "江苏省苏州市市辖区";
			break;
		case 320502:
			s = "江苏省苏州市沧浪区";
			break;
		case 320503:
			s = "江苏省苏州市平江区";
			break;
		case 320504:
			s = "江苏省苏州市金阊区";
			break;
		case 320505:
			s = "江苏省苏州市虎丘区";
			break;
		case 320506:
			s = "江苏省苏州市吴中区";
			break;
		case 320507:
			s = "江苏省苏州市相城区";
			break;
		case 320581:
			s = "江苏省常熟市";
			break;
		case 320582:
			s = "江苏省张家港市";
			break;
		case 320583:
			s = "江苏省昆山市";
			break;
		case 320584:
			s = "江苏省吴江市";
			break;
		case 320585:
			s = "江苏省太仓市";
			break;
		case 320600:
			s = "江苏省南通市";
			break;
		case 320601:
			s = "江苏省南通市市辖区";
			break;
		case 320602:
			s = "江苏省南通市崇川区";
			break;
		case 320611:
			s = "江苏省南通市港闸区";
			break;
		case 320621:
			s = "江苏省海安县";
			break;
		case 320623:
			s = "江苏省如东县";
			break;
		case 320681:
			s = "江苏省启东市";
			break;
		case 320682:
			s = "江苏省如皋市";
			break;
		case 320683:
			s = "江苏省通州市";
			break;
		case 320684:
			s = "江苏省海门市";
			break;
		case 320700:
			s = "江苏省连云港市";
			break;
		case 320701:
			s = "江苏省连云港市市辖区";
			break;
		case 320703:
			s = "江苏省连云港市连云区";
			break;
		case 320705:
			s = "江苏省连云港市新浦区";
			break;
		case 320706:
			s = "江苏省连云港市海州区";
			break;
		case 320721:
			s = "江苏省赣榆县";
			break;
		case 320722:
			s = "江苏省东海县";
			break;
		case 320723:
			s = "江苏省灌云县";
			break;
		case 320724:
			s = "江苏省灌南县";
			break;
		case 320800:
			s = "江苏省淮安市";
			break;
		case 320801:
			s = "江苏省淮安市市辖区";
			break;
		case 320802:
			s = "江苏省淮安市清河区";
			break;
		case 320803:
			s = "江苏省淮安市楚州区";
			break;
		case 320804:
			s = "江苏省淮安市淮阴区";
			break;
		case 320811:
			s = "江苏省淮安市清浦区";
			break;
		case 320826:
			s = "江苏省涟水县";
			break;
		case 320829:
			s = "江苏省洪泽县";
			break;
		case 320830:
			s = "江苏省盱眙县";
			break;
		case 320831:
			s = "江苏省金湖县";
			break;
		case 320900:
			s = "江苏省盐城市";
			break;
		case 320901:
			s = "江苏省盐城市市辖区";
			break;
		case 320902:
			s = "江苏省盐城市亭湖区";
			break;
		case 320903:
			s = "江苏省盐城市盐都区";
			break;
		case 320921:
			s = "江苏省响水县";
			break;
		case 320922:
			s = "江苏省滨海县";
			break;
		case 320923:
			s = "江苏省阜宁县";
			break;
		case 320924:
			s = "江苏省射阳县";
			break;
		case 320925:
			s = "江苏省建湖县";
			break;
		case 320981:
			s = "江苏省东台市";
			break;
		case 320982:
			s = "江苏省大丰市";
			break;
		case 321000:
			s = "江苏省扬州市";
			break;
		case 321001:
			s = "江苏省扬州市市辖区";
			break;
		case 321002:
			s = "江苏省扬州市广陵区";
			break;
		case 321003:
			s = "江苏省扬州市邗江区";
			break;
		case 321011:
			s = "江苏省扬州市维扬区";
			break;
		case 321023:
			s = "江苏省宝应县";
			break;
		case 321081:
			s = "江苏省仪征市";
			break;
		case 321084:
			s = "江苏省高邮市";
			break;
		case 321088:
			s = "江苏省江都市";
			break;
		case 321100:
			s = "江苏省镇江市";
			break;
		case 321101:
			s = "江苏省镇江市市辖区";
			break;
		case 321102:
			s = "江苏省镇江市京口区";
			break;
		case 321111:
			s = "江苏省镇江市润州区";
			break;
		case 321112:
			s = "江苏省镇江市丹徒区";
			break;
		case 321181:
			s = "江苏省丹阳市";
			break;
		case 321182:
			s = "江苏省扬中市";
			break;
		case 321183:
			s = "江苏省句容市";
			break;
		case 321200:
			s = "江苏省泰州市";
			break;
		case 321201:
			s = "江苏省泰州市市辖区";
			break;
		case 321202:
			s = "江苏省泰州市海陵区";
			break;
		case 321203:
			s = "江苏省泰州市高港区";
			break;
		case 321281:
			s = "江苏省兴化市";
			break;
		case 321282:
			s = "江苏省靖江市";
			break;
		case 321283:
			s = "江苏省泰兴市";
			break;
		case 321284:
			s = "江苏省姜堰市";
			break;
		case 321300:
			s = "江苏省宿迁市";
			break;
		case 321301:
			s = "江苏省宿迁市市辖区";
			break;
		case 321302:
			s = "江苏省宿迁市宿城区";
			break;
		case 321311:
			s = "江苏省宿迁市宿豫区";
			break;
		case 321322:
			s = "江苏省沭阳县";
			break;
		case 321323:
			s = "江苏省泗阳县";
			break;
		case 321324:
			s = "江苏省泗洪县";
			break;
		case 330000:
			s = "浙江省";
			break;
		case 330100:
			s = "浙江省杭州市";
			break;
		case 330101:
			s = "浙江省杭州市市辖区";
			break;
		case 330102:
			s = "浙江省杭州市上城区";
			break;
		case 330103:
			s = "浙江省杭州市下城区";
			break;
		case 330104:
			s = "浙江省杭州市江干区";
			break;
		case 330105:
			s = "浙江省杭州市拱墅区";
			break;
		case 330106:
			s = "浙江省杭州市西湖区";
			break;
		case 330108:
			s = "浙江省杭州市滨江区";
			break;
		case 330109:
			s = "浙江省杭州市萧山区";
			break;
		case 330110:
			s = "浙江省杭州市余杭区";
			break;
		case 330122:
			s = "浙江省桐庐县";
			break;
		case 330127:
			s = "浙江省淳安县";
			break;
		case 330182:
			s = "浙江省建德市";
			break;
		case 330183:
			s = "浙江省富阳市";
			break;
		case 330185:
			s = "浙江省临安市";
			break;
		case 330200:
			s = "浙江省宁波市";
			break;
		case 330201:
			s = "浙江省宁波市市辖区";
			break;
		case 330203:
			s = "浙江省宁波市海曙区";
			break;
		case 330204:
			s = "浙江省宁波市江东区";
			break;
		case 330205:
			s = "浙江省宁波市江北区";
			break;
		case 330206:
			s = "浙江省宁波市北仑区";
			break;
		case 330211:
			s = "浙江省宁波市镇海区";
			break;
		case 330212:
			s = "浙江省宁波市鄞州区";
			break;
		case 330225:
			s = "浙江省象山县";
			break;
		case 330226:
			s = "浙江省宁海县";
			break;
		case 330281:
			s = "浙江省余姚市";
			break;
		case 330282:
			s = "浙江省慈溪市";
			break;
		case 330283:
			s = "浙江省奉化市";
			break;
		case 330300:
			s = "浙江省温州市";
			break;
		case 330301:
			s = "浙江省温州市市辖区";
			break;
		case 330302:
			s = "浙江省鹿城区";
			break;
		case 330303:
			s = "浙江省龙湾区";
			break;
		case 330304:
			s = "浙江省瓯海区";
			break;
		case 330322:
			s = "浙江省洞头县";
			break;
		case 330324:
			s = "浙江省永嘉县";
			break;
		case 330326:
			s = "浙江省平阳县";
			break;
		case 330327:
			s = "浙江省苍南县";
			break;
		case 330328:
			s = "浙江省文成县";
			break;
		case 330329:
			s = "浙江省泰顺县";
			break;
		case 330381:
			s = "浙江省瑞安市";
			break;
		case 330382:
			s = "浙江省乐清市";
			break;
		case 330400:
			s = "浙江省嘉兴市";
			break;
		case 330401:
			s = "浙江省嘉兴市市辖区";
			break;
		case 330402:
			s = "浙江省嘉兴市南湖区";
			break;
		case 330411:
			s = "浙江省嘉兴市秀洲区";
			break;
		case 330421:
			s = "浙江省嘉善县";
			break;
		case 330424:
			s = "浙江省海盐县";
			break;
		case 330481:
			s = "浙江省海宁市";
			break;
		case 330482:
			s = "浙江省平湖市";
			break;
		case 330483:
			s = "浙江省桐乡市";
			break;
		case 330500:
			s = "浙江省湖州市";
			break;
		case 330501:
			s = "浙江省湖州市市辖区";
			break;
		case 330502:
			s = "浙江省湖州市吴兴区";
			break;
		case 330503:
			s = "浙江省湖州市南浔区";
			break;
		case 330521:
			s = "浙江省德清县";
			break;
		case 330522:
			s = "浙江省长兴县";
			break;
		case 330523:
			s = "浙江省安吉县";
			break;
		case 330600:
			s = "浙江省绍兴市";
			break;
		case 330601:
			s = "浙江省绍兴市市辖区";
			break;
		case 330602:
			s = "浙江省绍兴市越城区";
			break;
		case 330621:
			s = "浙江省绍兴县";
			break;
		case 330624:
			s = "浙江省新昌县";
			break;
		case 330681:
			s = "浙江省诸暨市";
			break;
		case 330682:
			s = "浙江省上虞市";
			break;
		case 330683:
			s = "浙江省嵊州市";
			break;
		case 330700:
			s = "浙江省金华市";
			break;
		case 330701:
			s = "浙江省金华市市辖区";
			break;
		case 330702:
			s = "浙江省金华市婺城区";
			break;
		case 330703:
			s = "浙江省金华市金东区";
			break;
		case 330723:
			s = "浙江省武义县";
			break;
		case 330726:
			s = "浙江省浦江县";
			break;
		case 330727:
			s = "浙江省磐安县";
			break;
		case 330781:
			s = "浙江省兰溪市";
			break;
		case 330782:
			s = "浙江省义乌市";
			break;
		case 330783:
			s = "浙江省东阳市";
			break;
		case 330784:
			s = "浙江省永康市";
			break;
		case 330800:
			s = "浙江省衢州市";
			break;
		case 330801:
			s = "浙江省衢州市市辖区";
			break;
		case 330802:
			s = "浙江省衢州市柯城区";
			break;
		case 330803:
			s = "浙江省衢州市衢江区";
			break;
		case 330822:
			s = "浙江省常山县";
			break;
		case 330824:
			s = "浙江省开化县";
			break;
		case 330825:
			s = "浙江省龙游县";
			break;
		case 330881:
			s = "浙江省江山市";
			break;
		case 330900:
			s = "浙江省舟山市";
			break;
		case 330901:
			s = "浙江省舟山市市辖区";
			break;
		case 330902:
			s = "浙江省舟山市定海区";
			break;
		case 330903:
			s = "浙江省舟山市普陀区";
			break;
		case 330921:
			s = "浙江省岱山县";
			break;
		case 330922:
			s = "浙江省嵊泗县";
			break;
		case 331000:
			s = "浙江省台州市";
			break;
		case 331001:
			s = "浙江省台州市市辖区";
			break;
		case 331002:
			s = "浙江省台州市椒江区";
			break;
		case 331003:
			s = "浙江省台州市黄岩区";
			break;
		case 331004:
			s = "浙江省台州市路桥区";
			break;
		case 331021:
			s = "浙江省玉环县";
			break;
		case 331022:
			s = "浙江省三门县";
			break;
		case 331023:
			s = "浙江省天台县";
			break;
		case 331024:
			s = "浙江省仙居县";
			break;
		case 331081:
			s = "浙江省温岭市";
			break;
		case 331082:
			s = "浙江省临海市";
			break;
		case 331100:
			s = "浙江省丽水市";
			break;
		case 331101:
			s = "浙江省丽水市市辖区";
			break;
		case 331102:
			s = "浙江省丽水市莲都区";
			break;
		case 331121:
			s = "浙江省青田县";
			break;
		case 331122:
			s = "浙江省缙云县";
			break;
		case 331123:
			s = "浙江省遂昌县";
			break;
		case 331124:
			s = "浙江省松阳县";
			break;
		case 331125:
			s = "浙江省云和县";
			break;
		case 331126:
			s = "浙江省庆元县";
			break;
		case 331127:
			s = "浙江省景宁畲族自治县";
			break;
		case 331181:
			s = "浙江省龙泉市";
			break;
		case 340000:
			s = "安徽省";
			break;
		case 340100:
			s = "安徽省合肥市";
			break;
		case 340101:
			s = "安徽省合肥市市辖区";
			break;
		case 340102:
			s = "安徽省合肥市瑶海区";
			break;
		case 340103:
			s = "安徽省合肥市庐阳区";
			break;
		case 340104:
			s = "安徽省合肥市蜀山区";
			break;
		case 340111:
			s = "安徽省合肥市包河区";
			break;
		case 340121:
			s = "安徽省长丰县";
			break;
		case 340122:
			s = "安徽省肥东县";
			break;
		case 340123:
			s = "安徽省肥西县";
			break;
		case 340200:
			s = "安徽省芜湖市";
			break;
		case 340201:
			s = "安徽省芜湖市市辖区";
			break;
		case 340202:
			s = "安徽省芜湖市镜湖区";
			break;
		case 340203:
			s = "安徽省芜湖市弋江区";
			break;
		case 340207:
			s = "安徽省芜湖市鸠江区";
			break;
		case 340208:
			s = "安徽省芜湖市三山区";
			break;
		case 340221:
			s = "安徽省芜湖县";
			break;
		case 340222:
			s = "安徽省繁昌县";
			break;
		case 340223:
			s = "安徽省南陵县";
			break;
		case 340300:
			s = "安徽省蚌埠市";
			break;
		case 340301:
			s = "安徽省蚌埠市市辖区";
			break;
		case 340302:
			s = "安徽省蚌埠市龙子湖区";
			break;
		case 340303:
			s = "安徽省蚌埠市蚌山区";
			break;
		case 340304:
			s = "安徽省蚌埠市禹会区";
			break;
		case 340311:
			s = "安徽省蚌埠市淮上区";
			break;
		case 340321:
			s = "安徽省怀远县";
			break;
		case 340322:
			s = "安徽省五河县";
			break;
		case 340323:
			s = "安徽省固镇县";
			break;
		case 340400:
			s = "安徽省淮南市";
			break;
		case 340401:
			s = "安徽省淮南市市辖区";
			break;
		case 340402:
			s = "安徽省淮南市大通区";
			break;
		case 340403:
			s = "安徽省淮南市田家庵区";
			break;
		case 340404:
			s = "安徽省淮南市谢家集区";
			break;
		case 340405:
			s = "安徽省淮南市八公山区";
			break;
		case 340406:
			s = "安徽省淮南市潘集区";
			break;
		case 340421:
			s = "安徽省凤台县";
			break;
		case 340500:
			s = "安徽省马鞍山市";
			break;
		case 340501:
			s = "安徽省马鞍山市市辖区";
			break;
		case 340502:
			s = "安徽省马鞍山市金家庄区";
			break;
		case 340503:
			s = "安徽省马鞍山市花山区";
			break;
		case 340504:
			s = "安徽省马鞍山市雨山区";
			break;
		case 340521:
			s = "安徽省当涂县";
			break;
		case 340600:
			s = "安徽省淮北市";
			break;
		case 340601:
			s = "安徽省淮北市市辖区";
			break;
		case 340602:
			s = "安徽省淮北市杜集区";
			break;
		case 340603:
			s = "安徽省淮北市相山区";
			break;
		case 340604:
			s = "安徽省淮北市烈山区";
			break;
		case 340621:
			s = "安徽省濉溪县";
			break;
		case 340700:
			s = "安徽省铜陵市";
			break;
		case 340701:
			s = "安徽省铜陵市市辖区";
			break;
		case 340702:
			s = "安徽省铜陵市铜官山区";
			break;
		case 340703:
			s = "安徽省铜陵市狮子山区";
			break;
		case 340711:
			s = "安徽省铜陵市郊区";
			break;
		case 340721:
			s = "安徽省铜陵县";
			break;
		case 340800:
			s = "安徽省安庆市";
			break;
		case 340801:
			s = "安徽省安庆市市辖区";
			break;
		case 340802:
			s = "安徽省安庆市迎江区";
			break;
		case 340803:
			s = "安徽省安庆市大观区";
			break;
		case 340811:
			s = "安徽省安庆市宜秀区";
			break;
		case 340822:
			s = "安徽省怀宁县";
			break;
		case 340823:
			s = "安徽省枞阳县";
			break;
		case 340824:
			s = "安徽省潜山县";
			break;
		case 340825:
			s = "安徽省太湖县";
			break;
		case 340826:
			s = "安徽省宿松县";
			break;
		case 340827:
			s = "安徽省望江县";
			break;
		case 340828:
			s = "安徽省岳西县";
			break;
		case 340881:
			s = "安徽省桐城市";
			break;
		case 341000:
			s = "安徽省黄山市";
			break;
		case 341001:
			s = "安徽省黄山市市辖区";
			break;
		case 341002:
			s = "安徽省黄山市屯溪区";
			break;
		case 341003:
			s = "安徽省黄山市黄山区";
			break;
		case 341004:
			s = "安徽省黄山市徽州区";
			break;
		case 341021:
			s = "安徽省歙县";
			break;
		case 341022:
			s = "安徽省休宁县";
			break;
		case 341023:
			s = "安徽省黟县";
			break;
		case 341024:
			s = "安徽省祁门县";
			break;
		case 341100:
			s = "安徽省滁州市";
			break;
		case 341101:
			s = "安徽省滁州市市辖区";
			break;
		case 341102:
			s = "安徽省滁州市琅琊区";
			break;
		case 341103:
			s = "安徽省滁州市南谯区";
			break;
		case 341122:
			s = "安徽省来安县";
			break;
		case 341124:
			s = "安徽省全椒县";
			break;
		case 341125:
			s = "安徽省定远县";
			break;
		case 341126:
			s = "安徽省凤阳县";
			break;
		case 341181:
			s = "安徽省天长市";
			break;
		case 341182:
			s = "安徽省明光市";
			break;
		case 341200:
			s = "安徽省阜阳市";
			break;
		case 341201:
			s = "安徽省阜阳市市辖区";
			break;
		case 341202:
			s = "安徽省阜阳市颍州区";
			break;
		case 341203:
			s = "安徽省阜阳市颍东区";
			break;
		case 341204:
			s = "安徽省阜阳市颍泉区";
			break;
		case 341221:
			s = "安徽省临泉县";
			break;
		case 341222:
			s = "安徽省太和县";
			break;
		case 341225:
			s = "安徽省阜南县";
			break;
		case 341226:
			s = "安徽省颍上县";
			break;
		case 341282:
			s = "安徽省界首市";
			break;
		case 341300:
			s = "安徽省宿州市";
			break;
		case 341301:
			s = "安徽省宿州市市辖区";
			break;
		case 341302:
			s = "安徽省宿州市埇桥区";
			break;
		case 341321:
			s = "安徽省砀山县";
			break;
		case 341322:
			s = "安徽省萧县";
			break;
		case 341323:
			s = "安徽省灵璧县";
			break;
		case 341324:
			s = "安徽省泗县";
			break;
		case 341400:
			s = "安徽省巢湖市";
			break;
		case 341401:
			s = "安徽省巢湖市市辖区";
			break;
		case 341402:
			s = "安徽省巢湖市居巢区";
			break;
		case 341421:
			s = "安徽省庐江县";
			break;
		case 341422:
			s = "安徽省无为县";
			break;
		case 341423:
			s = "安徽省含山县";
			break;
		case 341424:
			s = "安徽省和县";
			break;
		case 341500:
			s = "安徽省六安市";
			break;
		case 341501:
			s = "安徽省六安市市辖区";
			break;
		case 341502:
			s = "安徽省六安市金安区";
			break;
		case 341503:
			s = "安徽省六安市裕安区";
			break;
		case 341521:
			s = "安徽省寿县";
			break;
		case 341522:
			s = "安徽省霍邱县";
			break;
		case 341523:
			s = "安徽省舒城县";
			break;
		case 341524:
			s = "安徽省金寨县";
			break;
		case 341525:
			s = "安徽省霍山县";
			break;
		case 341600:
			s = "安徽省亳州市";
			break;
		case 341601:
			s = "安徽省亳州市市辖区";
			break;
		case 341602:
			s = "安徽省亳州市谯城区";
			break;
		case 341621:
			s = "安徽省涡阳县";
			break;
		case 341622:
			s = "安徽省蒙城县";
			break;
		case 341623:
			s = "安徽省利辛县";
			break;
		case 341700:
			s = "安徽省池州市";
			break;
		case 341701:
			s = "安徽省池州市市辖区";
			break;
		case 341702:
			s = "安徽省池州市贵池区";
			break;
		case 341721:
			s = "安徽省东至县";
			break;
		case 341722:
			s = "安徽省石台县";
			break;
		case 341723:
			s = "安徽省青阳县";
			break;
		case 341800:
			s = "安徽省宣城市";
			break;
		case 341801:
			s = "安徽省宣城市市辖区";
			break;
		case 341802:
			s = "安徽省宣城市宣州区";
			break;
		case 341821:
			s = "安徽省郎溪县";
			break;
		case 341822:
			s = "安徽省广德县";
			break;
		case 341823:
			s = "安徽省泾县";
			break;
		case 341824:
			s = "安徽省绩溪县";
			break;
		case 341825:
			s = "安徽省旌德县";
			break;
		case 341881:
			s = "安徽省宁国市";
			break;
		case 350000:
			s = "福建省";
			break;
		case 350100:
			s = "福建省福州市";
			break;
		case 350101:
			s = "福建省福州市市辖区";
			break;
		case 350102:
			s = "福建省福州市鼓楼区";
			break;
		case 350103:
			s = "福建省福州市台江区";
			break;
		case 350104:
			s = "福建省福州市仓山区";
			break;
		case 350105:
			s = "福建省福州市马尾区";
			break;
		case 350111:
			s = "福建省福州市晋安区";
			break;
		case 350121:
			s = "福建省闽侯县";
			break;
		case 350122:
			s = "福建省连江县";
			break;
		case 350123:
			s = "福建省罗源县";
			break;
		case 350124:
			s = "福建省闽清县";
			break;
		case 350125:
			s = "福建省永泰县";
			break;
		case 350128:
			s = "福建省平潭县";
			break;
		case 350181:
			s = "福建省福清市";
			break;
		case 350182:
			s = "福建省长乐市";
			break;
		case 350200:
			s = "福建省厦门市";
			break;
		case 350201:
			s = "福建省厦门市市辖区";
			break;
		case 350203:
			s = "福建省厦门市思明区";
			break;
		case 350205:
			s = "福建省厦门市海沧区";
			break;
		case 350206:
			s = "福建省厦门市湖里区";
			break;
		case 350211:
			s = "福建省厦门市集美区";
			break;
		case 350212:
			s = "福建省厦门市同安区";
			break;
		case 350213:
			s = "福建省厦门市翔安区";
			break;
		case 350300:
			s = "福建省莆田市";
			break;
		case 350301:
			s = "福建省莆田市市辖区";
			break;
		case 350302:
			s = "福建省莆田市城厢区";
			break;
		case 350303:
			s = "福建省莆田市涵江区";
			break;
		case 350304:
			s = "福建省莆田市荔城区";
			break;
		case 350305:
			s = "福建省莆田市秀屿区";
			break;
		case 350322:
			s = "福建省仙游县";
			break;
		case 350400:
			s = "福建省三明市";
			break;
		case 350401:
			s = "福建省三明市市辖区";
			break;
		case 350402:
			s = "福建省三明市梅列区";
			break;
		case 350403:
			s = "福建省三明市三元区";
			break;
		case 350421:
			s = "福建省明溪县";
			break;
		case 350423:
			s = "福建省清流县";
			break;
		case 350424:
			s = "福建省宁化县";
			break;
		case 350425:
			s = "福建省大田县";
			break;
		case 350426:
			s = "福建省尤溪县";
			break;
		case 350427:
			s = "福建省沙县";
			break;
		case 350428:
			s = "福建省将乐县";
			break;
		case 350429:
			s = "福建省泰宁县";
			break;
		case 350430:
			s = "福建省建宁县";
			break;
		case 350481:
			s = "福建省永安市";
			break;
		case 350500:
			s = "福建省泉州市";
			break;
		case 350501:
			s = "福建省泉州市市辖区";
			break;
		case 350502:
			s = "福建省泉州市鲤城区";
			break;
		case 350503:
			s = "福建省泉州市丰泽区";
			break;
		case 350504:
			s = "福建省泉州市洛江区";
			break;
		case 350505:
			s = "福建省泉州市泉港区";
			break;
		case 350521:
			s = "福建省惠安县";
			break;
		case 350524:
			s = "福建省安溪县";
			break;
		case 350525:
			s = "福建省永春县";
			break;
		case 350526:
			s = "福建省德化县";
			break;
		case 350527:
			s = "福建省金门县";
			break;
		case 350581:
			s = "福建省石狮市";
			break;
		case 350582:
			s = "福建省晋江市";
			break;
		case 350583:
			s = "福建省南安市";
			break;
		case 350600:
			s = "福建省漳州市";
			break;
		case 350601:
			s = "福建省漳州市市辖区";
			break;
		case 350602:
			s = "福建省漳州市芗城区";
			break;
		case 350603:
			s = "福建省漳州市龙文区";
			break;
		case 350622:
			s = "福建省云霄县";
			break;
		case 350623:
			s = "福建省漳浦县";
			break;
		case 350624:
			s = "福建省诏安县";
			break;
		case 350625:
			s = "福建省长泰县";
			break;
		case 350626:
			s = "福建省东山县";
			break;
		case 350627:
			s = "福建省南靖县";
			break;
		case 350628:
			s = "福建省平和县";
			break;
		case 350629:
			s = "福建省华安县";
			break;
		case 350681:
			s = "福建省龙海市";
			break;
		case 350700:
			s = "福建省南平市";
			break;
		case 350701:
			s = "福建省南平市市辖区";
			break;
		case 350702:
			s = "福建省南平市延平区";
			break;
		case 350721:
			s = "福建省顺昌县";
			break;
		case 350722:
			s = "福建省浦城县";
			break;
		case 350723:
			s = "福建省光泽县";
			break;
		case 350724:
			s = "福建省松溪县";
			break;
		case 350725:
			s = "福建省政和县";
			break;
		case 350781:
			s = "福建省邵武市";
			break;
		case 350782:
			s = "福建省武夷山市";
			break;
		case 350783:
			s = "福建省建瓯市";
			break;
		case 350784:
			s = "福建省建阳市";
			break;
		case 350800:
			s = "福建省龙岩市";
			break;
		case 350801:
			s = "福建省龙岩市市辖区";
			break;
		case 350802:
			s = "福建省龙岩市新罗区";
			break;
		case 350821:
			s = "福建省长汀县";
			break;
		case 350822:
			s = "福建省永定县";
			break;
		case 350823:
			s = "福建省上杭县";
			break;
		case 350824:
			s = "福建省武平县";
			break;
		case 350825:
			s = "福建省连城县";
			break;
		case 350881:
			s = "福建省漳平市";
			break;
		case 350900:
			s = "福建省宁德市";
			break;
		case 350901:
			s = "福建省宁德市市辖区";
			break;
		case 350902:
			s = "福建省宁德市蕉城区";
			break;
		case 350921:
			s = "福建省霞浦县";
			break;
		case 350922:
			s = "福建省古田县";
			break;
		case 350923:
			s = "福建省屏南县";
			break;
		case 350924:
			s = "福建省寿宁县";
			break;
		case 350925:
			s = "福建省周宁县";
			break;
		case 350926:
			s = "福建省柘荣县";
			break;
		case 350981:
			s = "福建省福安市";
			break;
		case 350982:
			s = "福建省福鼎市";
			break;
		case 360000:
			s = "江西省";
			break;
		case 360100:
			s = "江西省南昌市";
			break;
		case 360101:
			s = "江西省南昌市市辖区";
			break;
		case 360102:
			s = "江西省南昌市东湖区";
			break;
		case 360103:
			s = "江西省南昌市西湖区";
			break;
		case 360104:
			s = "江西省南昌市青云谱区";
			break;
		case 360105:
			s = "江西省南昌市湾里区";
			break;
		case 360111:
			s = "江西省南昌市青山湖区";
			break;
		case 360121:
			s = "江西省南昌县";
			break;
		case 360122:
			s = "江西省新建县";
			break;
		case 360123:
			s = "江西省安义县";
			break;
		case 360124:
			s = "江西省进贤县";
			break;
		case 360200:
			s = "江西省景德镇市";
			break;
		case 360201:
			s = "江西省景德镇市市辖区";
			break;
		case 360202:
			s = "江西省景德镇市昌江区";
			break;
		case 360203:
			s = "江西省景德镇市珠山区";
			break;
		case 360222:
			s = "江西省浮梁县";
			break;
		case 360281:
			s = "江西省乐平市";
			break;
		case 360300:
			s = "江西省萍乡市";
			break;
		case 360301:
			s = "江西省萍乡市市辖区";
			break;
		case 360302:
			s = "江西省萍乡市安源区";
			break;
		case 360313:
			s = "江西省萍乡市湘东区";
			break;
		case 360321:
			s = "江西省莲花县";
			break;
		case 360322:
			s = "江西省上栗县";
			break;
		case 360323:
			s = "江西省芦溪县";
			break;
		case 360400:
			s = "江西省九江市";
			break;
		case 360401:
			s = "江西省九江市市辖区";
			break;
		case 360402:
			s = "江西省九江市庐山区";
			break;
		case 360403:
			s = "江西省浔阳区";
			break;
		case 360421:
			s = "江西省九江县";
			break;
		case 360423:
			s = "江西省武宁县";
			break;
		case 360424:
			s = "江西省修水县";
			break;
		case 360425:
			s = "江西省永修县";
			break;
		case 360426:
			s = "江西省德安县";
			break;
		case 360427:
			s = "江西省星子县";
			break;
		case 360428:
			s = "江西省都昌县";
			break;
		case 360429:
			s = "江西省湖口县";
			break;
		case 360430:
			s = "江西省彭泽县";
			break;
		case 360481:
			s = "江西省瑞昌市";
			break;
		case 360500:
			s = "江西省新余市";
			break;
		case 360501:
			s = "江西省新余市市辖区";
			break;
		case 360502:
			s = "江西省新余市渝水区";
			break;
		case 360521:
			s = "江西省分宜县";
			break;
		case 360600:
			s = "江西省鹰潭市";
			break;
		case 360601:
			s = "江西省鹰潭市市辖区";
			break;
		case 360602:
			s = "江西省鹰潭市月湖区";
			break;
		case 360622:
			s = "江西省余江县";
			break;
		case 360681:
			s = "江西省贵溪市";
			break;
		case 360700:
			s = "江西省赣州市";
			break;
		case 360701:
			s = "江西省赣州市市辖区";
			break;
		case 360702:
			s = "江西省赣州市章贡区";
			break;
		case 360721:
			s = "江西省赣县";
			break;
		case 360722:
			s = "江西省信丰县";
			break;
		case 360723:
			s = "江西省大余县";
			break;
		case 360724:
			s = "江西省上犹县";
			break;
		case 360725:
			s = "江西省崇义县";
			break;
		case 360726:
			s = "江西省安远县";
			break;
		case 360727:
			s = "江西省龙南县";
			break;
		case 360728:
			s = "江西省定南县";
			break;
		case 360729:
			s = "江西省全南县";
			break;
		case 360730:
			s = "江西省宁都县";
			break;
		case 360731:
			s = "江西省于都县";
			break;
		case 360732:
			s = "江西省兴国县";
			break;
		case 360733:
			s = "江西省会昌县";
			break;
		case 360734:
			s = "江西省寻乌县";
			break;
		case 360735:
			s = "江西省石城县";
			break;
		case 360781:
			s = "江西省瑞金市";
			break;
		case 360782:
			s = "江西省南康市";
			break;
		case 360800:
			s = "江西省吉安市";
			break;
		case 360801:
			s = "江西省吉安市市辖区";
			break;
		case 360802:
			s = "江西省吉安市吉州区";
			break;
		case 360803:
			s = "江西省吉安市青原区";
			break;
		case 360821:
			s = "江西省吉安县";
			break;
		case 360822:
			s = "江西省吉水县";
			break;
		case 360823:
			s = "江西省峡江县";
			break;
		case 360824:
			s = "江西省新干县";
			break;
		case 360825:
			s = "江西省永丰县";
			break;
		case 360826:
			s = "江西省泰和县";
			break;
		case 360827:
			s = "江西省遂川县";
			break;
		case 360828:
			s = "江西省万安县";
			break;
		case 360829:
			s = "江西省安福县";
			break;
		case 360830:
			s = "江西省永新县";
			break;
		case 360881:
			s = "江西省井冈山市";
			break;
		case 360900:
			s = "江西省宜春市";
			break;
		case 360901:
			s = "江西省宜春市市辖区";
			break;
		case 360902:
			s = "江西省宜春市袁州区";
			break;
		case 360921:
			s = "江西省奉新县";
			break;
		case 360922:
			s = "江西省万载县";
			break;
		case 360923:
			s = "江西省上高县";
			break;
		case 360924:
			s = "江西省宜丰县";
			break;
		case 360925:
			s = "江西省靖安县";
			break;
		case 360926:
			s = "江西省铜鼓县";
			break;
		case 360981:
			s = "江西省丰城市";
			break;
		case 360982:
			s = "江西省樟树市";
			break;
		case 360983:
			s = "江西省高安市";
			break;
		case 361000:
			s = "江西省抚州市";
			break;
		case 361001:
			s = "江西省抚州市市辖区";
			break;
		case 361002:
			s = "江西省抚州市临川区";
			break;
		case 361021:
			s = "江西省南城县";
			break;
		case 361022:
			s = "江西省黎川县";
			break;
		case 361023:
			s = "江西省南丰县";
			break;
		case 361024:
			s = "江西省崇仁县";
			break;
		case 361025:
			s = "江西省乐安县";
			break;
		case 361026:
			s = "江西省宜黄县";
			break;
		case 361027:
			s = "江西省金溪县";
			break;
		case 361028:
			s = "江西省资溪县";
			break;
		case 361029:
			s = "江西省东乡县";
			break;
		case 361030:
			s = "江西省广昌县";
			break;
		case 361100:
			s = "江西省上饶市";
			break;
		case 361101:
			s = "江西省上饶市市辖区";
			break;
		case 361102:
			s = "江西省上饶市信州区";
			break;
		case 361121:
			s = "江西省上饶县";
			break;
		case 361122:
			s = "江西省广丰县";
			break;
		case 361123:
			s = "江西省玉山县";
			break;
		case 361124:
			s = "江西省铅山县";
			break;
		case 361125:
			s = "江西省横峰县";
			break;
		case 361126:
			s = "江西省弋阳县";
			break;
		case 361127:
			s = "江西省余干县";
			break;
		case 361128:
			s = "江西省鄱阳县";
			break;
		case 361129:
			s = "江西省万年县";
			break;
		case 361130:
			s = "江西省婺源县";
			break;
		case 361181:
			s = "江西省德兴市";
			break;
		case 370000:
			s = "山东省";
			break;
		case 370100:
			s = "山东省济南市";
			break;
		case 370101:
			s = "山东省济南市市辖区";
			break;
		case 370102:
			s = "山东省济南市历下区";
			break;
		case 370103:
			s = "山东省济南市市中区";
			break;
		case 370104:
			s = "山东省济南市槐荫区";
			break;
		case 370105:
			s = "山东省济南市天桥区";
			break;
		case 370112:
			s = "山东省济南市历城区";
			break;
		case 370113:
			s = "山东省济南市长清区";
			break;
		case 370124:
			s = "山东省平阴县";
			break;
		case 370125:
			s = "山东省济阳县";
			break;
		case 370126:
			s = "山东省商河县";
			break;
		case 370181:
			s = "山东省章丘市";
			break;
		case 370200:
			s = "山东省青岛市";
			break;
		case 370201:
			s = "山东省青岛市市辖区";
			break;
		case 370202:
			s = "山东省青岛市市南区";
			break;
		case 370203:
			s = "山东省青岛市市北区";
			break;
		case 370205:
			s = "山东省青岛市四方区";
			break;
		case 370211:
			s = "山东省青岛市黄岛区";
			break;
		case 370212:
			s = "山东省青岛市崂山区";
			break;
		case 370213:
			s = "山东省青岛市李沧区";
			break;
		case 370214:
			s = "山东省青岛市城阳区";
			break;
		case 370281:
			s = "山东省胶州市";
			break;
		case 370282:
			s = "山东省即墨市";
			break;
		case 370283:
			s = "山东省平度市";
			break;
		case 370284:
			s = "山东省胶南市";
			break;
		case 370285:
			s = "山东省莱西市";
			break;
		case 370300:
			s = "山东省淄博市";
			break;
		case 370301:
			s = "山东省淄博市市辖区";
			break;
		case 370302:
			s = "山东省淄博市淄川区";
			break;
		case 370303:
			s = "山东省淄博市张店区";
			break;
		case 370304:
			s = "山东省淄博市博山区";
			break;
		case 370305:
			s = "山东省淄博市临淄区";
			break;
		case 370306:
			s = "山东省淄博市周村区";
			break;
		case 370321:
			s = "山东省桓台县";
			break;
		case 370322:
			s = "山东省高青县";
			break;
		case 370323:
			s = "山东省沂源县";
			break;
		case 370400:
			s = "山东省枣庄市";
			break;
		case 370401:
			s = "山东省枣庄市市辖区";
			break;
		case 370402:
			s = "山东省枣庄市市中区";
			break;
		case 370403:
			s = "山东省枣庄市薛城区";
			break;
		case 370404:
			s = "山东省枣庄市峄城区";
			break;
		case 370405:
			s = "山东省枣庄市台儿庄区";
			break;
		case 370406:
			s = "山东省枣庄市山亭区";
			break;
		case 370481:
			s = "山东省滕州市";
			break;
		case 370500:
			s = "山东省东营市";
			break;
		case 370501:
			s = "山东省东营市市辖区";
			break;
		case 370502:
			s = "山东省东营市东营区";
			break;
		case 370503:
			s = "山东省东营市河口区";
			break;
		case 370521:
			s = "山东省垦利县";
			break;
		case 370522:
			s = "山东省利津县";
			break;
		case 370523:
			s = "山东省广饶县";
			break;
		case 370600:
			s = "山东省烟台市";
			break;
		case 370601:
			s = "山东省烟台市市辖区";
			break;
		case 370602:
			s = "山东省烟台市芝罘区";
			break;
		case 370611:
			s = "山东省烟台市福山区";
			break;
		case 370612:
			s = "山东省烟台市牟平区";
			break;
		case 370613:
			s = "山东省烟台市莱山区";
			break;
		case 370634:
			s = "山东省长岛县";
			break;
		case 370681:
			s = "山东省龙口市";
			break;
		case 370682:
			s = "山东省莱阳市";
			break;
		case 370683:
			s = "山东省莱州市";
			break;
		case 370684:
			s = "山东省蓬莱市";
			break;
		case 370685:
			s = "山东省招远市";
			break;
		case 370686:
			s = "山东省栖霞市";
			break;
		case 370687:
			s = "山东省海阳市";
			break;
		case 370700:
			s = "山东省潍坊市";
			break;
		case 370701:
			s = "山东省潍坊市市辖区";
			break;
		case 370702:
			s = "山东省潍坊市潍城区";
			break;
		case 370703:
			s = "山东省潍坊市寒亭区";
			break;
		case 370704:
			s = "山东省潍坊市坊子区";
			break;
		case 370705:
			s = "山东省潍坊市奎文区";
			break;
		case 370724:
			s = "山东省临朐县";
			break;
		case 370725:
			s = "山东省昌乐县";
			break;
		case 370781:
			s = "山东省青州市";
			break;
		case 370782:
			s = "山东省诸城市";
			break;
		case 370783:
			s = "山东省寿光市";
			break;
		case 370784:
			s = "山东省安丘市";
			break;
		case 370785:
			s = "山东省高密市";
			break;
		case 370786:
			s = "山东省昌邑市";
			break;
		case 370800:
			s = "山东省济宁市";
			break;
		case 370801:
			s = "山东省济宁市市辖区";
			break;
		case 370802:
			s = "山东省济宁市市中区";
			break;
		case 370811:
			s = "山东省济宁市任城区";
			break;
		case 370826:
			s = "山东省微山县";
			break;
		case 370827:
			s = "山东省鱼台县";
			break;
		case 370828:
			s = "山东省金乡县";
			break;
		case 370829:
			s = "山东省嘉祥县";
			break;
		case 370830:
			s = "山东省汶上县";
			break;
		case 370831:
			s = "山东省泗水县";
			break;
		case 370832:
			s = "山东省梁山县";
			break;
		case 370881:
			s = "山东省曲阜市";
			break;
		case 370882:
			s = "山东省兖州市";
			break;
		case 370883:
			s = "山东省邹城市";
			break;
		case 370900:
			s = "山东省泰安市";
			break;
		case 370901:
			s = "山东省泰安市市辖区";
			break;
		case 370902:
			s = "山东省泰安市泰山区";
			break;
		case 370911:
			s = "山东省泰安市岱岳区";
			break;
		case 370921:
			s = "山东省宁阳县";
			break;
		case 370923:
			s = "山东省东平县";
			break;
		case 370982:
			s = "山东省新泰市";
			break;
		case 370983:
			s = "山东省肥城市";
			break;
		case 371000:
			s = "山东省威海市";
			break;
		case 371001:
			s = "山东省威海市市辖区";
			break;
		case 371002:
			s = "山东省威海市环翠区";
			break;
		case 371081:
			s = "山东省文登市";
			break;
		case 371082:
			s = "山东省荣成市";
			break;
		case 371083:
			s = "山东省乳山市";
			break;
		case 371100:
			s = "山东省日照市";
			break;
		case 371101:
			s = "山东省日照市市辖区";
			break;
		case 371102:
			s = "山东省日照市市辖区东港区";
			break;
		case 371103:
			s = "山东省日照市市辖区岚山区";
			break;
		case 371121:
			s = "山东省五莲县";
			break;
		case 371122:
			s = "山东省莒县";
			break;
		case 371200:
			s = "山东省莱芜市";
			break;
		case 371201:
			s = "山东省莱芜市市辖区";
			break;
		case 371202:
			s = "山东省莱芜市莱城区";
			break;
		case 371203:
			s = "山东省莱芜市钢城区";
			break;
		case 371300:
			s = "山东省临沂市";
			break;
		case 371301:
			s = "山东省临沂市市辖区";
			break;
		case 371302:
			s = "山东省临沂市兰山区";
			break;
		case 371311:
			s = "山东省临沂市罗庄区";
			break;
		case 371312:
			s = "山东省临沂市河东区";
			break;
		case 371321:
			s = "山东省临沂市沂南县";
			break;
		case 371322:
			s = "山东省临沂市郯城县";
			break;
		case 371323:
			s = "山东省临沂市沂水县";
			break;
		case 371324:
			s = "山东省临沂市苍山县";
			break;
		case 371325:
			s = "山东省临沂市费县";
			break;
		case 371326:
			s = "山东省临沂市平邑县";
			break;
		case 371327:
			s = "山东省临沂市莒南县";
			break;
		case 371328:
			s = "山东省临沂市蒙阴县";
			break;
		case 371329:
			s = "山东省临沂市临沭县";
			break;
		case 371400:
			s = "山东省德州市";
			break;
		case 371401:
			s = "山东省德州市市辖区";
			break;
		case 371402:
			s = "山东省德州市德城区";
			break;
		case 371421:
			s = "山东省陵县";
			break;
		case 371422:
			s = "山东省宁津县";
			break;
		case 371423:
			s = "山东省庆云县";
			break;
		case 371424:
			s = "山东省临邑县";
			break;
		case 371425:
			s = "山东省齐河县";
			break;
		case 371426:
			s = "山东省平原县";
			break;
		case 371427:
			s = "山东省夏津县";
			break;
		case 371428:
			s = "山东省武城县";
			break;
		case 371481:
			s = "山东省乐陵市";
			break;
		case 371482:
			s = "山东省禹城市";
			break;
		case 371500:
			s = "山东省聊城市";
			break;
		case 371501:
			s = "山东省聊城市市辖区";
			break;
		case 371502:
			s = "山东省聊城市东昌府区";
			break;
		case 371521:
			s = "山东省阳谷县";
			break;
		case 371522:
			s = "山东省莘县";
			break;
		case 371523:
			s = "山东省茌平县";
			break;
		case 371524:
			s = "山东省东阿县";
			break;
		case 371525:
			s = "山东省冠县";
			break;
		case 371526:
			s = "山东省高唐县";
			break;
		case 371581:
			s = "山东省临清市";
			break;
		case 371600:
			s = "山东省滨州市";
			break;
		case 371601:
			s = "山东省滨州市市辖区";
			break;
		case 371602:
			s = "山东省滨州市滨城区";
			break;
		case 371621:
			s = "山东省惠民县";
			break;
		case 371622:
			s = "山东省阳信县";
			break;
		case 371623:
			s = "山东省无棣县";
			break;
		case 371624:
			s = "山东省沾化县";
			break;
		case 371625:
			s = "山东省博兴县";
			break;
		case 371626:
			s = "山东省邹平县";
			break;
		case 371700:
			s = "山东省菏泽市";
			break;
		case 371701:
			s = "山东省菏泽市市辖区";
			break;
		case 371702:
			s = "山东省菏泽市牡丹区";
			break;
		case 371721:
			s = "山东省曹县";
			break;
		case 371722:
			s = "山东省单县";
			break;
		case 371723:
			s = "山东省成武县";
			break;
		case 371724:
			s = "山东省巨野县";
			break;
		case 371725:
			s = "山东省郓城县";
			break;
		case 371726:
			s = "山东省鄄城县";
			break;
		case 371727:
			s = "山东省定陶县";
			break;
		case 371728:
			s = "山东省东明县";
			break;
		case 410000:
			s = "河南省";
			break;
		case 410100:
			s = "河南省郑州市";
			break;
		case 410101:
			s = "河南省郑州市市辖区";
			break;
		case 410102:
			s = "河南省郑州市中原区";
			break;
		case 410103:
			s = "河南省郑州市二七区";
			break;
		case 410104:
			s = "河南省郑州市管城回族区";
			break;
		case 410105:
			s = "河南省郑州市金水区";
			break;
		case 410106:
			s = "河南省郑州市上街区";
			break;
		case 410108:
			s = "河南省郑州市惠济区";
			break;
		case 410122:
			s = "河南省中牟县";
			break;
		case 410181:
			s = "河南省巩义市";
			break;
		case 410182:
			s = "河南省荥阳市";
			break;
		case 410183:
			s = "河南省新密市";
			break;
		case 410184:
			s = "河南省新郑市";
			break;
		case 410185:
			s = "河南省登封市";
			break;
		case 410200:
			s = "河南省开封市";
			break;
		case 410201:
			s = "河南省开封市市辖区";
			break;
		case 410202:
			s = "河南省开封市龙亭区";
			break;
		case 410203:
			s = "河南省开封市顺河回族区";
			break;
		case 410204:
			s = "河南省开封市鼓楼区";
			break;
		case 410205:
			s = "河南省开封市禹王台区";
			break;
		case 410211:
			s = "河南省开封市金明区";
			break;
		case 410221:
			s = "河南省杞县";
			break;
		case 410222:
			s = "河南省通许县";
			break;
		case 410223:
			s = "河南省尉氏县";
			break;
		case 410224:
			s = "河南省开封县";
			break;
		case 410225:
			s = "河南省兰考县";
			break;
		case 410300:
			s = "河南省洛阳市";
			break;
		case 410301:
			s = "河南省洛阳市市辖区";
			break;
		case 410302:
			s = "河南省洛阳市老城区";
			break;
		case 410303:
			s = "河南省洛阳市西工区";
			break;
		case 410304:
			s = "河南省洛阳市瀍河回族区";
			break;
		case 410305:
			s = "河南省洛阳市涧西区";
			break;
		case 410306:
			s = "河南省洛阳市吉利区";
			break;
		case 410311:
			s = "河南省洛阳市洛龙区";
			break;
		case 410322:
			s = "河南省孟津县";
			break;
		case 410323:
			s = "河南省新安县";
			break;
		case 410324:
			s = "河南省栾川县";
			break;
		case 410325:
			s = "河南省嵩县";
			break;
		case 410326:
			s = "河南省汝阳县";
			break;
		case 410327:
			s = "河南省宜阳县";
			break;
		case 410328:
			s = "河南省洛宁县";
			break;
		case 410329:
			s = "河南省伊川县";
			break;
		case 410381:
			s = "河南省偃师市";
			break;
		case 410400:
			s = "河南省平顶山市";
			break;
		case 410401:
			s = "河南省平顶山市市辖区";
			break;
		case 410402:
			s = "河南省平顶山市新华区";
			break;
		case 410403:
			s = "河南省平顶山市卫东区";
			break;
		case 410404:
			s = "河南省平顶山市石龙区";
			break;
		case 410411:
			s = "河南省平顶山市湛河区";
			break;
		case 410421:
			s = "河南省宝丰县";
			break;
		case 410422:
			s = "河南省叶县";
			break;
		case 410423:
			s = "河南省鲁山县";
			break;
		case 410425:
			s = "河南省郏县";
			break;
		case 410481:
			s = "河南省舞钢市";
			break;
		case 410482:
			s = "河南省汝州市";
			break;
		case 410500:
			s = "河南省安阳市";
			break;
		case 410501:
			s = "河南省安阳市市辖区";
			break;
		case 410502:
			s = "河南省安阳市文峰区";
			break;
		case 410503:
			s = "河南省安阳市北关区";
			break;
		case 410505:
			s = "河南省安阳市殷都区";
			break;
		case 410506:
			s = "河南省安阳市龙安区";
			break;
		case 410522:
			s = "河南省安阳县";
			break;
		case 410523:
			s = "河南省汤阴县";
			break;
		case 410526:
			s = "河南省滑县";
			break;
		case 410527:
			s = "河南省内黄县";
			break;
		case 410581:
			s = "河南省林州市";
			break;
		case 410600:
			s = "河南省鹤壁市";
			break;
		case 410601:
			s = "河南省鹤壁市市辖区";
			break;
		case 410602:
			s = "河南省鹤壁市鹤山区";
			break;
		case 410603:
			s = "河南省鹤壁市山城区";
			break;
		case 410611:
			s = "河南省鹤壁市淇滨区";
			break;
		case 410621:
			s = "河南省浚县";
			break;
		case 410622:
			s = "河南省淇县";
			break;
		case 410700:
			s = "河南省新乡市";
			break;
		case 410701:
			s = "河南省新乡市市辖区";
			break;
		case 410702:
			s = "河南省新乡市红旗区";
			break;
		case 410703:
			s = "河南省新乡市卫滨区";
			break;
		case 410704:
			s = "河南省新乡市凤泉区";
			break;
		case 410711:
			s = "河南省新乡市牧野区";
			break;
		case 410721:
			s = "河南省新乡县";
			break;
		case 410724:
			s = "河南省获嘉县";
			break;
		case 410725:
			s = "河南省原阳县";
			break;
		case 410726:
			s = "河南省延津县";
			break;
		case 410727:
			s = "河南省封丘县";
			break;
		case 410728:
			s = "河南省长垣县";
			break;
		case 410781:
			s = "河南省卫辉市";
			break;
		case 410782:
			s = "河南省辉县市";
			break;
		case 410800:
			s = "河南省焦作市";
			break;
		case 410801:
			s = "河南省焦作市市辖区";
			break;
		case 410802:
			s = "河南省焦作市解放区";
			break;
		case 410803:
			s = "河南省焦作市中站区";
			break;
		case 410804:
			s = "河南省焦作市马村区";
			break;
		case 410811:
			s = "河南省焦作市山阳区";
			break;
		case 410821:
			s = "河南省修武县";
			break;
		case 410822:
			s = "河南省博爱县";
			break;
		case 410823:
			s = "河南省武陟县";
			break;
		case 410825:
			s = "河南省温县";
			break;
		case 410882:
			s = "河南省沁阳市";
			break;
		case 410883:
			s = "河南省孟州市";
			break;
		case 410900:
			s = "河南省濮阳市";
			break;
		case 410901:
			s = "河南省濮阳市市辖区";
			break;
		case 410902:
			s = "河南省濮阳市华龙区";
			break;
		case 410922:
			s = "河南省清丰县";
			break;
		case 410923:
			s = "河南省南乐县";
			break;
		case 410926:
			s = "河南省范县";
			break;
		case 410927:
			s = "河南省台前县";
			break;
		case 410928:
			s = "河南省濮阳县";
			break;
		case 411000:
			s = "河南省许昌市";
			break;
		case 411001:
			s = "河南省许昌市市辖区";
			break;
		case 411002:
			s = "河南省许昌市魏都区";
			break;
		case 411023:
			s = "河南省许昌县";
			break;
		case 411024:
			s = "河南省鄢陵县";
			break;
		case 411025:
			s = "河南省襄城县";
			break;
		case 411081:
			s = "河南省禹州市";
			break;
		case 411082:
			s = "河南省长葛市";
			break;
		case 411100:
			s = "河南省漯河市";
			break;
		case 411101:
			s = "河南省漯河市市辖区";
			break;
		case 411102:
			s = "河南省漯河市源汇区";
			break;
		case 411103:
			s = "河南省漯河市郾城区";
			break;
		case 411104:
			s = "河南省漯河市召陵区";
			break;
		case 411121:
			s = "河南省舞阳县";
			break;
		case 411122:
			s = "河南省临颍县";
			break;
		case 411200:
			s = "河南省三门峡市";
			break;
		case 411201:
			s = "河南省三门峡市市辖区";
			break;
		case 411202:
			s = "河南省三门峡市湖滨区";
			break;
		case 411221:
			s = "河南省渑池县";
			break;
		case 411222:
			s = "河南省陕县";
			break;
		case 411224:
			s = "河南省卢氏县";
			break;
		case 411281:
			s = "河南省义马市";
			break;
		case 411282:
			s = "河南省灵宝市";
			break;
		case 411300:
			s = "河南省南阳市";
			break;
		case 411301:
			s = "河南省南阳市市辖区";
			break;
		case 411302:
			s = "河南省南阳市宛城区";
			break;
		case 411303:
			s = "河南省南阳市卧龙区";
			break;
		case 411321:
			s = "河南省南召县";
			break;
		case 411322:
			s = "河南省方城县";
			break;
		case 411323:
			s = "河南省西峡县";
			break;
		case 411324:
			s = "河南省镇平县";
			break;
		case 411325:
			s = "河南省内乡县";
			break;
		case 411326:
			s = "河南省淅川县";
			break;
		case 411327:
			s = "河南省社旗县";
			break;
		case 411328:
			s = "河南省唐河县";
			break;
		case 411329:
			s = "河南省新野县";
			break;
		case 411330:
			s = "河南省桐柏县";
			break;
		case 411381:
			s = "河南省邓州市";
			break;
		case 411400:
			s = "河南省商丘市";
			break;
		case 411401:
			s = "河南省商丘市市辖区";
			break;
		case 411402:
			s = "河南省商丘市梁园区";
			break;
		case 411403:
			s = "河南省商丘市睢阳区";
			break;
		case 411421:
			s = "河南省民权县";
			break;
		case 411422:
			s = "河南省睢县";
			break;
		case 411423:
			s = "河南省宁陵县";
			break;
		case 411424:
			s = "河南省柘城县";
			break;
		case 411425:
			s = "河南省虞城县";
			break;
		case 411426:
			s = "河南省夏邑县";
			break;
		case 411481:
			s = "河南省永城市";
			break;
		case 411500:
			s = "河南省信阳市";
			break;
		case 411501:
			s = "河南省信阳市市辖区";
			break;
		case 411502:
			s = "河南省信阳市市辖区浉河区";
			break;
		case 411503:
			s = "河南省信阳市市辖区平桥区";
			break;
		case 411521:
			s = "河南省罗山县";
			break;
		case 411522:
			s = "河南省光山县";
			break;
		case 411523:
			s = "河南省新县";
			break;
		case 411524:
			s = "河南省商城县";
			break;
		case 411525:
			s = "河南省固始县";
			break;
		case 411526:
			s = "河南省潢川县";
			break;
		case 411527:
			s = "河南省淮滨县";
			break;
		case 411528:
			s = "河南省息县";
			break;
		case 411600:
			s = "河南省周口市";
			break;
		case 411601:
			s = "河南省周口市市辖区";
			break;
		case 411602:
			s = "河南省周口市川汇区";
			break;
		case 411621:
			s = "河南省扶沟县";
			break;
		case 411622:
			s = "河南省西华县";
			break;
		case 411623:
			s = "河南省商水县";
			break;
		case 411624:
			s = "河南省沈丘县";
			break;
		case 411625:
			s = "河南省郸城县";
			break;
		case 411626:
			s = "河南省淮阳县";
			break;
		case 411627:
			s = "河南省太康县";
			break;
		case 411628:
			s = "河南省鹿邑县";
			break;
		case 411681:
			s = "河南省项城市";
			break;
		case 411700:
			s = "河南省驻马店市";
			break;
		case 411701:
			s = "河南省驻马店市市辖区";
			break;
		case 411702:
			s = "河南省驻马店市驿城区";
			break;
		case 411721:
			s = "河南省西平县";
			break;
		case 411722:
			s = "河南省上蔡县";
			break;
		case 411723:
			s = "河南省平舆县";
			break;
		case 411724:
			s = "河南省正阳县";
			break;
		case 411725:
			s = "河南省确山县";
			break;
		case 411726:
			s = "河南省泌阳县";
			break;
		case 411727:
			s = "河南省汝南县";
			break;
		case 411728:
			s = "河南省遂平县";
			break;
		case 411729:
			s = "河南省新蔡县";
			break;
		case 419001:
			s = "河南省济源市";
			break;
		case 420000:
			s = "湖北省";
			break;
		case 420100:
			s = "湖北省武汉市";
			break;
		case 420101:
			s = "湖北省武汉市市辖区";
			break;
		case 420102:
			s = "湖北省武汉市江岸区";
			break;
		case 420103:
			s = "湖北省武汉市江汉区";
			break;
		case 420104:
			s = "湖北省武汉市硚口区";
			break;
		case 420105:
			s = "湖北省武汉市汉阳区";
			break;
		case 420106:
			s = "湖北省武汉市武昌区";
			break;
		case 420107:
			s = "湖北省武汉市青山区";
			break;
		case 420111:
			s = "湖北省武汉市洪山区";
			break;
		case 420112:
			s = "湖北省武汉市东西湖区";
			break;
		case 420113:
			s = "湖北省武汉市汉南区";
			break;
		case 420114:
			s = "湖北省武汉市蔡甸区";
			break;
		case 420115:
			s = "湖北省武汉市江夏区";
			break;
		case 420116:
			s = "湖北省武汉市黄陂区";
			break;
		case 420117:
			s = "湖北省武汉市新洲区";
			break;
		case 420200:
			s = "湖北省黄石市";
			break;
		case 420201:
			s = "湖北省黄石市市辖区";
			break;
		case 420202:
			s = "湖北省黄石市黄石港区";
			break;
		case 420203:
			s = "湖北省黄石市西塞山区";
			break;
		case 420204:
			s = "湖北省黄石市下陆区";
			break;
		case 420205:
			s = "湖北省黄石市铁山区";
			break;
		case 420222:
			s = "湖北省阳新县";
			break;
		case 420281:
			s = "湖北省大冶市";
			break;
		case 420300:
			s = "湖北省十堰市";
			break;
		case 420301:
			s = "湖北省十堰市市辖区";
			break;
		case 420302:
			s = "湖北省十堰市茅箭区";
			break;
		case 420303:
			s = "湖北省十堰市张湾区";
			break;
		case 420321:
			s = "湖北省郧县";
			break;
		case 420322:
			s = "湖北省郧西县";
			break;
		case 420323:
			s = "湖北省竹山县";
			break;
		case 420324:
			s = "湖北省竹溪县";
			break;
		case 420325:
			s = "湖北省房县";
			break;
		case 420381:
			s = "湖北省丹江口市";
			break;
		case 420500:
			s = "湖北省宜昌市";
			break;
		case 420501:
			s = "湖北省宜昌市市辖区";
			break;
		case 420502:
			s = "湖北省宜昌市西陵区";
			break;
		case 420503:
			s = "湖北省宜昌市伍家岗区";
			break;
		case 420504:
			s = "湖北省宜昌市点军区";
			break;
		case 420505:
			s = "湖北省宜昌市猇亭区";
			break;
		case 420506:
			s = "湖北省宜昌市夷陵区";
			break;
		case 420525:
			s = "湖北省远安县";
			break;
		case 420526:
			s = "湖北省兴山县";
			break;
		case 420527:
			s = "湖北省秭归县";
			break;
		case 420528:
			s = "湖北省长阳土家族自治县";
			break;
		case 420529:
			s = "湖北省五峰土家族自治县";
			break;
		case 420581:
			s = "湖北省宜都市";
			break;
		case 420582:
			s = "湖北省当阳市";
			break;
		case 420583:
			s = "湖北省枝江市";
			break;
		case 420600:
			s = "湖北省襄樊市";
			break;
		case 420601:
			s = "湖北省襄樊市市辖区";
			break;
		case 420602:
			s = "湖北省襄樊市襄城区";
			break;
		case 420606:
			s = "湖北省襄樊市樊城区";
			break;
		case 420607:
			s = "湖北省襄樊市襄阳区";
			break;
		case 420624:
			s = "湖北省南漳县";
			break;
		case 420625:
			s = "湖北省谷城县";
			break;
		case 420626:
			s = "湖北省保康县";
			break;
		case 420682:
			s = "湖北省老河口市";
			break;
		case 420683:
			s = "湖北省枣阳市";
			break;
		case 420684:
			s = "湖北省宜城市";
			break;
		case 420700:
			s = "湖北省鄂州市";
			break;
		case 420701:
			s = "湖北省鄂州市市辖区";
			break;
		case 420702:
			s = "湖北省鄂州市梁子湖区";
			break;
		case 420703:
			s = "湖北省鄂州市华容区";
			break;
		case 420704:
			s = "湖北省鄂州市鄂城区";
			break;
		case 420800:
			s = "湖北省荆门市";
			break;
		case 420801:
			s = "湖北省荆门市市辖区";
			break;
		case 420802:
			s = "湖北省荆门市东宝区";
			break;
		case 420804:
			s = "湖北省荆门市掇刀区";
			break;
		case 420821:
			s = "湖北省京山县";
			break;
		case 420822:
			s = "湖北省沙洋县";
			break;
		case 420881:
			s = "湖北省钟祥市";
			break;
		case 420900:
			s = "湖北省孝感市";
			break;
		case 420901:
			s = "湖北省孝感市市辖区";
			break;
		case 420902:
			s = "湖北省孝感市孝南区";
			break;
		case 420921:
			s = "湖北省孝昌县";
			break;
		case 420922:
			s = "湖北省大悟县";
			break;
		case 420923:
			s = "湖北省云梦县";
			break;
		case 420981:
			s = "湖北省应城市";
			break;
		case 420982:
			s = "湖北省安陆市";
			break;
		case 420984:
			s = "湖北省汉川市";
			break;
		case 421000:
			s = "湖北省荆州市";
			break;
		case 421001:
			s = "湖北省荆州市市辖区";
			break;
		case 421002:
			s = "湖北省荆州市沙市区";
			break;
		case 421003:
			s = "湖北省荆州市荆州区";
			break;
		case 421022:
			s = "湖北省公安县";
			break;
		case 421023:
			s = "湖北省监利县";
			break;
		case 421024:
			s = "湖北省江陵县";
			break;
		case 421081:
			s = "湖北省石首市";
			break;
		case 421083:
			s = "湖北省洪湖市";
			break;
		case 421087:
			s = "湖北省松滋市";
			break;
		case 421100:
			s = "湖北省黄冈市";
			break;
		case 421101:
			s = "湖北省黄冈市市辖区";
			break;
		case 421102:
			s = "湖北省黄冈市黄州区";
			break;
		case 421121:
			s = "湖北省团风县";
			break;
		case 421122:
			s = "湖北省红安县";
			break;
		case 421123:
			s = "湖北省罗田县";
			break;
		case 421124:
			s = "湖北省英山县";
			break;
		case 421125:
			s = "湖北省浠水县";
			break;
		case 421126:
			s = "湖北省蕲春县";
			break;
		case 421127:
			s = "湖北省黄梅县";
			break;
		case 421181:
			s = "湖北省麻城市";
			break;
		case 421182:
			s = "湖北省武穴市";
			break;
		case 421200:
			s = "湖北省咸宁市";
			break;
		case 421201:
			s = "湖北省咸宁市市辖区";
			break;
		case 421202:
			s = "湖北省咸宁市咸安区";
			break;
		case 421221:
			s = "湖北省嘉鱼县";
			break;
		case 421222:
			s = "湖北省通城县";
			break;
		case 421223:
			s = "湖北省崇阳县";
			break;
		case 421224:
			s = "湖北省通山县";
			break;
		case 421281:
			s = "湖北省赤壁市";
			break;
		case 421300:
			s = "湖北省随州市";
			break;
		case 421301:
			s = "湖北省随州市市辖区";
			break;
		case 421302:
			s = "湖北省随州市曾都区";
			break;
		case 421381:
			s = "湖北省广水市";
			break;
		case 422800:
			s = "湖北省恩施土家族苗族自治州";
			break;
		case 422801:
			s = "湖北省恩施市";
			break;
		case 422802:
			s = "湖北省利川市";
			break;
		case 422822:
			s = "湖北省建始县";
			break;
		case 422823:
			s = "湖北省巴东县";
			break;
		case 422825:
			s = "湖北省宣恩县";
			break;
		case 422826:
			s = "湖北省咸丰县";
			break;
		case 422827:
			s = "湖北省来凤县";
			break;
		case 422828:
			s = "湖北省鹤峰县";
			break;
		case 429004:
			s = "湖北省仙桃市";
			break;
		case 429005:
			s = "湖北省潜江市";
			break;
		case 429006:
			s = "湖北省天门市";
			break;
		case 429021:
			s = "湖北省神农架林区";
			break;
		case 430000:
			s = "湖南省";
			break;
		case 430100:
			s = "湖南省长沙市";
			break;
		case 430101:
			s = "湖南省长沙市市辖区";
			break;
		case 430102:
			s = "湖南省长沙市芙蓉区";
			break;
		case 430103:
			s = "湖南省长沙市天心区";
			break;
		case 430104:
			s = "湖南省长沙市岳麓区";
			break;
		case 430105:
			s = "湖南省长沙市开福区";
			break;
		case 430111:
			s = "湖南省长沙市雨花区";
			break;
		case 430121:
			s = "湖南省长沙县";
			break;
		case 430122:
			s = "湖南省望城县";
			break;
		case 430124:
			s = "湖南省宁乡县";
			break;
		case 430181:
			s = "湖南省浏阳市";
			break;
		case 430200:
			s = "湖南省株洲市";
			break;
		case 430201:
			s = "湖南省株洲市市辖区";
			break;
		case 430202:
			s = "湖南省株洲市荷塘区";
			break;
		case 430203:
			s = "湖南省株洲市芦淞区";
			break;
		case 430204:
			s = "湖南省株洲市石峰区";
			break;
		case 430211:
			s = "湖南省株洲市天元区";
			break;
		case 430221:
			s = "湖南省株洲县";
			break;
		case 430223:
			s = "湖南省攸县";
			break;
		case 430224:
			s = "湖南省茶陵县";
			break;
		case 430225:
			s = "湖南省炎陵县";
			break;
		case 430281:
			s = "湖南省醴陵市";
			break;
		case 430300:
			s = "湖南省湘潭市";
			break;
		case 430301:
			s = "湖南省湘潭市市辖区";
			break;
		case 430302:
			s = "湖南省湘潭市雨湖区";
			break;
		case 430304:
			s = "湖南省湘潭市岳塘区";
			break;
		case 430321:
			s = "湖南省湘潭县";
			break;
		case 430381:
			s = "湖南省湘乡市";
			break;
		case 430382:
			s = "湖南省韶山市";
			break;
		case 430400:
			s = "湖南省衡阳市";
			break;
		case 430401:
			s = "湖南省衡阳市市辖区";
			break;
		case 430405:
			s = "湖南省衡阳市珠晖区";
			break;
		case 430406:
			s = "湖南省衡阳市雁峰区";
			break;
		case 430407:
			s = "湖南省衡阳市石鼓区";
			break;
		case 430408:
			s = "湖南省衡阳市蒸湘区";
			break;
		case 430412:
			s = "湖南省衡阳市南岳区";
			break;
		case 430421:
			s = "湖南省衡阳县";
			break;
		case 430422:
			s = "湖南省衡南县";
			break;
		case 430423:
			s = "湖南省衡山县";
			break;
		case 430424:
			s = "湖南省衡东县";
			break;
		case 430426:
			s = "湖南省祁东县";
			break;
		case 430481:
			s = "湖南省耒阳市";
			break;
		case 430482:
			s = "湖南省常宁市";
			break;
		case 430500:
			s = "湖南省邵阳市";
			break;
		case 430501:
			s = "湖南省邵阳市市辖区";
			break;
		case 430502:
			s = "湖南省邵阳市双清区";
			break;
		case 430503:
			s = "湖南省邵阳市大祥区";
			break;
		case 430511:
			s = "湖南省邵阳市北塔区";
			break;
		case 430521:
			s = "湖南省邵东县";
			break;
		case 430522:
			s = "湖南省新邵县";
			break;
		case 430523:
			s = "湖南省邵阳县";
			break;
		case 430524:
			s = "湖南省隆回县";
			break;
		case 430525:
			s = "湖南省洞口县";
			break;
		case 430527:
			s = "湖南省绥宁县";
			break;
		case 430528:
			s = "湖南省新宁县";
			break;
		case 430529:
			s = "湖南省城步苗族自治县";
			break;
		case 430581:
			s = "湖南省武冈市";
			break;
		case 430600:
			s = "湖南省岳阳市";
			break;
		case 430601:
			s = "湖南省岳阳市市辖区";
			break;
		case 430602:
			s = "湖南省岳阳市岳阳楼区";
			break;
		case 430603:
			s = "湖南省岳阳市云溪区";
			break;
		case 430611:
			s = "湖南省岳阳市君山区";
			break;
		case 430621:
			s = "湖南省岳阳县";
			break;
		case 430623:
			s = "湖南省华容县";
			break;
		case 430624:
			s = "湖南省湘阴县";
			break;
		case 430626:
			s = "湖南省平江县";
			break;
		case 430681:
			s = "湖南省汨罗市";
			break;
		case 430682:
			s = "湖南省临湘市";
			break;
		case 430700:
			s = "湖南省常德市";
			break;
		case 430701:
			s = "湖南省常德市市辖区";
			break;
		case 430702:
			s = "湖南省常德市武陵区";
			break;
		case 430703:
			s = "湖南省常德市鼎城区";
			break;
		case 430721:
			s = "湖南省安乡县";
			break;
		case 430722:
			s = "湖南省汉寿县";
			break;
		case 430723:
			s = "湖南省澧县";
			break;
		case 430724:
			s = "湖南省临澧县";
			break;
		case 430725:
			s = "湖南省桃源县";
			break;
		case 430726:
			s = "湖南省石门县";
			break;
		case 430781:
			s = "湖南省津市市";
			break;
		case 430800:
			s = "湖南省张家界市";
			break;
		case 430801:
			s = "湖南省张家界市市辖区";
			break;
		case 430802:
			s = "湖南省张家界市永定区";
			break;
		case 430811:
			s = "湖南省张家界市武陵源区";
			break;
		case 430821:
			s = "湖南省慈利县";
			break;
		case 430822:
			s = "湖南省桑植县";
			break;
		case 430900:
			s = "湖南省益阳市";
			break;
		case 430901:
			s = "湖南省益阳市市辖区";
			break;
		case 430902:
			s = "湖南省益阳市资阳区";
			break;
		case 430903:
			s = "湖南省益阳市赫山区";
			break;
		case 430921:
			s = "湖南省南县";
			break;
		case 430922:
			s = "湖南省桃江县";
			break;
		case 430923:
			s = "湖南省安化县";
			break;
		case 430981:
			s = "湖南省沅江市";
			break;
		case 431000:
			s = "湖南省郴州市";
			break;
		case 431001:
			s = "湖南省郴州市市辖区";
			break;
		case 431002:
			s = "湖南省郴州市北湖区";
			break;
		case 431003:
			s = "湖南省郴州市苏仙区";
			break;
		case 431021:
			s = "湖南省桂阳县";
			break;
		case 431022:
			s = "湖南省宜章县";
			break;
		case 431023:
			s = "湖南省永兴县";
			break;
		case 431024:
			s = "湖南省嘉禾县";
			break;
		case 431025:
			s = "湖南省临武县";
			break;
		case 431026:
			s = "湖南省汝城县";
			break;
		case 431027:
			s = "湖南省桂东县";
			break;
		case 431028:
			s = "湖南省安仁县";
			break;
		case 431081:
			s = "湖南省资兴市";
			break;
		case 431100:
			s = "湖南省永州市";
			break;
		case 431101:
			s = "湖南省永州市市辖区";
			break;
		case 431102:
			s = "湖南省永州市零陵区";
			break;
		case 431103:
			s = "湖南省永州市冷水滩区";
			break;
		case 431121:
			s = "湖南省祁阳县";
			break;
		case 431122:
			s = "湖南省东安县";
			break;
		case 431123:
			s = "湖南省双牌县";
			break;
		case 431124:
			s = "湖南省道县";
			break;
		case 431125:
			s = "湖南省江永县";
			break;
		case 431126:
			s = "湖南省宁远县";
			break;
		case 431127:
			s = "湖南省蓝山县";
			break;
		case 431128:
			s = "湖南省新田县";
			break;
		case 431129:
			s = "湖南省江华瑶族自治县";
			break;
		case 431200:
			s = "湖南省怀化市";
			break;
		case 431201:
			s = "湖南省怀化市市辖区";
			break;
		case 431202:
			s = "湖南省怀化市鹤城区";
			break;
		case 431221:
			s = "湖南省中方县";
			break;
		case 431222:
			s = "湖南省沅陵县";
			break;
		case 431223:
			s = "湖南省辰溪县";
			break;
		case 431224:
			s = "湖南省溆浦县";
			break;
		case 431225:
			s = "湖南省会同县";
			break;
		case 431226:
			s = "湖南省麻阳苗族自治县";
			break;
		case 431227:
			s = "湖南省新晃侗族自治县";
			break;
		case 431228:
			s = "湖南省芷江侗族自治县";
			break;
		case 431229:
			s = "湖南省靖州苗族侗族自治县";
			break;
		case 431230:
			s = "湖南省通道侗族自治县";
			break;
		case 431281:
			s = "湖南省洪江市";
			break;
		case 431300:
			s = "湖南省娄底市";
			break;
		case 431301:
			s = "湖南省娄底市市辖区";
			break;
		case 431302:
			s = "湖南省娄底市娄星区";
			break;
		case 431321:
			s = "湖南省双峰县";
			break;
		case 431322:
			s = "湖南省新化县";
			break;
		case 431381:
			s = "湖南省冷水江市";
			break;
		case 431382:
			s = "湖南省涟源市";
			break;
		case 433100:
			s = "湖南省湘西土家族苗族自治州";
			break;
		case 433101:
			s = "湖南省吉首市";
			break;
		case 433122:
			s = "湖南省泸溪县";
			break;
		case 433123:
			s = "湖南省凤凰县";
			break;
		case 433124:
			s = "湖南省花垣县";
			break;
		case 433125:
			s = "湖南省保靖县";
			break;
		case 433126:
			s = "湖南省古丈县";
			break;
		case 433127:
			s = "湖南省永顺县";
			break;
		case 433130:
			s = "湖南省龙山县";
			break;
		case 440000:
			s = "广东省";
			break;
		case 440100:
			s = "广东省广州市";
			break;
		case 440101:
			s = "广东省广州市市辖区";
			break;
		case 440103:
			s = "广东省广州市荔湾区";
			break;
		case 440104:
			s = "广东省广州市越秀区";
			break;
		case 440105:
			s = "广东省广州市海珠区";
			break;
		case 440106:
			s = "广东省广州市天河区";
			break;
		case 440111:
			s = "广东省广州市白云区";
			break;
		case 440112:
			s = "广东省广州市黄埔区";
			break;
		case 440113:
			s = "广东省广州市番禺区";
			break;
		case 440114:
			s = "广东省广州市花都区";
			break;
		case 440115:
			s = "广东省广州市南沙区";
			break;
		case 440116:
			s = "广东省广州市萝岗区";
			break;
		case 440183:
			s = "广东省增城市";
			break;
		case 440184:
			s = "广东省从化市";
			break;
		case 440200:
			s = "广东省韶关市";
			break;
		case 440201:
			s = "广东省韶关市市辖区";
			break;
		case 440203:
			s = "广东省韶关市武江区";
			break;
		case 440204:
			s = "广东省韶关市浈江区";
			break;
		case 440205:
			s = "广东省韶关市曲江区";
			break;
		case 440222:
			s = "广东省始兴县";
			break;
		case 440224:
			s = "广东省仁化县";
			break;
		case 440229:
			s = "广东省翁源县";
			break;
		case 440232:
			s = "广东省乳源瑶族自治县";
			break;
		case 440233:
			s = "广东省新丰县";
			break;
		case 440281:
			s = "广东省乐昌市";
			break;
		case 440282:
			s = "广东省南雄市";
			break;
		case 440300:
			s = "广东省深圳市";
			break;
		case 440301:
			s = "广东省深圳市市辖区";
			break;
		case 440303:
			s = "广东省深圳市罗湖区";
			break;
		case 440304:
			s = "广东省深圳市福田区";
			break;
		case 440305:
			s = "广东省深圳市南山区";
			break;
		case 440306:
			s = "广东省深圳市宝安区";
			break;
		case 440307:
			s = "广东省深圳市龙岗区";
			break;
		case 440308:
			s = "广东省深圳市盐田区";
			break;
		case 440400:
			s = "广东省珠海市";
			break;
		case 440401:
			s = "广东省珠海市市辖区";
			break;
		case 440402:
			s = "广东省珠海市香洲区";
			break;
		case 440403:
			s = "广东省珠海市斗门区";
			break;
		case 440404:
			s = "广东省珠海市金湾区";
			break;
		case 440500:
			s = "广东省汕头市";
			break;
		case 440501:
			s = "广东省汕头市市辖区";
			break;
		case 440507:
			s = "广东省汕头市龙湖区";
			break;
		case 440511:
			s = "广东省汕头市金平区";
			break;
		case 440512:
			s = "广东省汕头市濠江区";
			break;
		case 440513:
			s = "广东省汕头市潮阳区";
			break;
		case 440514:
			s = "广东省汕头市潮南区";
			break;
		case 440515:
			s = "广东省汕头市澄海区";
			break;
		case 440523:
			s = "广东省南澳县";
			break;
		case 440600:
			s = "广东省佛山市";
			break;
		case 440601:
			s = "广东省佛山市市辖区";
			break;
		case 440604:
			s = "广东省佛山市禅城区";
			break;
		case 440605:
			s = "广东省佛山市南海区";
			break;
		case 440606:
			s = "广东省佛山市顺德区";
			break;
		case 440607:
			s = "广东省佛山市三水区";
			break;
		case 440608:
			s = "广东省佛山市高明区";
			break;
		case 440700:
			s = "广东省佛山市江门市";
			break;
		case 440701:
			s = "广东省佛山市市辖区";
			break;
		case 440703:
			s = "广东省佛山市蓬江区";
			break;
		case 440704:
			s = "广东省佛山市江海区";
			break;
		case 440705:
			s = "广东省佛山市新会区";
			break;
		case 440781:
			s = "广东省台山市";
			break;
		case 440783:
			s = "广东省开平市";
			break;
		case 440784:
			s = "广东省鹤山市";
			break;
		case 440785:
			s = "广东省恩平市";
			break;
		case 440800:
			s = "广东省湛江市";
			break;
		case 440801:
			s = "广东省湛江市市辖区";
			break;
		case 440802:
			s = "广东省湛江市赤坎区";
			break;
		case 440803:
			s = "广东省湛江市霞山区";
			break;
		case 440804:
			s = "广东省湛江市坡头区";
			break;
		case 440811:
			s = "广东省湛江市麻章区";
			break;
		case 440823:
			s = "广东省遂溪县";
			break;
		case 440825:
			s = "广东省徐闻县";
			break;
		case 440881:
			s = "广东省廉江市";
			break;
		case 440882:
			s = "广东省雷州市";
			break;
		case 440883:
			s = "广东省吴川市";
			break;
		case 440900:
			s = "广东省茂名市";
			break;
		case 440901:
			s = "广东省茂名市市辖区";
			break;
		case 440902:
			s = "广东省茂名市茂南区";
			break;
		case 440903:
			s = "广东省茂名市茂港区";
			break;
		case 440923:
			s = "广东省电白县";
			break;
		case 440981:
			s = "广东省高州市";
			break;
		case 440982:
			s = "广东省化州市";
			break;
		case 440983:
			s = "广东省信宜市";
			break;
		case 441200:
			s = "广东省肇庆市";
			break;
		case 441201:
			s = "广东省肇庆市市辖区";
			break;
		case 441202:
			s = "广东省肇庆市端州区";
			break;
		case 441203:
			s = "广东省肇庆市鼎湖区";
			break;
		case 441223:
			s = "广东省广宁县";
			break;
		case 441224:
			s = "广东省怀集县";
			break;
		case 441225:
			s = "广东省封开县";
			break;
		case 441226:
			s = "广东省德庆县";
			break;
		case 441283:
			s = "广东省高要市";
			break;
		case 441284:
			s = "广东省四会市";
			break;
		case 441300:
			s = "广东省惠州市";
			break;
		case 441301:
			s = "广东省惠州市市辖区";
			break;
		case 441302:
			s = "广东省惠州市惠城区";
			break;
		case 441303:
			s = "广东省惠州市惠阳区";
			break;
		case 441322:
			s = "广东省博罗县";
			break;
		case 441323:
			s = "广东省惠东县";
			break;
		case 441324:
			s = "广东省龙门县";
			break;
		case 441400:
			s = "广东省梅州市";
			break;
		case 441401:
			s = "广东省梅州市市辖区";
			break;
		case 441402:
			s = "广东省梅州市梅江区";
			break;
		case 441421:
			s = "广东省梅县";
			break;
		case 441422:
			s = "广东省大埔县";
			break;
		case 441423:
			s = "广东省丰顺县";
			break;
		case 441424:
			s = "广东省五华县";
			break;
		case 441426:
			s = "广东省平远县";
			break;
		case 441427:
			s = "广东省蕉岭县";
			break;
		case 441481:
			s = "广东省兴宁市";
			break;
		case 441500:
			s = "广东省汕尾市";
			break;
		case 441501:
			s = "广东省汕尾市市辖区";
			break;
		case 441502:
			s = "广东省汕尾市城区";
			break;
		case 441521:
			s = "广东省海丰县";
			break;
		case 441523:
			s = "广东省陆河县";
			break;
		case 441581:
			s = "广东省陆丰市";
			break;
		case 441600:
			s = "广东省河源市";
			break;
		case 441601:
			s = "广东省河源市市辖区";
			break;
		case 441602:
			s = "广东省河源市源城区";
			break;
		case 441621:
			s = "广东省紫金县";
			break;
		case 441622:
			s = "广东省龙川县";
			break;
		case 441623:
			s = "广东省连平县";
			break;
		case 441624:
			s = "广东省和平县";
			break;
		case 441625:
			s = "广东省东源县";
			break;
		case 441700:
			s = "广东省阳江市";
			break;
		case 441701:
			s = "广东省阳江市市辖区";
			break;
		case 441702:
			s = "广东省阳江市江城区";
			break;
		case 441721:
			s = "广东省阳西县";
			break;
		case 441723:
			s = "广东省阳东县";
			break;
		case 441781:
			s = "广东省阳春市";
			break;
		case 441800:
			s = "广东省清远市";
			break;
		case 441801:
			s = "广东省清远市市辖区";
			break;
		case 441802:
			s = "广东省清远市清城区";
			break;
		case 441821:
			s = "广东省佛冈县";
			break;
		case 441823:
			s = "广东省阳山县";
			break;
		case 441825:
			s = "广东省连山壮族瑶族自治县";
			break;
		case 441826:
			s = "广东省连南瑶族自治县";
			break;
		case 441827:
			s = "广东省清新县";
			break;
		case 441881:
			s = "广东省英德市";
			break;
		case 441882:
			s = "广东省连州市";
			break;
		case 441900:
			s = "广东省东莞市";
			break;
		case 442000:
			s = "广东省中山市";
			break;
		case 445100:
			s = "广东省潮州市";
			break;
		case 445101:
			s = "广东省潮州市市辖区";
			break;
		case 445102:
			s = "广东省潮州市湘桥区";
			break;
		case 445121:
			s = "广东省潮安县";
			break;
		case 445122:
			s = "广东省饶平县";
			break;
		case 445200:
			s = "广东省揭阳市";
			break;
		case 445201:
			s = "广东省揭阳市市辖区";
			break;
		case 445202:
			s = "广东省揭阳市榕城区";
			break;
		case 445221:
			s = "广东省揭东县";
			break;
		case 445222:
			s = "广东省揭西县";
			break;
		case 445224:
			s = "广东省惠来县";
			break;
		case 445281:
			s = "广东省普宁市";
			break;
		case 445300:
			s = "广东省云浮市";
			break;
		case 445301:
			s = "广东省云浮市市辖区";
			break;
		case 445302:
			s = "广东省云浮市云城区";
			break;
		case 445321:
			s = "广东省云浮市新兴县";
			break;
		case 445322:
			s = "广东省云浮市郁南县";
			break;
		case 445323:
			s = "广东省云浮市云安县";
			break;
		case 445381:
			s = "广东省云浮市罗定市";
			break;
		case 450000:
			s = "广西壮族自治区";
			break;
		case 450100:
			s = "广西南宁市";
			break;
		case 450101:
			s = "广西南宁市市辖区";
			break;
		case 450102:
			s = "广西南宁市兴宁区";
			break;
		case 450103:
			s = "广西南宁市青秀区";
			break;
		case 450105:
			s = "广西南宁市江南区";
			break;
		case 450107:
			s = "广西南宁市西乡塘区";
			break;
		case 450108:
			s = "广西南宁市良庆区";
			break;
		case 450109:
			s = "广西南宁市邕宁区";
			break;
		case 450122:
			s = "广西武鸣县";
			break;
		case 450123:
			s = "广西隆安县";
			break;
		case 450124:
			s = "广西马山县";
			break;
		case 450125:
			s = "广西上林县";
			break;
		case 450126:
			s = "广西宾阳县";
			break;
		case 450127:
			s = "广西横县";
			break;
		case 450200:
			s = "广西柳州市";
			break;
		case 450201:
			s = "广西柳州市市辖区";
			break;
		case 450202:
			s = "广西柳州市城中区";
			break;
		case 450203:
			s = "广西柳州市鱼峰区";
			break;
		case 450204:
			s = "广西柳州市柳南区";
			break;
		case 450205:
			s = "广西柳州市柳北区";
			break;
		case 450221:
			s = "广西柳江县";
			break;
		case 450222:
			s = "广西柳城县";
			break;
		case 450223:
			s = "广西鹿寨县";
			break;
		case 450224:
			s = "广西融安县";
			break;
		case 450225:
			s = "广西融水苗族自治县";
			break;
		case 450226:
			s = "广西三江侗族自治县";
			break;
		case 450300:
			s = "广西桂林市";
			break;
		case 450301:
			s = "广西桂林市市辖区";
			break;
		case 450302:
			s = "广西桂林市秀峰区";
			break;
		case 450303:
			s = "广西桂林市叠彩区";
			break;
		case 450304:
			s = "广西桂林市象山区";
			break;
		case 450305:
			s = "广西桂林市七星区";
			break;
		case 450311:
			s = "广西桂林市雁山区";
			break;
		case 450321:
			s = "广西阳朔县";
			break;
		case 450322:
			s = "广西临桂县";
			break;
		case 450323:
			s = "广西灵川县";
			break;
		case 450324:
			s = "广西全州县";
			break;
		case 450325:
			s = "广西兴安县";
			break;
		case 450326:
			s = "广西永福县";
			break;
		case 450327:
			s = "广西灌阳县";
			break;
		case 450328:
			s = "广西龙胜各族自治县";
			break;
		case 450329:
			s = "广西资源县";
			break;
		case 450330:
			s = "广西平乐县";
			break;
		case 450331:
			s = "广西荔蒲县";
			break;
		case 450332:
			s = "广西恭城瑶族自治县";
			break;
		case 450400:
			s = "广西梧州市";
			break;
		case 450401:
			s = "广西梧州市市辖区";
			break;
		case 450403:
			s = "广西梧州市万秀区";
			break;
		case 450404:
			s = "广西梧州市蝶山区";
			break;
		case 450405:
			s = "广西梧州市长洲区";
			break;
		case 450421:
			s = "广西苍梧县";
			break;
		case 450422:
			s = "广西藤县";
			break;
		case 450423:
			s = "广西蒙山县";
			break;
		case 450481:
			s = "广西岑溪市";
			break;
		case 450500:
			s = "广西北海市";
			break;
		case 450501:
			s = "广西北海市市辖区";
			break;
		case 450502:
			s = "广西北海市海城区";
			break;
		case 450503:
			s = "广西北海市银海区";
			break;
		case 450512:
			s = "广西北海市铁山港区";
			break;
		case 450521:
			s = "广西合浦县";
			break;
		case 450600:
			s = "广西防城港市";
			break;
		case 450601:
			s = "广西防城港市市辖区";
			break;
		case 450602:
			s = "广西防城港市港口区";
			break;
		case 450603:
			s = "广西防城港市防城区";
			break;
		case 450621:
			s = "广西上思县";
			break;
		case 450681:
			s = "广西东兴市";
			break;
		case 450700:
			s = "广西钦州市";
			break;
		case 450701:
			s = "广西钦州市市辖区";
			break;
		case 450702:
			s = "广西钦州市钦南区";
			break;
		case 450703:
			s = "广西钦州市钦北区";
			break;
		case 450721:
			s = "广西灵山县";
			break;
		case 450722:
			s = "广西浦北县";
			break;
		case 450800:
			s = "广西贵港市";
			break;
		case 450801:
			s = "广西贵港市市辖区";
			break;
		case 450802:
			s = "广西贵港市港北区";
			break;
		case 450803:
			s = "广西贵港市港南区";
			break;
		case 450804:
			s = "广西贵港市覃塘区";
			break;
		case 450821:
			s = "广西平南县";
			break;
		case 450881:
			s = "广西桂平市";
			break;
		case 450900:
			s = "广西玉林市";
			break;
		case 450901:
			s = "广西玉林市市辖区";
			break;
		case 450902:
			s = "广西玉林市玉州区";
			break;
		case 450921:
			s = "广西容县";
			break;
		case 450922:
			s = "广西陆川县";
			break;
		case 450923:
			s = "广西博白县";
			break;
		case 450924:
			s = "广西兴业县";
			break;
		case 450981:
			s = "广西北流市";
			break;
		case 451000:
			s = "广西百色市";
			break;
		case 451001:
			s = "广西百色市市辖区";
			break;
		case 451002:
			s = "广西百色市右江区";
			break;
		case 451021:
			s = "广西田阳县";
			break;
		case 451022:
			s = "广西田东县";
			break;
		case 451023:
			s = "广西平果县";
			break;
		case 451024:
			s = "广西德保县";
			break;
		case 451025:
			s = "广西靖西县";
			break;
		case 451026:
			s = "广西那坡县";
			break;
		case 451027:
			s = "广西凌云县";
			break;
		case 451028:
			s = "广西乐业县";
			break;
		case 451029:
			s = "广西田林县";
			break;
		case 451030:
			s = "广西西林县";
			break;
		case 451031:
			s = "广西隆林各族自治县";
			break;
		case 451100:
			s = "广西贺州市";
			break;
		case 451101:
			s = "广西贺州市市辖区";
			break;
		case 451102:
			s = "广西贺州市八步区";
			break;
		case 451121:
			s = "广西昭平县";
			break;
		case 451122:
			s = "广西钟山县";
			break;
		case 451123:
			s = "广西富川瑶族自治县";
			break;
		case 451200:
			s = "广西河池市";
			break;
		case 451201:
			s = "广西河池市市辖区";
			break;
		case 451202:
			s = "广西河池市金城江区";
			break;
		case 451221:
			s = "广西南丹县";
			break;
		case 451222:
			s = "广西天峨县";
			break;
		case 451223:
			s = "广西凤山县";
			break;
		case 451224:
			s = "广西东兰县";
			break;
		case 451225:
			s = "广西罗城仫佬族自治县";
			break;
		case 451226:
			s = "广西环江毛南族自治县";
			break;
		case 451227:
			s = "广西巴马瑶族自治县";
			break;
		case 451228:
			s = "广西都安瑶族自治县";
			break;
		case 451229:
			s = "广西大化瑶族自治县";
			break;
		case 451281:
			s = "广西宜州市";
			break;
		case 451300:
			s = "广西来宾市";
			break;
		case 451301:
			s = "广西来宾市市辖区";
			break;
		case 451302:
			s = "广西来宾市兴宾区";
			break;
		case 451321:
			s = "广西忻城县";
			break;
		case 451322:
			s = "广西象州县";
			break;
		case 451323:
			s = "广西武宣县";
			break;
		case 451324:
			s = "广西金秀瑶族自治县";
			break;
		case 451381:
			s = "广西合山市";
			break;
		case 451400:
			s = "广西崇左市";
			break;
		case 451401:
			s = "广西崇左市市辖区";
			break;
		case 451402:
			s = "广西崇左市江洲区";
			break;
		case 451421:
			s = "广西扶绥县";
			break;
		case 451422:
			s = "广西宁明县";
			break;
		case 451423:
			s = "广西龙州县";
			break;
		case 451424:
			s = "广西大新县";
			break;
		case 451425:
			s = "广西天等县";
			break;
		case 451481:
			s = "广西凭祥市";
			break;
		case 460000:
			s = "海南省";
			break;
		case 460100:
			s = "海南省海口市";
			break;
		case 460101:
			s = "海南省海口市市辖区";
			break;
		case 460105:
			s = "海南省海口市秀英区";
			break;
		case 460106:
			s = "海南省海口市龙华区";
			break;
		case 460107:
			s = "海南省海口市琼山区";
			break;
		case 460108:
			s = "海南省海口市美兰区";
			break;
		case 460200:
			s = "海南省三亚市";
			break;
		case 460201:
			s = "海南省三亚市市辖区";
			break;
		case 469001:
			s = "海南省五指山市";
			break;
		case 469002:
			s = "海南省琼海市";
			break;
		case 469003:
			s = "海南省儋州市";
			break;
		case 469005:
			s = "海南省文昌市";
			break;
		case 469006:
			s = "海南省万宁市";
			break;
		case 469007:
			s = "海南省东方市";
			break;
		case 469021:
			s = "海南省定安县";
			break;
		case 469022:
			s = "海南省屯昌县";
			break;
		case 469023:
			s = "海南省澄迈县";
			break;
		case 469024:
			s = "海南省临高县";
			break;
		case 469025:
			s = "海南省白沙黎族自治县";
			break;
		case 469026:
			s = "海南省昌江黎族自治县";
			break;
		case 469027:
			s = "海南省乐东黎族自治县";
			break;
		case 469028:
			s = "海南省陵水黎族自治县";
			break;
		case 469029:
			s = "海南省保亭黎族苗族自治县";
			break;
		case 469030:
			s = "海南省琼中黎族苗族自治县";
			break;
		case 469031:
			s = "海南省西沙群岛";
			break;
		case 469032:
			s = "海南省南沙群岛";
			break;
		case 469033:
			s = "海南省中沙群岛的岛礁及其海域";
			break;
		case 500000:
			s = "重庆市";
			break;
		case 500100:
			s = "重庆市市辖区";
			break;
		case 500101:
			s = "重庆市万州区";
			break;
		case 500102:
			s = "重庆市涪陵区";
			break;
		case 500103:
			s = "重庆市渝中区";
			break;
		case 500104:
			s = "重庆市大渡口区";
			break;
		case 500105:
			s = "重庆市江北区";
			break;
		case 500106:
			s = "重庆市沙坪坝区";
			break;
		case 500107:
			s = "重庆市九龙坡区";
			break;
		case 500108:
			s = "重庆市南岸区";
			break;
		case 500109:
			s = "重庆市北碚区";
			break;
		case 500110:
			s = "重庆市万盛区";
			break;
		case 500111:
			s = "重庆市双桥区";
			break;
		case 500112:
			s = "重庆市渝北区";
			break;
		case 500113:
			s = "重庆市巴南区";
			break;
		case 500114:
			s = "重庆市黔江区";
			break;
		case 500115:
			s = "重庆市长寿区";
			break;
		case 500116:
			s = "重庆市江津区";
			break;
		case 500117:
			s = "重庆市合川区";
			break;
		case 500118:
			s = "重庆市永川区";
			break;
		case 500119:
			s = "重庆市南川区";
			break;
		case 500222:
			s = "重庆市綦江县";
			break;
		case 500223:
			s = "重庆市潼南县";
			break;
		case 500224:
			s = "重庆市铜梁县";
			break;
		case 500225:
			s = "重庆市大足县";
			break;
		case 500226:
			s = "重庆市荣昌县";
			break;
		case 500227:
			s = "重庆市璧山县";
			break;
		case 500228:
			s = "重庆市梁平县";
			break;
		case 500229:
			s = "重庆市城口县";
			break;
		case 500230:
			s = "重庆市丰都县";
			break;
		case 500231:
			s = "重庆市垫江县";
			break;
		case 500232:
			s = "重庆市武隆县";
			break;
		case 500233:
			s = "重庆市忠县";
			break;
		case 500234:
			s = "重庆市开县";
			break;
		case 500235:
			s = "重庆市云阳县";
			break;
		case 500236:
			s = "重庆市奉节县";
			break;
		case 500237:
			s = "重庆市巫山县";
			break;
		case 500238:
			s = "重庆市巫溪县";
			break;
		case 500240:
			s = "重庆市石柱土家族自治县";
			break;
		case 500241:
			s = "重庆市秀山土家族苗族自治县";
			break;
		case 500242:
			s = "重庆市酉阳土家族苗族自治县";
			break;
		case 500243:
			s = "重庆市彭水苗族土家族自治县";
			break;
		case 510000:
			s = "四川省";
			break;
		case 510100:
			s = "四川省成都市";
			break;
		case 510101:
			s = "四川省成都市市辖区";
			break;
		case 510104:
			s = "四川省成都市锦江区";
			break;
		case 510105:
			s = "四川省成都市青羊区";
			break;
		case 510106:
			s = "四川省成都市金牛区";
			break;
		case 510107:
			s = "四川省成都市武侯区";
			break;
		case 510108:
			s = "四川省成都市成华区";
			break;
		case 510112:
			s = "四川省成都市龙泉驿区";
			break;
		case 510113:
			s = "四川省成都市青白江区";
			break;
		case 510114:
			s = "四川省成都市新都区";
			break;
		case 510115:
			s = "四川省成都市温江区";
			break;
		case 510121:
			s = "四川省金堂县";
			break;
		case 510122:
			s = "四川省双流县";
			break;
		case 510124:
			s = "四川省郫县";
			break;
		case 510129:
			s = "四川省大邑县";
			break;
		case 510131:
			s = "四川省蒲江县";
			break;
		case 510132:
			s = "四川省新津县";
			break;
		case 510181:
			s = "四川省都江堰市";
			break;
		case 510182:
			s = "四川省彭州市";
			break;
		case 510183:
			s = "四川省邛崃市";
			break;
		case 510184:
			s = "四川省崇州市";
			break;
		case 510300:
			s = "四川省自贡市";
			break;
		case 510301:
			s = "四川省自贡市市辖区";
			break;
		case 510302:
			s = "四川省自贡市自流井区";
			break;
		case 510303:
			s = "四川省自贡市贡井区";
			break;
		case 510304:
			s = "四川省自贡市大安区";
			break;
		case 510311:
			s = "四川省自贡市沿滩区";
			break;
		case 510321:
			s = "四川省荣县";
			break;
		case 510322:
			s = "四川省富顺县";
			break;
		case 510400:
			s = "四川省攀枝花市";
			break;
		case 510401:
			s = "四川省攀枝花市市辖区";
			break;
		case 510402:
			s = "四川省攀枝花市东区";
			break;
		case 510403:
			s = "四川省攀枝花市西区";
			break;
		case 510411:
			s = "四川省攀枝花市仁和区";
			break;
		case 510421:
			s = "四川省米易县";
			break;
		case 510422:
			s = "四川省盐边县";
			break;
		case 510500:
			s = "四川省泸州市";
			break;
		case 510501:
			s = "四川省泸州市市辖区";
			break;
		case 510502:
			s = "四川省泸州市江阳区";
			break;
		case 510503:
			s = "四川省泸州市纳溪区";
			break;
		case 510504:
			s = "四川省泸州市龙马潭区";
			break;
		case 510521:
			s = "四川省泸县";
			break;
		case 510522:
			s = "四川省合江县";
			break;
		case 510524:
			s = "四川省叙永县";
			break;
		case 510525:
			s = "四川省古蔺县";
			break;
		case 510600:
			s = "四川省德阳市";
			break;
		case 510601:
			s = "四川省德阳市市辖区";
			break;
		case 510603:
			s = "四川省德阳市旌阳区";
			break;
		case 510623:
			s = "四川省中江县";
			break;
		case 510626:
			s = "四川省罗江县";
			break;
		case 510681:
			s = "四川省广汉市";
			break;
		case 510682:
			s = "四川省什邡市";
			break;
		case 510683:
			s = "四川省绵竹市";
			break;
		case 510700:
			s = "四川省绵阳市";
			break;
		case 510701:
			s = "四川省绵阳市市辖区";
			break;
		case 510703:
			s = "四川省绵阳市涪城区";
			break;
		case 510704:
			s = "四川省绵阳市游仙区";
			break;
		case 510722:
			s = "四川省三台县";
			break;
		case 510723:
			s = "四川省盐亭县";
			break;
		case 510724:
			s = "四川省安县";
			break;
		case 510725:
			s = "四川省梓潼县";
			break;
		case 510726:
			s = "四川省北川羌族自治县";
			break;
		case 510727:
			s = "四川省平武县";
			break;
		case 510781:
			s = "四川省江油市";
			break;
		case 510800:
			s = "四川省广元市";
			break;
		case 510801:
			s = "四川省广元市市辖区";
			break;
		case 510802:
			s = "四川省广元市市中区";
			break;
		case 510811:
			s = "四川省广元市元坝区";
			break;
		case 510812:
			s = "四川省广元市朝天区";
			break;
		case 510821:
			s = "四川省旺苍县";
			break;
		case 510822:
			s = "四川省青川县";
			break;
		case 510823:
			s = "四川省剑阁县";
			break;
		case 510824:
			s = "四川省苍溪县";
			break;
		case 510900:
			s = "四川省遂宁市";
			break;
		case 510901:
			s = "四川省遂宁市市辖区";
			break;
		case 510903:
			s = "四川省遂宁市船山区";
			break;
		case 510904:
			s = "四川省遂宁市安居区";
			break;
		case 510921:
			s = "四川省蓬溪县";
			break;
		case 510922:
			s = "四川省射洪县";
			break;
		case 510923:
			s = "四川省大英县";
			break;
		case 511000:
			s = "四川省内江市";
			break;
		case 511001:
			s = "四川省内江市市辖区";
			break;
		case 511002:
			s = "四川省内江市市中区";
			break;
		case 511011:
			s = "四川省内江市东兴区";
			break;
		case 511024:
			s = "四川省威远县";
			break;
		case 511025:
			s = "四川省资中县";
			break;
		case 511028:
			s = "四川省隆昌县";
			break;
		case 511100:
			s = "四川省乐山市";
			break;
		case 511101:
			s = "四川省乐山市市辖区";
			break;
		case 511102:
			s = "四川省乐山市市中区";
			break;
		case 511111:
			s = "四川省乐山市沙湾区";
			break;
		case 511112:
			s = "四川省乐山市五通桥区";
			break;
		case 511113:
			s = "四川省乐山市金口河区";
			break;
		case 511123:
			s = "四川省犍为县";
			break;
		case 511124:
			s = "四川省井研县";
			break;
		case 511126:
			s = "四川省夹江县";
			break;
		case 511129:
			s = "四川省沐川县";
			break;
		case 511132:
			s = "四川省峨边彝族自治县";
			break;
		case 511133:
			s = "四川省马边彝族自治县";
			break;
		case 511181:
			s = "四川省峨眉山市";
			break;
		case 511300:
			s = "四川省南充市";
			break;
		case 511301:
			s = "四川省南充市市辖区";
			break;
		case 511302:
			s = "四川省南充市顺庆区";
			break;
		case 511303:
			s = "四川省南充市高坪区";
			break;
		case 511304:
			s = "四川省南充市嘉陵区";
			break;
		case 511321:
			s = "四川省南部县";
			break;
		case 511322:
			s = "四川省营山县";
			break;
		case 511323:
			s = "四川省蓬安县";
			break;
		case 511324:
			s = "四川省仪陇县";
			break;
		case 511325:
			s = "四川省西充县";
			break;
		case 511381:
			s = "四川省阆中市";
			break;
		case 511400:
			s = "四川省眉山市";
			break;
		case 511401:
			s = "四川省眉山市市辖区";
			break;
		case 511402:
			s = "四川省眉山市东坡区";
			break;
		case 511421:
			s = "四川省仁寿县";
			break;
		case 511422:
			s = "四川省彭山县";
			break;
		case 511423:
			s = "四川省洪雅县";
			break;
		case 511424:
			s = "四川省丹棱县";
			break;
		case 511425:
			s = "四川省青神县";
			break;
		case 511500:
			s = "四川省宜宾市";
			break;
		case 511501:
			s = "四川省宜宾市市辖区";
			break;
		case 511502:
			s = "四川省宜宾市翠屏区";
			break;
		case 511521:
			s = "四川省宜宾县";
			break;
		case 511522:
			s = "四川省南溪县";
			break;
		case 511523:
			s = "四川省江安县";
			break;
		case 511524:
			s = "四川省长宁县";
			break;
		case 511525:
			s = "四川省高县";
			break;
		case 511526:
			s = "四川省珙县";
			break;
		case 511527:
			s = "四川省筠连县";
			break;
		case 511528:
			s = "四川省兴文县";
			break;
		case 511529:
			s = "四川省屏山县";
			break;
		case 511600:
			s = "四川省广安市";
			break;
		case 511601:
			s = "四川省广安市市辖区";
			break;
		case 511602:
			s = "四川省广安市广安区";
			break;
		case 511621:
			s = "四川省岳池县";
			break;
		case 511622:
			s = "四川省武胜县";
			break;
		case 511623:
			s = "四川省邻水县";
			break;
		case 511681:
			s = "四川省华蓥市";
			break;
		case 511700:
			s = "四川省达州市";
			break;
		case 511701:
			s = "四川省达州市市辖区";
			break;
		case 511702:
			s = "四川省达州市通川区";
			break;
		case 511721:
			s = "四川省达县";
			break;
		case 511722:
			s = "四川省宣汉县";
			break;
		case 511723:
			s = "四川省开江县";
			break;
		case 511724:
			s = "四川省大竹县";
			break;
		case 511725:
			s = "四川省渠县";
			break;
		case 511781:
			s = "四川省万源市";
			break;
		case 511800:
			s = "四川省雅安市";
			break;
		case 511801:
			s = "四川省雅安市市辖区";
			break;
		case 511802:
			s = "四川省雅安市雨城区";
			break;
		case 511821:
			s = "四川省名山县";
			break;
		case 511822:
			s = "四川省荥经县";
			break;
		case 511823:
			s = "四川省汉源县";
			break;
		case 511824:
			s = "四川省石棉县";
			break;
		case 511825:
			s = "四川省天全县";
			break;
		case 511826:
			s = "四川省芦山县";
			break;
		case 511827:
			s = "四川省宝兴县";
			break;
		case 511900:
			s = "四川省巴中市";
			break;
		case 511901:
			s = "四川省巴中市市辖区";
			break;
		case 511902:
			s = "四川省巴中市巴州区";
			break;
		case 511921:
			s = "四川省通江县";
			break;
		case 511922:
			s = "四川省南江县";
			break;
		case 511923:
			s = "四川省平昌县";
			break;
		case 512000:
			s = "四川省资阳市";
			break;
		case 512001:
			s = "四川省资阳市市辖区";
			break;
		case 512002:
			s = "四川省资阳市雁江区";
			break;
		case 512021:
			s = "四川省安岳县";
			break;
		case 512022:
			s = "四川省乐至县";
			break;
		case 512081:
			s = "四川省简阳市";
			break;
		case 513200:
			s = "四川省阿坝藏族羌族自治州";
			break;
		case 513221:
			s = "四川省汶川县";
			break;
		case 513222:
			s = "四川省理县";
			break;
		case 513223:
			s = "四川省茂县";
			break;
		case 513224:
			s = "四川省松潘县";
			break;
		case 513225:
			s = "四川省九寨沟县";
			break;
		case 513226:
			s = "四川省金川县";
			break;
		case 513227:
			s = "四川省小金县";
			break;
		case 513228:
			s = "四川省黑水县";
			break;
		case 513229:
			s = "四川省马尔康县";
			break;
		case 513230:
			s = "四川省壤塘县";
			break;
		case 513231:
			s = "四川省阿坝县";
			break;
		case 513232:
			s = "四川省若尔盖县";
			break;
		case 513233:
			s = "四川省红原县";
			break;
		case 513300:
			s = "四川省甘孜藏族自治州";
			break;
		case 513321:
			s = "四川省康定县";
			break;
		case 513322:
			s = "四川省泸定县";
			break;
		case 513323:
			s = "四川省丹巴县";
			break;
		case 513324:
			s = "四川省九龙县";
			break;
		case 513325:
			s = "四川省雅江县";
			break;
		case 513326:
			s = "四川省道孚县";
			break;
		case 513327:
			s = "四川省炉霍县";
			break;
		case 513328:
			s = "四川省甘孜县";
			break;
		case 513329:
			s = "四川省新龙县";
			break;
		case 513330:
			s = "四川省德格县";
			break;
		case 513331:
			s = "四川省白玉县";
			break;
		case 513332:
			s = "四川省石渠县";
			break;
		case 513333:
			s = "四川省色达县";
			break;
		case 513334:
			s = "四川省理塘县";
			break;
		case 513335:
			s = "四川省巴塘县";
			break;
		case 513336:
			s = "四川省乡城县";
			break;
		case 513337:
			s = "四川省稻城县";
			break;
		case 513338:
			s = "四川省得荣县";
			break;
		case 513400:
			s = "四川省凉山彝族自治州";
			break;
		case 513401:
			s = "四川省西昌市";
			break;
		case 513422:
			s = "四川省木里藏族自治县";
			break;
		case 513423:
			s = "四川省盐源县";
			break;
		case 513424:
			s = "四川省德昌县";
			break;
		case 513425:
			s = "四川省会理县";
			break;
		case 513426:
			s = "四川省会东县";
			break;
		case 513427:
			s = "四川省宁南县";
			break;
		case 513428:
			s = "四川省普格县";
			break;
		case 513429:
			s = "四川省布拖县";
			break;
		case 513430:
			s = "四川省金阳县";
			break;
		case 513431:
			s = "四川省昭觉县";
			break;
		case 513432:
			s = "四川省喜德县";
			break;
		case 513433:
			s = "四川省冕宁县";
			break;
		case 513434:
			s = "四川省越西县";
			break;
		case 513435:
			s = "四川省甘洛县";
			break;
		case 513436:
			s = "四川省美姑县";
			break;
		case 513437:
			s = "四川省雷波县";
			break;
		case 520000:
			s = "贵州省";
			break;
		case 520100:
			s = "贵州省贵阳市";
			break;
		case 520101:
			s = "贵州省贵阳市市辖区";
			break;
		case 520102:
			s = "贵州省贵阳市南明区";
			break;
		case 520103:
			s = "贵州省贵阳市云岩区";
			break;
		case 520111:
			s = "贵州省贵阳市花溪区";
			break;
		case 520112:
			s = "贵州省贵阳市乌当区";
			break;
		case 520113:
			s = "贵州省贵阳市白云区";
			break;
		case 520114:
			s = "贵州省贵阳市小河区";
			break;
		case 520121:
			s = "贵州省开阳县";
			break;
		case 520122:
			s = "贵州省息烽县";
			break;
		case 520123:
			s = "贵州省修文县";
			break;
		case 520181:
			s = "贵州省清镇市";
			break;
		case 520200:
			s = "贵州省六盘水市";
			break;
		case 520201:
			s = "贵州省六盘水市钟山区";
			break;
		case 520203:
			s = "贵州省六盘水市六枝特区";
			break;
		case 520221:
			s = "贵州省水城县";
			break;
		case 520222:
			s = "贵州省盘县";
			break;
		case 520300:
			s = "贵州省遵义市";
			break;
		case 520301:
			s = "贵州省遵义市市辖区";
			break;
		case 520302:
			s = "贵州省遵义市红花岗区";
			break;
		case 520303:
			s = "贵州省遵义市汇川区";
			break;
		case 520321:
			s = "贵州省遵义县";
			break;
		case 520322:
			s = "贵州省桐梓县";
			break;
		case 520323:
			s = "贵州省绥阳县";
			break;
		case 520324:
			s = "贵州省正安县";
			break;
		case 520325:
			s = "贵州省道真仡佬族苗族自治县";
			break;
		case 520326:
			s = "贵州省务川仡佬族苗族自治县";
			break;
		case 520327:
			s = "贵州省凤冈县";
			break;
		case 520328:
			s = "贵州省湄潭县";
			break;
		case 520329:
			s = "贵州省余庆县";
			break;
		case 520330:
			s = "贵州省习水县";
			break;
		case 520381:
			s = "贵州省赤水市";
			break;
		case 520382:
			s = "贵州省仁怀市";
			break;
		case 520400:
			s = "贵州省安顺市";
			break;
		case 520401:
			s = "贵州省安顺市市辖区";
			break;
		case 520402:
			s = "贵州省安顺市西秀区";
			break;
		case 520421:
			s = "贵州省平坝县";
			break;
		case 520422:
			s = "贵州省普定县";
			break;
		case 520423:
			s = "贵州省镇宁布依族苗族自治县";
			break;
		case 520424:
			s = "贵州省关岭布依族苗族自治县";
			break;
		case 520425:
			s = "贵州省紫云苗族布依族自治县";
			break;
		case 522200:
			s = "贵州省铜仁地区";
			break;
		case 522201:
			s = "贵州省铜仁市";
			break;
		case 522222:
			s = "贵州省江口县";
			break;
		case 522223:
			s = "贵州省玉屏侗族自治县";
			break;
		case 522224:
			s = "贵州省石阡县";
			break;
		case 522225:
			s = "贵州省思南县";
			break;
		case 522226:
			s = "贵州省印江土家族苗族自治县";
			break;
		case 522227:
			s = "贵州省德江县";
			break;
		case 522228:
			s = "贵州省沿河土家族自治县";
			break;
		case 522229:
			s = "贵州省松桃苗族自治县";
			break;
		case 522230:
			s = "贵州省万山特区";
			break;
		case 522300:
			s = "贵州省黔西南布依族苗族自治州";
			break;
		case 522301:
			s = "贵州省兴义市";
			break;
		case 522322:
			s = "贵州省兴仁县";
			break;
		case 522323:
			s = "贵州省普安县";
			break;
		case 522324:
			s = "贵州省晴隆县";
			break;
		case 522325:
			s = "贵州省贞丰县";
			break;
		case 522326:
			s = "贵州省望谟县";
			break;
		case 522327:
			s = "贵州省册亨县";
			break;
		case 522328:
			s = "贵州省安龙县";
			break;
		case 522400:
			s = "贵州省毕节地区";
			break;
		case 522401:
			s = "贵州省毕节市";
			break;
		case 522422:
			s = "贵州省大方县";
			break;
		case 522423:
			s = "贵州省黔西县";
			break;
		case 522424:
			s = "贵州省金沙县";
			break;
		case 522425:
			s = "贵州省织金县";
			break;
		case 522426:
			s = "贵州省纳雍县";
			break;
		case 522427:
			s = "贵州省威宁彝族回族苗族自治县";
			break;
		case 522428:
			s = "贵州省赫章县";
			break;
		case 522600:
			s = "贵州省黔东南苗族侗族自治州";
			break;
		case 522601:
			s = "贵州省凯里市";
			break;
		case 522622:
			s = "贵州省黄平县";
			break;
		case 522623:
			s = "贵州省施秉县";
			break;
		case 522624:
			s = "贵州省三穗县";
			break;
		case 522625:
			s = "贵州省镇远县";
			break;
		case 522626:
			s = "贵州省岑巩县";
			break;
		case 522627:
			s = "贵州省天柱县";
			break;
		case 522628:
			s = "贵州省锦屏县";
			break;
		case 522629:
			s = "贵州省剑河县";
			break;
		case 522630:
			s = "贵州省台江县";
			break;
		case 522631:
			s = "贵州省黎平县";
			break;
		case 522632:
			s = "贵州省榕江县";
			break;
		case 522633:
			s = "贵州省从江县";
			break;
		case 522634:
			s = "贵州省雷山县";
			break;
		case 522635:
			s = "贵州省麻江县";
			break;
		case 522636:
			s = "贵州省丹寨县";
			break;
		case 522700:
			s = "贵州省黔南布依族苗族自治州";
			break;
		case 522701:
			s = "贵州省都匀市";
			break;
		case 522702:
			s = "贵州省福泉市";
			break;
		case 522722:
			s = "贵州省荔波县";
			break;
		case 522723:
			s = "贵州省贵定县";
			break;
		case 522725:
			s = "贵州省瓮安县";
			break;
		case 522726:
			s = "贵州省独山县";
			break;
		case 522727:
			s = "贵州省平塘县";
			break;
		case 522728:
			s = "贵州省罗甸县";
			break;
		case 522729:
			s = "贵州省长顺县";
			break;
		case 522730:
			s = "贵州省龙里县";
			break;
		case 522731:
			s = "贵州省惠水县";
			break;
		case 522732:
			s = "贵州省三都水族自治县";
			break;
		case 530000:
			s = "云南省";
			break;
		case 530100:
			s = "云南省昆明市";
			break;
		case 530101:
			s = "云南省昆明市市辖区";
			break;
		case 530102:
			s = "云南省昆明市五华区";
			break;
		case 530103:
			s = "云南省昆明市盘龙区";
			break;
		case 530111:
			s = "云南省昆明市官渡区";
			break;
		case 530112:
			s = "云南省昆明市西山区";
			break;
		case 530113:
			s = "云南省昆明市东川区";
			break;
		case 530121:
			s = "云南省呈贡县";
			break;
		case 530122:
			s = "云南省晋宁县";
			break;
		case 530124:
			s = "云南省富民县";
			break;
		case 530125:
			s = "云南省宜良县";
			break;
		case 530126:
			s = "云南省石林彝族自治县";
			break;
		case 530127:
			s = "云南省嵩明县";
			break;
		case 530128:
			s = "云南省禄劝彝族苗族自治县";
			break;
		case 530129:
			s = "云南省寻甸回族彝族自治县";
			break;
		case 530181:
			s = "云南省安宁市";
			break;
		case 530300:
			s = "云南省曲靖市";
			break;
		case 530301:
			s = "云南省曲靖市市辖区";
			break;
		case 530302:
			s = "云南省曲靖市麒麟区";
			break;
		case 530321:
			s = "云南省马龙县";
			break;
		case 530322:
			s = "云南省陆良县";
			break;
		case 530323:
			s = "云南省师宗县";
			break;
		case 530324:
			s = "云南省罗平县";
			break;
		case 530325:
			s = "云南省富源县";
			break;
		case 530326:
			s = "云南省会泽县";
			break;
		case 530328:
			s = "云南省沾益县";
			break;
		case 530381:
			s = "云南省宣威市";
			break;
		case 530400:
			s = "云南省玉溪市";
			break;
		case 530401:
			s = "云南省玉溪市市辖区";
			break;
		case 530402:
			s = "云南省玉溪市红塔区";
			break;
		case 530421:
			s = "云南省江川县";
			break;
		case 530422:
			s = "云南省澄江县";
			break;
		case 530423:
			s = "云南省通海县";
			break;
		case 530424:
			s = "云南省华宁县";
			break;
		case 530425:
			s = "云南省易门县";
			break;
		case 530426:
			s = "云南省峨山彝族自治县";
			break;
		case 530427:
			s = "云南省新平彝族傣族自治县";
			break;
		case 530428:
			s = "云南省元江哈尼族彝族傣族自治县";
			break;
		case 530500:
			s = "云南省保山市";
			break;
		case 530501:
			s = "云南省保山市市辖区";
			break;
		case 530502:
			s = "云南省保山市隆阳区";
			break;
		case 530521:
			s = "云南省施甸县";
			break;
		case 530522:
			s = "云南省腾冲县";
			break;
		case 530523:
			s = "云南省龙陵县";
			break;
		case 530524:
			s = "云南省昌宁县";
			break;
		case 530600:
			s = "云南省昭通市";
			break;
		case 530601:
			s = "云南省昭通市市辖区";
			break;
		case 530602:
			s = "云南省昭通市昭阳区";
			break;
		case 530621:
			s = "云南省鲁甸县";
			break;
		case 530622:
			s = "云南省巧家县";
			break;
		case 530623:
			s = "云南省盐津县";
			break;
		case 530624:
			s = "云南省大关县";
			break;
		case 530625:
			s = "云南省永善县";
			break;
		case 530626:
			s = "云南省绥江县";
			break;
		case 530627:
			s = "云南省镇雄县";
			break;
		case 530628:
			s = "云南省彝良县";
			break;
		case 530629:
			s = "云南省威信县";
			break;
		case 530630:
			s = "云南省水富县";
			break;
		case 530700:
			s = "云南省丽江市";
			break;
		case 530701:
			s = "云南省丽江市市辖区";
			break;
		case 530702:
			s = "云南省丽江市古城区";
			break;
		case 530721:
			s = "云南省玉龙纳西族自治县";
			break;
		case 530722:
			s = "云南省永胜县";
			break;
		case 530723:
			s = "云南省华坪县";
			break;
		case 530724:
			s = "云南省宁蒗彝族自治县";
			break;
		case 530800:
			s = "云南省普洱市";
			break;
		case 530801:
			s = "云南省普洱市市辖区";
			break;
		case 530802:
			s = "云南省普洱市思茅区";
			break;
		case 530821:
			s = "云南省宁洱哈尼族彝族自治县";
			break;
		case 530822:
			s = "云南省墨江哈尼族自治县";
			break;
		case 530823:
			s = "云南省景东彝族自治县";
			break;
		case 530824:
			s = "云南省景谷傣族彝族自治县";
			break;
		case 530825:
			s = "云南省镇沅彝族哈尼族拉祜族自治县";
			break;
		case 530826:
			s = "云南省江城哈尼族彝族自治县";
			break;
		case 530827:
			s = "云南省孟连傣族拉祜族佤族自治县";
			break;
		case 530828:
			s = "云南省澜沧拉祜族自治县";
			break;
		case 530829:
			s = "云南省西盟佤族自治县";
			break;
		case 530900:
			s = "云南省临沧市";
			break;
		case 530901:
			s = "云南省临沧市市辖区";
			break;
		case 530902:
			s = "云南省临沧市临翔区";
			break;
		case 530921:
			s = "云南省凤庆县";
			break;
		case 530922:
			s = "云南省云县";
			break;
		case 530923:
			s = "云南省永德县";
			break;
		case 530924:
			s = "云南省镇康县";
			break;
		case 530925:
			s = "云南省双江拉祜族佤族布朗族傣族自治县";
			break;
		case 530926:
			s = "云南省耿马傣族佤族自治县";
			break;
		case 530927:
			s = "云南省沧源佤族自治县";
			break;
		case 532300:
			s = "云南省楚雄彝族自治州";
			break;
		case 532301:
			s = "云南省楚雄市";
			break;
		case 532322:
			s = "云南省双柏县";
			break;
		case 532323:
			s = "云南省牟定县";
			break;
		case 532324:
			s = "云南省南华县";
			break;
		case 532325:
			s = "云南省姚安县";
			break;
		case 532326:
			s = "云南省大姚县";
			break;
		case 532327:
			s = "云南省永仁县";
			break;
		case 532328:
			s = "云南省元谋县";
			break;
		case 532329:
			s = "云南省武定县";
			break;
		case 532331:
			s = "云南省禄丰县";
			break;
		case 532500:
			s = "云南省红河哈尼族彝族自治州";
			break;
		case 532501:
			s = "云南省个旧市";
			break;
		case 532502:
			s = "云南省开远市";
			break;
		case 532522:
			s = "云南省蒙自县";
			break;
		case 532523:
			s = "云南省屏边苗族自治县";
			break;
		case 532524:
			s = "云南省建水县";
			break;
		case 532525:
			s = "云南省石屏县";
			break;
		case 532526:
			s = "云南省弥勒县";
			break;
		case 532527:
			s = "云南省泸西县";
			break;
		case 532528:
			s = "云南省元阳县";
			break;
		case 532529:
			s = "云南省红河县";
			break;
		case 532530:
			s = "云南省金平苗族瑶族傣族自治县";
			break;
		case 532531:
			s = "云南省绿春县";
			break;
		case 532532:
			s = "云南省河口瑶族自治县";
			break;
		case 532600:
			s = "云南省文山壮族苗族自治州";
			break;
		case 532621:
			s = "云南省文山县";
			break;
		case 532622:
			s = "云南省砚山县";
			break;
		case 532623:
			s = "云南省西畴县";
			break;
		case 532624:
			s = "云南省麻栗坡县";
			break;
		case 532625:
			s = "云南省马关县";
			break;
		case 532626:
			s = "云南省丘北县";
			break;
		case 532627:
			s = "云南省广南县";
			break;
		case 532628:
			s = "云南省富宁县";
			break;
		case 532800:
			s = "云南省西双版纳傣族自治州";
			break;
		case 532801:
			s = "云南省景洪市";
			break;
		case 532822:
			s = "云南省勐海县";
			break;
		case 532823:
			s = "云南省勐腊县";
			break;
		case 532900:
			s = "云南省大理白族自治州";
			break;
		case 532901:
			s = "云南省大理市";
			break;
		case 532922:
			s = "云南省漾濞彝族自治县";
			break;
		case 532923:
			s = "云南省祥云县";
			break;
		case 532924:
			s = "云南省宾川县";
			break;
		case 532925:
			s = "云南省弥渡县";
			break;
		case 532926:
			s = "云南省南涧彝族自治县";
			break;
		case 532927:
			s = "云南省巍山彝族回族自治县";
			break;
		case 532928:
			s = "云南省永平县";
			break;
		case 532929:
			s = "云南省云龙县";
			break;
		case 532930:
			s = "云南省洱源县";
			break;
		case 532931:
			s = "云南省剑川县";
			break;
		case 532932:
			s = "云南省鹤庆县";
			break;
		case 533100:
			s = "云南省德宏傣族景颇族自治州";
			break;
		case 533102:
			s = "云南省瑞丽市";
			break;
		case 533103:
			s = "云南省潞西市";
			break;
		case 533122:
			s = "云南省梁河县";
			break;
		case 533123:
			s = "云南省盈江县";
			break;
		case 533124:
			s = "云南省陇川县";
			break;
		case 533300:
			s = "云南省怒江傈僳族自治州";
			break;
		case 533321:
			s = "云南省泸水县";
			break;
		case 533323:
			s = "云南省福贡县";
			break;
		case 533324:
			s = "云南省贡山独龙族怒族自治县";
			break;
		case 533325:
			s = "云南省兰坪白族普米族自治县";
			break;
		case 533400:
			s = "云南省迪庆藏族自治州";
			break;
		case 533421:
			s = "云南省香格里拉县";
			break;
		case 533422:
			s = "云南省德钦县";
			break;
		case 533423:
			s = "云南省维西傈僳族自治县";
			break;
		case 540000:
			s = "西藏自治区";
			break;
		case 540100:
			s = "西藏拉萨市";
			break;
		case 540101:
			s = "西藏拉萨市市辖区";
			break;
		case 540102:
			s = "西藏拉萨市城关区";
			break;
		case 540121:
			s = "西藏林周县";
			break;
		case 540122:
			s = "西藏当雄县";
			break;
		case 540123:
			s = "西藏尼木县";
			break;
		case 540124:
			s = "西藏曲水县";
			break;
		case 540125:
			s = "西藏堆龙德庆县";
			break;
		case 540126:
			s = "西藏达孜县";
			break;
		case 540127:
			s = "西藏墨竹工卡县";
			break;
		case 542100:
			s = "西藏昌都地区";
			break;
		case 542121:
			s = "西藏昌都县";
			break;
		case 542122:
			s = "西藏江达县";
			break;
		case 542123:
			s = "西藏贡觉县";
			break;
		case 542124:
			s = "西藏类乌齐县";
			break;
		case 542125:
			s = "西藏丁青县";
			break;
		case 542126:
			s = "西藏察雅县";
			break;
		case 542127:
			s = "西藏八宿县";
			break;
		case 542128:
			s = "西藏左贡县";
			break;
		case 542129:
			s = "西藏芒康县";
			break;
		case 542132:
			s = "西藏洛隆县";
			break;
		case 542133:
			s = "西藏边坝县";
			break;
		case 542200:
			s = "西藏山南地区";
			break;
		case 542221:
			s = "西藏乃东县";
			break;
		case 542222:
			s = "西藏扎囊县";
			break;
		case 542223:
			s = "西藏贡嘎县";
			break;
		case 542224:
			s = "西藏桑日县";
			break;
		case 542225:
			s = "西藏琼结县";
			break;
		case 542226:
			s = "西藏曲松县";
			break;
		case 542227:
			s = "西藏措美县";
			break;
		case 542228:
			s = "西藏洛扎县";
			break;
		case 542229:
			s = "西藏加查县";
			break;
		case 542231:
			s = "西藏隆子县";
			break;
		case 542232:
			s = "西藏错那县";
			break;
		case 542233:
			s = "西藏浪卡子县";
			break;
		case 542300:
			s = "西藏日喀则地区";
			break;
		case 542301:
			s = "西藏日喀则市";
			break;
		case 542322:
			s = "西藏南木林县";
			break;
		case 542323:
			s = "西藏江孜县";
			break;
		case 542324:
			s = "西藏定日县";
			break;
		case 542325:
			s = "西藏萨迦县";
			break;
		case 542326:
			s = "西藏拉孜县";
			break;
		case 542327:
			s = "西藏昂仁县";
			break;
		case 542328:
			s = "西藏谢通门县";
			break;
		case 542329:
			s = "西藏白朗县";
			break;
		case 542330:
			s = "西藏仁布县";
			break;
		case 542331:
			s = "西藏康马县";
			break;
		case 542332:
			s = "西藏定结县";
			break;
		case 542333:
			s = "西藏仲巴县";
			break;
		case 542334:
			s = "西藏亚东县";
			break;
		case 542335:
			s = "西藏吉隆县";
			break;
		case 542336:
			s = "西藏聂拉木县";
			break;
		case 542337:
			s = "西藏萨嘎县";
			break;
		case 542338:
			s = "西藏岗巴县";
			break;
		case 542400:
			s = "西藏那曲地区";
			break;
		case 542421:
			s = "西藏那曲县";
			break;
		case 542422:
			s = "西藏嘉黎县";
			break;
		case 542423:
			s = "西藏比如县";
			break;
		case 542424:
			s = "西藏聂荣县";
			break;
		case 542425:
			s = "西藏安多县";
			break;
		case 542426:
			s = "西藏申扎县";
			break;
		case 542427:
			s = "西藏索县";
			break;
		case 542428:
			s = "西藏班戈县";
			break;
		case 542429:
			s = "西藏巴青县";
			break;
		case 542430:
			s = "西藏尼玛县";
			break;
		case 542500:
			s = "西藏阿里地区";
			break;
		case 542521:
			s = "西藏普兰县";
			break;
		case 542522:
			s = "西藏札达县";
			break;
		case 542523:
			s = "西藏噶尔县";
			break;
		case 542524:
			s = "西藏日土县";
			break;
		case 542525:
			s = "西藏革吉县";
			break;
		case 542526:
			s = "西藏改则县";
			break;
		case 542527:
			s = "西藏措勤县";
			break;
		case 542600:
			s = "西藏林芝地区";
			break;
		case 542621:
			s = "西藏林芝县";
			break;
		case 542622:
			s = "西藏工布江达县";
			break;
		case 542623:
			s = "西藏米林县";
			break;
		case 542624:
			s = "西藏墨脱县";
			break;
		case 542625:
			s = "西藏波密县";
			break;
		case 542626:
			s = "西藏察隅县";
			break;
		case 542627:
			s = "西藏朗县";
			break;
		case 610000:
			s = "陕西省";
			break;
		case 610100:
			s = "陕西省西安市";
			break;
		case 610101:
			s = "陕西省西安市市辖区";
			break;
		case 610102:
			s = "陕西省西安市新城区";
			break;
		case 610103:
			s = "陕西省西安市碑林区";
			break;
		case 610104:
			s = "陕西省西安市莲湖区";
			break;
		case 610111:
			s = "陕西省西安市灞桥区";
			break;
		case 610112:
			s = "陕西省西安市未央区";
			break;
		case 610113:
			s = "陕西省西安市雁塔区";
			break;
		case 610114:
			s = "陕西省西安市阎良区";
			break;
		case 610115:
			s = "陕西省西安市临潼区";
			break;
		case 610116:
			s = "陕西省西安市长安区";
			break;
		case 610122:
			s = "陕西省蓝田县";
			break;
		case 610124:
			s = "陕西省周至县";
			break;
		case 610125:
			s = "陕西省户县";
			break;
		case 610126:
			s = "陕西省高陵县";
			break;
		case 610200:
			s = "陕西省铜川市";
			break;
		case 610201:
			s = "陕西省铜川市市辖区";
			break;
		case 610202:
			s = "陕西省铜川市王益区";
			break;
		case 610203:
			s = "陕西省铜川市印台区";
			break;
		case 610204:
			s = "陕西省铜川市耀州区";
			break;
		case 610222:
			s = "陕西省宜君县";
			break;
		case 610300:
			s = "陕西省宝鸡市";
			break;
		case 610301:
			s = "陕西省宝鸡市市辖区";
			break;
		case 610302:
			s = "陕西省宝鸡市渭滨区";
			break;
		case 610303:
			s = "陕西省宝鸡市金台区";
			break;
		case 610304:
			s = "陕西省宝鸡市陈仓区";
			break;
		case 610322:
			s = "陕西省凤翔县";
			break;
		case 610323:
			s = "陕西省岐山县";
			break;
		case 610324:
			s = "陕西省扶风县";
			break;
		case 610326:
			s = "陕西省眉县";
			break;
		case 610327:
			s = "陕西省陇县";
			break;
		case 610328:
			s = "陕西省千阳县";
			break;
		case 610329:
			s = "陕西省麟游县";
			break;
		case 610330:
			s = "陕西省凤县";
			break;
		case 610331:
			s = "陕西省太白县";
			break;
		case 610400:
			s = "陕西省咸阳市";
			break;
		case 610401:
			s = "陕西省咸阳市市辖区";
			break;
		case 610402:
			s = "陕西省咸阳市秦都区";
			break;
		case 610403:
			s = "陕西省咸阳市杨凌区";
			break;
		case 610404:
			s = "陕西省咸阳市渭城区";
			break;
		case 610422:
			s = "陕西省三原县";
			break;
		case 610423:
			s = "陕西省泾阳县";
			break;
		case 610424:
			s = "陕西省乾县";
			break;
		case 610425:
			s = "陕西省礼泉县";
			break;
		case 610426:
			s = "陕西省永寿县";
			break;
		case 610427:
			s = "陕西省彬县";
			break;
		case 610428:
			s = "陕西省长武县";
			break;
		case 610429:
			s = "陕西省旬邑县";
			break;
		case 610430:
			s = "陕西省淳化县";
			break;
		case 610431:
			s = "陕西省武功县";
			break;
		case 610481:
			s = "陕西省兴平市";
			break;
		case 610500:
			s = "陕西省渭南市";
			break;
		case 610501:
			s = "陕西省渭南市市辖区";
			break;
		case 610502:
			s = "陕西省渭南市临渭区";
			break;
		case 610521:
			s = "陕西省华县";
			break;
		case 610522:
			s = "陕西省潼关县";
			break;
		case 610523:
			s = "陕西省大荔县";
			break;
		case 610524:
			s = "陕西省合阳县";
			break;
		case 610525:
			s = "陕西省澄城县";
			break;
		case 610526:
			s = "陕西省蒲城县";
			break;
		case 610527:
			s = "陕西省白水县";
			break;
		case 610528:
			s = "陕西省富平县";
			break;
		case 610581:
			s = "陕西省韩城市";
			break;
		case 610582:
			s = "陕西省华阴市";
			break;
		case 610600:
			s = "陕西省延安市";
			break;
		case 610601:
			s = "陕西省延安市市辖区";
			break;
		case 610602:
			s = "陕西省延安市宝塔区";
			break;
		case 610621:
			s = "陕西省延长县";
			break;
		case 610622:
			s = "陕西省延川县";
			break;
		case 610623:
			s = "陕西省子长县";
			break;
		case 610624:
			s = "陕西省安塞县";
			break;
		case 610625:
			s = "陕西省志丹县";
			break;
		case 610626:
			s = "陕西省吴起县";
			break;
		case 610627:
			s = "陕西省甘泉县";
			break;
		case 610628:
			s = "陕西省富县";
			break;
		case 610629:
			s = "陕西省洛川县";
			break;
		case 610630:
			s = "陕西省宜川县";
			break;
		case 610631:
			s = "陕西省黄龙县";
			break;
		case 610632:
			s = "陕西省黄陵县";
			break;
		case 610700:
			s = "陕西省汉中市";
			break;
		case 610701:
			s = "陕西省汉中市市辖区";
			break;
		case 610702:
			s = "陕西省汉中市汉台区";
			break;
		case 610721:
			s = "陕西省南郑县";
			break;
		case 610722:
			s = "陕西省城固县";
			break;
		case 610723:
			s = "陕西省洋县";
			break;
		case 610724:
			s = "陕西省西乡县";
			break;
		case 610725:
			s = "陕西省勉县";
			break;
		case 610726:
			s = "陕西省宁强县";
			break;
		case 610727:
			s = "陕西省略阳县";
			break;
		case 610728:
			s = "陕西省镇巴县";
			break;
		case 610729:
			s = "陕西省留坝县";
			break;
		case 610730:
			s = "陕西省佛坪县";
			break;
		case 610800:
			s = "陕西省榆林市";
			break;
		case 610801:
			s = "陕西省榆林市市辖区";
			break;
		case 610802:
			s = "陕西省榆林市榆阳区";
			break;
		case 610821:
			s = "陕西省神木县";
			break;
		case 610822:
			s = "陕西省府谷县";
			break;
		case 610823:
			s = "陕西省横山县";
			break;
		case 610824:
			s = "陕西省靖边县";
			break;
		case 610825:
			s = "陕西省定边县";
			break;
		case 610826:
			s = "陕西省绥德县";
			break;
		case 610827:
			s = "陕西省米脂县";
			break;
		case 610828:
			s = "陕西省佳县";
			break;
		case 610829:
			s = "陕西省吴堡县";
			break;
		case 610830:
			s = "陕西省清涧县";
			break;
		case 610831:
			s = "陕西省子洲县";
			break;
		case 610900:
			s = "陕西省安康市";
			break;
		case 610901:
			s = "陕西省安康市市辖区";
			break;
		case 610902:
			s = "陕西省安康市汉滨区";
			break;
		case 610921:
			s = "陕西省汉阴县";
			break;
		case 610922:
			s = "陕西省石泉县";
			break;
		case 610923:
			s = "陕西省宁陕县";
			break;
		case 610924:
			s = "陕西省紫阳县";
			break;
		case 610925:
			s = "陕西省岚皋县";
			break;
		case 610926:
			s = "陕西省平利县";
			break;
		case 610927:
			s = "陕西省镇坪县";
			break;
		case 610928:
			s = "陕西省旬阳县";
			break;
		case 610929:
			s = "陕西省白河县";
			break;
		case 611000:
			s = "陕西省商洛市";
			break;
		case 611001:
			s = "陕西省商洛市市辖区";
			break;
		case 611002:
			s = "陕西省商洛市商州区";
			break;
		case 611021:
			s = "陕西省洛南县";
			break;
		case 611022:
			s = "陕西省丹凤县";
			break;
		case 611023:
			s = "陕西省商南县";
			break;
		case 611024:
			s = "陕西省山阳县";
			break;
		case 611025:
			s = "陕西省镇安县";
			break;
		case 611026:
			s = "陕西省柞水县";
			break;
		case 620000:
			s = "甘肃省";
			break;
		case 620100:
			s = "甘肃省兰州市";
			break;
		case 620101:
			s = "甘肃省兰州市市辖区";
			break;
		case 620102:
			s = "甘肃省兰州市城关区";
			break;
		case 620103:
			s = "甘肃省兰州市七里河区";
			break;
		case 620104:
			s = "甘肃省兰州市西固区";
			break;
		case 620105:
			s = "甘肃省兰州市安宁区";
			break;
		case 620111:
			s = "甘肃省兰州市红古区";
			break;
		case 620121:
			s = "甘肃省永登县";
			break;
		case 620122:
			s = "甘肃省皋兰县";
			break;
		case 620123:
			s = "甘肃省榆中县";
			break;
		case 620200:
			s = "甘肃省嘉峪关市";
			break;
		case 620201:
			s = "甘肃省嘉峪关市市辖区";
			break;
		case 620300:
			s = "甘肃省金昌市";
			break;
		case 620301:
			s = "甘肃省金昌市市辖区";
			break;
		case 620302:
			s = "甘肃省金昌市金川区";
			break;
		case 620321:
			s = "甘肃省永昌县";
			break;
		case 620400:
			s = "甘肃省白银市";
			break;
		case 620401:
			s = "甘肃省白银市市辖区";
			break;
		case 620402:
			s = "甘肃省白银市白银区";
			break;
		case 620403:
			s = "甘肃省白银市平川区";
			break;
		case 620421:
			s = "甘肃省靖远县";
			break;
		case 620422:
			s = "甘肃省会宁县";
			break;
		case 620423:
			s = "甘肃省景泰县";
			break;
		case 620500:
			s = "甘肃省天水市";
			break;
		case 620501:
			s = "甘肃省天水市市辖区";
			break;
		case 620502:
			s = "甘肃省天水市秦州区";
			break;
		case 620503:
			s = "甘肃省天水市麦积区";
			break;
		case 620521:
			s = "甘肃省清水县";
			break;
		case 620522:
			s = "甘肃省秦安县";
			break;
		case 620523:
			s = "甘肃省甘谷县";
			break;
		case 620524:
			s = "甘肃省武山县";
			break;
		case 620525:
			s = "甘肃省张家川回族自治县";
			break;
		case 620600:
			s = "甘肃省武威市";
			break;
		case 620601:
			s = "甘肃省武威市市辖区";
			break;
		case 620602:
			s = "甘肃省武威市凉州区";
			break;
		case 620621:
			s = "甘肃省民勤县";
			break;
		case 620622:
			s = "甘肃省古浪县";
			break;
		case 620623:
			s = "甘肃省天祝藏族自治县";
			break;
		case 620700:
			s = "甘肃省张掖市";
			break;
		case 620701:
			s = "甘肃省张掖市市辖区";
			break;
		case 620702:
			s = "甘肃省张掖市甘州区";
			break;
		case 620721:
			s = "甘肃省肃南裕固族自治县";
			break;
		case 620722:
			s = "甘肃省民乐县";
			break;
		case 620723:
			s = "甘肃省临泽县";
			break;
		case 620724:
			s = "甘肃省高台县";
			break;
		case 620725:
			s = "甘肃省山丹县";
			break;
		case 620800:
			s = "甘肃省平凉市";
			break;
		case 620801:
			s = "甘肃省市辖区";
			break;
		case 620802:
			s = "甘肃省市辖区崆峒区";
			break;
		case 620821:
			s = "甘肃省泾川县";
			break;
		case 620822:
			s = "甘肃省灵台县";
			break;
		case 620823:
			s = "甘肃省崇信县";
			break;
		case 620824:
			s = "甘肃省华亭县";
			break;
		case 620825:
			s = "甘肃省庄浪县";
			break;
		case 620826:
			s = "甘肃省静宁县";
			break;
		case 620900:
			s = "甘肃省酒泉市";
			break;
		case 620901:
			s = "甘肃省酒泉市市辖区";
			break;
		case 620902:
			s = "甘肃省酒泉市肃州区";
			break;
		case 620921:
			s = "甘肃省金塔县";
			break;
		case 620922:
			s = "甘肃省瓜州县";
			break;
		case 620923:
			s = "甘肃省肃北蒙古族自治县";
			break;
		case 620924:
			s = "甘肃省阿克塞哈萨克族自治县";
			break;
		case 620981:
			s = "甘肃省玉门市";
			break;
		case 620982:
			s = "甘肃省敦煌市";
			break;
		case 621000:
			s = "甘肃省庆阳市";
			break;
		case 621001:
			s = "甘肃省庆阳市市辖区";
			break;
		case 621002:
			s = "甘肃省庆阳市西峰区";
			break;
		case 621021:
			s = "甘肃省庆城县";
			break;
		case 621022:
			s = "甘肃省环县";
			break;
		case 621023:
			s = "甘肃省华池县";
			break;
		case 621024:
			s = "甘肃省合水县";
			break;
		case 621025:
			s = "甘肃省正宁县";
			break;
		case 621026:
			s = "甘肃省宁县";
			break;
		case 621027:
			s = "甘肃省镇原县";
			break;
		case 621100:
			s = "甘肃省定西市";
			break;
		case 621101:
			s = "甘肃省定西市市辖区";
			break;
		case 621102:
			s = "甘肃省定西市安定区";
			break;
		case 621121:
			s = "甘肃省通渭县";
			break;
		case 621122:
			s = "甘肃省陇西县";
			break;
		case 621123:
			s = "甘肃省渭源县";
			break;
		case 621124:
			s = "甘肃省临洮县";
			break;
		case 621125:
			s = "甘肃省漳县";
			break;
		case 621126:
			s = "甘肃省岷县";
			break;
		case 621200:
			s = "甘肃省陇南市";
			break;
		case 621201:
			s = "甘肃省陇南市市辖区";
			break;
		case 621202:
			s = "甘肃省陇南市武都区";
			break;
		case 621221:
			s = "甘肃省成县";
			break;
		case 621222:
			s = "甘肃省文县";
			break;
		case 621223:
			s = "甘肃省宕昌县";
			break;
		case 621224:
			s = "甘肃省康县";
			break;
		case 621225:
			s = "甘肃省西和县";
			break;
		case 621226:
			s = "甘肃省礼县";
			break;
		case 621227:
			s = "甘肃省徽县";
			break;
		case 621228:
			s = "甘肃省两当县";
			break;
		case 622900:
			s = "甘肃省临夏回族自治州";
			break;
		case 622901:
			s = "甘肃省临夏市";
			break;
		case 622921:
			s = "甘肃省临夏县";
			break;
		case 622922:
			s = "甘肃省康乐县";
			break;
		case 622923:
			s = "甘肃省永靖县";
			break;
		case 622924:
			s = "甘肃省广河县";
			break;
		case 622925:
			s = "甘肃省和政县";
			break;
		case 622926:
			s = "甘肃省东乡族自治县";
			break;
		case 622927:
			s = "甘肃省积石山保安族东乡族撒拉族自治县";
			break;
		case 623000:
			s = "甘肃省甘南藏族自治州";
			break;
		case 623001:
			s = "甘肃省合作市";
			break;
		case 623021:
			s = "甘肃省临潭县";
			break;
		case 623022:
			s = "甘肃省卓尼县";
			break;
		case 623023:
			s = "甘肃省舟曲县";
			break;
		case 623024:
			s = "甘肃省迭部县";
			break;
		case 623025:
			s = "甘肃省玛曲县";
			break;
		case 623026:
			s = "甘肃省碌曲县";
			break;
		case 623027:
			s = "甘肃省夏河县";
			break;
		case 630000:
			s = "青海省";
			break;
		case 630100:
			s = "青海省西宁市";
			break;
		case 630101:
			s = "青海省西宁市市辖区";
			break;
		case 630102:
			s = "青海省西宁市城东区";
			break;
		case 630103:
			s = "青海省西宁市城中区";
			break;
		case 630104:
			s = "青海省西宁市城西区";
			break;
		case 630105:
			s = "青海省西宁市城北区";
			break;
		case 630121:
			s = "青海省大通回族土族自治县";
			break;
		case 630122:
			s = "青海省湟中县";
			break;
		case 630123:
			s = "青海省湟源县";
			break;
		case 632100:
			s = "青海省海东地区";
			break;
		case 632121:
			s = "青海省平安县";
			break;
		case 632122:
			s = "青海省民和回族土族自治县";
			break;
		case 632123:
			s = "青海省乐都县";
			break;
		case 632126:
			s = "青海省互助土族自治县";
			break;
		case 632127:
			s = "青海省化隆回族自治县";
			break;
		case 632128:
			s = "青海省循化撒拉族自治县";
			break;
		case 632200:
			s = "青海省海北藏族自治州";
			break;
		case 632221:
			s = "青海省门源回族自治县";
			break;
		case 632222:
			s = "青海省祁连县";
			break;
		case 632223:
			s = "青海省海晏县";
			break;
		case 632224:
			s = "青海省刚察县";
			break;
		case 632300:
			s = "青海省黄南藏族自治州";
			break;
		case 632321:
			s = "青海省同仁县";
			break;
		case 632322:
			s = "青海省尖扎县";
			break;
		case 632323:
			s = "青海省泽库县";
			break;
		case 632324:
			s = "青海省河南蒙古族自治县";
			break;
		case 632500:
			s = "青海省海南藏族自治州";
			break;
		case 632521:
			s = "青海省共和县";
			break;
		case 632522:
			s = "青海省同德县";
			break;
		case 632523:
			s = "青海省贵德县";
			break;
		case 632524:
			s = "青海省兴海县";
			break;
		case 632525:
			s = "青海省贵南县";
			break;
		case 632600:
			s = "青海省果洛藏族自治州";
			break;
		case 632621:
			s = "青海省玛沁县";
			break;
		case 632622:
			s = "青海省班玛县";
			break;
		case 632623:
			s = "青海省甘德县";
			break;
		case 632624:
			s = "青海省达日县";
			break;
		case 632625:
			s = "青海省久治县";
			break;
		case 632626:
			s = "青海省玛多县";
			break;
		case 632700:
			s = "青海省玉树藏族自治州";
			break;
		case 632721:
			s = "青海省玉树县";
			break;
		case 632722:
			s = "青海省杂多县";
			break;
		case 632723:
			s = "青海省称多县";
			break;
		case 632724:
			s = "青海省治多县";
			break;
		case 632725:
			s = "青海省囊谦县";
			break;
		case 632726:
			s = "青海省曲麻莱县";
			break;
		case 632800:
			s = "青海省海西蒙古族藏族自治州";
			break;
		case 632801:
			s = "青海省格尔木市";
			break;
		case 632802:
			s = "青海省德令哈市";
			break;
		case 632821:
			s = "青海省乌兰县";
			break;
		case 632822:
			s = "青海省都兰县";
			break;
		case 632823:
			s = "青海省天峻县";
			break;
		case 640000:
			s = "宁夏回族自治区";
			break;
		case 640100:
			s = "宁夏银川市";
			break;
		case 640101:
			s = "宁夏银川市市辖区";
			break;
		case 640104:
			s = "宁夏银川市兴庆区";
			break;
		case 640105:
			s = "宁夏银川市西夏区";
			break;
		case 640106:
			s = "宁夏银川市金凤区";
			break;
		case 640121:
			s = "宁夏永宁县";
			break;
		case 640122:
			s = "宁夏贺兰县";
			break;
		case 640181:
			s = "宁夏灵武市";
			break;
		case 640200:
			s = "宁夏石嘴山市";
			break;
		case 640201:
			s = "宁夏石嘴山市市辖区";
			break;
		case 640202:
			s = "宁夏石嘴山市大武口区";
			break;
		case 640205:
			s = "宁夏石嘴山市惠农区";
			break;
		case 640221:
			s = "宁夏平罗县";
			break;
		case 640300:
			s = "宁夏吴忠市";
			break;
		case 640301:
			s = "宁夏吴忠市市辖区";
			break;
		case 640302:
			s = "宁夏吴忠市利通区";
			break;
		case 640323:
			s = "宁夏盐池县";
			break;
		case 640324:
			s = "宁夏同心县";
			break;
		case 640381:
			s = "宁夏青铜峡市";
			break;
		case 640400:
			s = "宁夏固原市";
			break;
		case 640401:
			s = "宁夏固原市市辖区";
			break;
		case 640402:
			s = "宁夏固原市原州区";
			break;
		case 640422:
			s = "宁夏西吉县";
			break;
		case 640423:
			s = "宁夏隆德县";
			break;
		case 640424:
			s = "宁夏泾源县";
			break;
		case 640425:
			s = "宁夏彭阳县";
			break;
		case 640500:
			s = "宁夏中卫市";
			break;
		case 640501:
			s = "宁夏中卫市市辖区";
			break;
		case 640502:
			s = "宁夏中卫市沙坡头区";
			break;
		case 640521:
			s = "宁夏中宁县";
			break;
		case 640522:
			s = "宁夏海原县";
			break;
		case 650000:
			s = "新疆维吾尔自治区";
			break;
		case 650100:
			s = "新疆乌鲁木齐市";
			break;
		case 650101:
			s = "新疆乌鲁木齐市市辖区";
			break;
		case 650102:
			s = "新疆乌鲁木齐市天山区";
			break;
		case 650103:
			s = "新疆乌鲁木齐市沙依巴克区";
			break;
		case 650104:
			s = "新疆乌鲁木齐市新市区";
			break;
		case 650105:
			s = "新疆乌鲁木齐市水磨沟区";
			break;
		case 650106:
			s = "新疆乌鲁木齐市头屯河区";
			break;
		case 650107:
			s = "新疆乌鲁木齐市达坂城区";
			break;
		case 650109:
			s = "新疆乌鲁木齐市米东区";
			break;
		case 650121:
			s = "新疆乌鲁木齐县";
			break;
		case 650200:
			s = "新疆克拉玛依市";
			break;
		case 650201:
			s = "新疆克拉玛依市市辖区";
			break;
		case 650202:
			s = "新疆克拉玛依市独山子区";
			break;
		case 650203:
			s = "新疆克拉玛依市克拉玛依区";
			break;
		case 650204:
			s = "新疆克拉玛依市白碱滩区";
			break;
		case 650205:
			s = "新疆克拉玛依市乌尔禾区";
			break;
		case 652100:
			s = "新疆吐鲁番地区";
			break;
		case 652101:
			s = "新疆吐鲁番市";
			break;
		case 652122:
			s = "新疆鄯善县";
			break;
		case 652123:
			s = "新疆托克逊县";
			break;
		case 652200:
			s = "新疆哈密地区";
			break;
		case 652201:
			s = "新疆哈密市";
			break;
		case 652222:
			s = "新疆巴里坤哈萨克自治县";
			break;
		case 652223:
			s = "新疆伊吾县";
			break;
		case 652300:
			s = "新疆昌吉回族自治州";
			break;
		case 652301:
			s = "新疆昌吉市";
			break;
		case 652302:
			s = "新疆阜康市";
			break;
		case 652323:
			s = "新疆呼图壁县";
			break;
		case 652324:
			s = "新疆玛纳斯县";
			break;
		case 652325:
			s = "新疆奇台县";
			break;
		case 652327:
			s = "新疆吉木萨尔县";
			break;
		case 652328:
			s = "新疆木垒哈萨克自治县";
			break;
		case 652700:
			s = "新疆博尔塔拉蒙古自治州";
			break;
		case 652701:
			s = "新疆博乐市";
			break;
		case 652722:
			s = "新疆精河县";
			break;
		case 652723:
			s = "新疆温泉县";
			break;
		case 652800:
			s = "新疆巴音郭楞蒙古自治州";
			break;
		case 652801:
			s = "新疆库尔勒市";
			break;
		case 652822:
			s = "新疆轮台县";
			break;
		case 652823:
			s = "新疆尉犁县";
			break;
		case 652824:
			s = "新疆若羌县";
			break;
		case 652825:
			s = "新疆且末县";
			break;
		case 652826:
			s = "新疆焉耆回族自治县";
			break;
		case 652827:
			s = "新疆和静县";
			break;
		case 652828:
			s = "新疆和硕县";
			break;
		case 652829:
			s = "新疆博湖县";
			break;
		case 652900:
			s = "新疆阿克苏地区";
			break;
		case 652901:
			s = "新疆阿克苏市";
			break;
		case 652922:
			s = "新疆温宿县";
			break;
		case 652923:
			s = "新疆库车县";
			break;
		case 652924:
			s = "新疆沙雅县";
			break;
		case 652925:
			s = "新疆新和县";
			break;
		case 652926:
			s = "新疆拜城县";
			break;
		case 652927:
			s = "新疆乌什县";
			break;
		case 652928:
			s = "新疆阿瓦提县";
			break;
		case 652929:
			s = "新疆柯坪县";
			break;
		case 653000:
			s = "新疆克孜勒苏柯尔克孜自治州";
			break;
		case 653001:
			s = "新疆阿图什市";
			break;
		case 653022:
			s = "新疆阿克陶县";
			break;
		case 653023:
			s = "新疆阿合奇县";
			break;
		case 653024:
			s = "新疆乌恰县";
			break;
		case 653100:
			s = "新疆喀什地区";
			break;
		case 653101:
			s = "新疆喀什市";
			break;
		case 653121:
			s = "新疆疏附县";
			break;
		case 653122:
			s = "新疆疏勒县";
			break;
		case 653123:
			s = "新疆英吉沙县";
			break;
		case 653124:
			s = "新疆泽普县";
			break;
		case 653125:
			s = "新疆莎车县";
			break;
		case 653126:
			s = "新疆叶城县";
			break;
		case 653127:
			s = "新疆麦盖提县";
			break;
		case 653128:
			s = "新疆岳普湖县";
			break;
		case 653129:
			s = "新疆伽师县";
			break;
		case 653130:
			s = "新疆巴楚县";
			break;
		case 653131:
			s = "新疆塔什库尔干塔吉克自治县";
			break;
		case 653200:
			s = "新疆和田地区";
			break;
		case 653201:
			s = "新疆和田市";
			break;
		case 653221:
			s = "新疆和田县";
			break;
		case 653222:
			s = "新疆墨玉县";
			break;
		case 653223:
			s = "新疆皮山县";
			break;
		case 653224:
			s = "新疆洛浦县";
			break;
		case 653225:
			s = "新疆策勒县";
			break;
		case 653226:
			s = "新疆于田县";
			break;
		case 653227:
			s = "新疆民丰县";
			break;
		case 654000:
			s = "新疆伊犁哈萨克自治州";
			break;
		case 654002:
			s = "新疆伊宁市";
			break;
		case 654003:
			s = "新疆奎屯市";
			break;
		case 654021:
			s = "新疆伊宁县";
			break;
		case 654022:
			s = "新疆察布查尔锡伯自治县";
			break;
		case 654023:
			s = "新疆霍城县";
			break;
		case 654024:
			s = "新疆巩留县";
			break;
		case 654025:
			s = "新疆新源县";
			break;
		case 654026:
			s = "新疆昭苏县";
			break;
		case 654027:
			s = "新疆特克斯县";
			break;
		case 654028:
			s = "新疆尼勒克县";
			break;
		case 654200:
			s = "新疆塔城地区";
			break;
		case 654201:
			s = "新疆塔城市";
			break;
		case 654202:
			s = "新疆乌苏市";
			break;
		case 654221:
			s = "新疆额敏县";
			break;
		case 654223:
			s = "新疆沙湾县";
			break;
		case 654224:
			s = "新疆托里县";
			break;
		case 654225:
			s = "新疆裕民县";
			break;
		case 654226:
			s = "新疆和布克赛尔蒙古自治县";
			break;
		case 654300:
			s = "新疆阿勒泰地区";
			break;
		case 654301:
			s = "新疆阿勒泰市";
			break;
		case 654321:
			s = "新疆布尔津县";
			break;
		case 654322:
			s = "新疆富蕴县";
			break;
		case 654323:
			s = "新疆福海县";
			break;
		case 654324:
			s = "新疆哈巴河县";
			break;
		case 654325:
			s = "新疆青河县";
			break;
		case 654326:
			s = "新疆吉木乃县";
			break;
		case 659001:
			s = "新疆石河子市";
			break;
		case 659002:
			s = "新疆阿拉尔市";
			break;
		case 659003:
			s = "新疆图木舒克市";
			break;
		case 659004:
			s = "新疆五家渠市";
			break;
		case 710000:
			s = "台湾省";
			break;
		case 810000:
			s = "香港特别行政区";
			break;
		case 820000:
			s = "澳门特别行政区";
			break;
		}
		return "所在地："+s;
	}
}
