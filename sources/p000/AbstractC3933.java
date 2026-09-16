package p000;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: ۦَُؙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3933 {

    /* JADX INFO: renamed from: ۥۗ */
    public static Boolean f13126;

    /* JADX INFO: renamed from: ۥۜ */
    public static final C2268 f13127;

    /* JADX INFO: renamed from: ۥۣ */
    public static Context f13128;

    /* JADX INFO: renamed from: ۦؚ */
    public static Boolean f13130;

    /* JADX INFO: renamed from: ۦِ */
    public static Boolean f13131;

    /* JADX INFO: renamed from: ۦٛ */
    public static Boolean f13132;

    /* JADX INFO: renamed from: ۦۗ */
    public static Boolean f13133;

    /* JADX INFO: renamed from: ۥؗ */
    public static final Object f13123 = new Object();

    /* JADX INFO: renamed from: ۦؑ */
    public static final double[][] f13129 = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: ۥُ */
    public static final double[][] f13124 = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: ۥّ */
    public static final double[] f13125 = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: ۦۙ */
    public static final double[] f13134 = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    static {
        int i = 0;
        f13127 = new C2268(i, i, 5);
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static boolean m7064(double d) {
        return 0.0d <= d && d <= 100.0d;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static void m7065(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0178.m387(str.concat(" must not be null"));
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static double m7066(double d) {
        int i;
        double dAbs = Math.abs(d);
        double dMax = Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs));
        if (d < 0.0d) {
            i = -1;
        } else {
            i = d == 0.0d ? 0 : 1;
        }
        return Math.pow(dMax, 2.380952380952381d) * ((double) i);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m7067(C0777 c0777, InterfaceC4745 interfaceC4745, C1808 c1808, C5521 c5521, C0857 c0857, C5362 c5362, int i) {
        int i2;
        C1808 c1809;
        C5521 c5522;
        C0857 c0858;
        c5362.m8979(1706321816);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(c0777) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(interfaceC4745) ? 32 : 16;
        }
        int i3 = i & 384;
        C4217 c4217 = C4217.f13994;
        if (i3 == 0) {
            i2 |= c5362.m8963(c4217) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            c1809 = c1808;
            i2 |= c5362.m8963(c1809) ? 2048 : 1024;
        } else {
            c1809 = c1808;
        }
        if ((i & 24576) == 0) {
            c5522 = c5521;
            i2 |= c5362.m8963(c5522) ? 16384 : 8192;
        } else {
            c5522 = c5521;
        }
        if ((i & 196608) == 0) {
            c0858 = c0857;
            i2 |= c5362.m8977(c0858) ? 131072 : 65536;
        } else {
            c0858 = c0857;
        }
        if (c5362.m9011(i2 & 1, (74899 & i2) != 74898)) {
            int i4 = i2 & 112;
            int i5 = i2 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (z || objM8999 == obj) {
                objM8999 = new C0526(interfaceC4745, c0777);
                c5362.m8987(objM8999);
            }
            InterfaceC0705 interfaceC0705M1049 = AbstractC0487.m1049(c4217, (InterfaceC2609) objM8999);
            Object objM89910 = c5362.m8999();
            if (objM89910 == obj) {
                objM89910 = C3136.f10587;
                c5362.m8987(objM89910);
            }
            C1808 c18010 = c1809;
            m7081(c0777, interfaceC4745, interfaceC0705M1049, c18010, c5522, (InterfaceC5731) objM89910, c0858, c5362, ((i2 << 6) & 29360128) | i5 | 196608 | i4 | (i2 & 7168) | (57344 & i2));
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1758(c0777, interfaceC4745, c1808, c5521, c0857, i);
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public static boolean m7068(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f13132 == null) {
            f13132 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean boolValueOf = f13131;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            f13131 = boolValueOf;
        }
        return boolValueOf.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥَ */
    public static C0381[] m7069(String str) {
        int i;
        String strTrim;
        float[] fArrM7073;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i3, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrM7073 = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = i2;
                                    int i6 = 1;
                                    while (i6 < length) {
                                        int i7 = i2;
                                        int i8 = i7;
                                        int i9 = i8;
                                        int i10 = i9;
                                        for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                            char cCharAt2 = strTrim.charAt(i11);
                                            if (cCharAt2 == ' ') {
                                                i7 = 0;
                                                i9 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i7 = 0;
                                                        i9 = 1;
                                                        break;
                                                    case '-':
                                                        if (i11 == i6 || i7 != 0) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                                if (i6 < i11) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 != 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        if (i10 != 0) {
                                            i6 = i11;
                                        } else {
                                            i6 = i11 + 1;
                                        }
                                        i2 = 0;
                                    }
                                    fArrM7073 = m7073(fArr, i5);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException(AbstractC3761.m6629("error in parsing \"", strTrim, "\""), e);
                                }
                            }
                            arrayList.add(new C0381(strTrim.charAt(i2), fArrM7073));
                        }
                        i3 = i4;
                        i4++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrM7073 = new float[i2];
                } else {
                    fArrM7073 = new float[i2];
                }
                arrayList.add(new C0381(strTrim.charAt(i2), fArrM7073));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C0381(str.charAt(i3), new float[0]));
        }
        return (C0381[]) arrayList.toArray(new C0381[i]);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m7070(C3635 c3635, C0857 c0857, C5362 c5362, int i) {
        int i2;
        c5362.m8979(2080741862);
        if ((i & 6) == 0) {
            i2 = (c5362.m8977(c3635) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(c0857) ? 32 : 16;
        }
        int i3 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            AbstractC5378.m9051(c3635, c0857, c5362, i2 & 126);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3099(c3635, c0857, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m7071(final InterfaceC4448 interfaceC4448, final InterfaceC0705 interfaceC0705, boolean z, InterfaceC2864 interfaceC2864, C4697 c4697, C1446 c1446, InterfaceC1291 interfaceC1291, C5362 c5362, final int i) {
        final boolean z2;
        final InterfaceC2864 interfaceC2865;
        final C4697 c4698;
        final C1446 c1447;
        final InterfaceC1291 interfaceC1292;
        C4697 c4699;
        C1446 c1448;
        InterfaceC1291 interfaceC1293;
        boolean z3;
        C4697 c46910;
        InterfaceC2864 interfaceC2866;
        C0857 c0857 = AbstractC0949.f3372;
        c5362.m8979(-1943994298);
        int i2 = i | 114894208;
        if (c5362.m9011(i2 & 1, (306783379 & i2) != 306783378)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                C1393 c1393 = AbstractC3017.f10163;
                InterfaceC2864 interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                C2917 c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                C4697 c46911 = c2917.f9750;
                if (c46911 == null) {
                    c4699 = new C4697(AbstractC0118.m212(c2917, 40), AbstractC0118.m212(c2917, 26), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.1f, 14), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14));
                    c2917.f9750 = c4699;
                } else {
                    c4699 = c46911;
                }
                c1448 = new C1446(1.0f, 1.0f, 1.0f, 3.0f);
                interfaceC1293 = AbstractC3017.f10163;
                z3 = true;
                c46910 = c4699;
                interfaceC2866 = interfaceC2864M546;
            } else {
                c5362.m8982();
                z3 = z;
                interfaceC2866 = interfaceC2864;
                c46910 = c4697;
                c1448 = c1446;
                interfaceC1293 = interfaceC1291;
            }
            c5362.m8964();
            m7084(interfaceC4448, interfaceC0705, z3, interfaceC2866, c46910, c1448, interfaceC1293, c0857, c5362, 920125878, 0);
            z2 = z3;
            interfaceC2865 = interfaceC2866;
            c4698 = c46910;
            c1447 = c1448;
            interfaceC1292 = interfaceC1293;
        } else {
            c5362.m8982();
            z2 = z;
            interfaceC2865 = interfaceC2864;
            c4698 = c4697;
            c1447 = c1446;
            interfaceC1292 = interfaceC1291;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(interfaceC0705, z2, interfaceC2865, c4698, c1447, interfaceC1292, i) { // from class: ۦؒؔؖۦ

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ C4697 f10428;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ boolean f10429;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ InterfaceC2864 f10430;

                /* JADX INFO: renamed from: ۥٖ */
                public final /* synthetic */ C1446 f10431;

                /* JADX INFO: renamed from: ۦٗ */
                public final /* synthetic */ InterfaceC1291 f10432;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC0705 f10433;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(805306423);
                    AbstractC3933.m7071(this.f10434, this.f10433, this.f10429, this.f10430, this.f10428, this.f10431, this.f10432, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final AbstractC1814 m7072(AbstractC1814 abstractC1814) {
        AbstractC1814 abstractC1814Mo2171 = abstractC1814.mo2171();
        int iMo2173 = abstractC1814Mo2171.mo2173();
        for (int i = 0; i < iMo2173; i++) {
            abstractC1814Mo2171.mo2172(i, abstractC1814.mo2174(i));
        }
        return abstractC1814Mo2171;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static float[] m7073(float[] fArr, int i) {
        if (i < 0) {
            C0178.m393();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static InterfaceC3077 m7074(InterfaceC3077 interfaceC3077) {
        if ((interfaceC3077 instanceof C0744) || (interfaceC3077 instanceof C4767)) {
            return interfaceC3077;
        }
        if (interfaceC3077 instanceof Serializable) {
            return new C4767(interfaceC3077);
        }
        C0744 c0744 = new C0744();
        interfaceC3077.getClass();
        c0744.f2704 = interfaceC3077;
        return c0744;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static void m7075(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("Unable to create parent directories of ");
        sb.append(strValueOf);
        throw new IOException(sb.toString());
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static double m7076(double[] dArr) {
        double d = dArr[0];
        double[][] dArr2 = f13129;
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double dM7101 = m7101(d6);
        double dM7102 = m7101(d7);
        double dM7103 = m7101(d8);
        return Math.atan2(((dM7101 + dM7102) - (dM7103 * 2.0d)) / 9.0d, ((((-12.0d) * dM7102) + (dM7101 * 11.0d)) + dM7103) / 11.0d);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static C4073 m7077(SSLSession sSLSession) throws IOException {
        List listM7225;
        List listM7226 = C2340.f7777;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            C1078.m2276("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            C5028.m8448("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        C5700 c5700M5946 = C5700.f18761.m5946(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            C1078.m2276("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            C5028.m8448("tlsVersion == NONE");
            return null;
        }
        EnumC2044 enumC2044M4192 = AbstractC2164.m4192(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listM7225 = peerCertificates != null ? AbstractC4031.m7225(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listM7226;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listM7226 = AbstractC4031.m7225(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new C4073(enumC2044M4192, c5700M5946, listM7226, new C5285(9, listM7225));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m7078(boolean z, InterfaceC0705 interfaceC0705, C1808 c1808, C5521 c5521, String str, C0857 c0857, C5362 c5362, int i) {
        InterfaceC0705 interfaceC0706;
        String str2;
        c5362.m8979(-1448730565);
        int i2 = (c5362.m9006(z) ? 4 : 2) | i | 48;
        if ((i & 384) == 0) {
            i2 |= c5362.m8963(c1808) ? 256 : 128;
        }
        int i3 = i2 | 24576;
        if (c5362.m9011(i3 & 1, (74899 & i3) != 74898)) {
            C0777 c0777M5189 = AbstractC2774.m5189(Boolean.valueOf(z), "AnimatedVisibility", c5362, (i3 & 14) | 48, 0);
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = C1931.f6383;
                c5362.m8987(objM8999);
            }
            m7067(c0777M5189, (InterfaceC4745) objM8999, c1808, c5521, c0857, c5362, ((i3 << 3) & 7168) | 221616);
            interfaceC0706 = C4217.f13994;
            str2 = "AnimatedVisibility";
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
            str2 = str;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1647(z, interfaceC0706, c1808, c5521, str2, c0857, i);
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final InterfaceC0705 m7079(InterfaceC0705 interfaceC0705, InterfaceC3028 interfaceC3028, C3323 c3323) {
        return interfaceC0705.mo1571(new C2759(interfaceC3028, c3323));
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final void m7080(InterfaceC0705 interfaceC0705, C0857 c0857, C5362 c5362, int i) {
        c5362.m8979(-1854833411);
        int i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = C2480.f8269;
                c5362.m8987(objM8999);
            }
            InterfaceC3228 interfaceC3228 = (InterfaceC3228) objM8999;
            int iHashCode = Long.hashCode(c5362.f17657);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            c5362.m8983();
            if (c5362.f17668) {
                c5362.m9005(c3709);
            } else {
                c5362.m8972();
            }
            AbstractC0993.m2127(C0849.f3048, c5362, interfaceC3228);
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(iHashCode));
            AbstractC0993.m2146(c5362, C0849.f3050);
            AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
            c0857.mo219(c5362, 6);
            c5362.m9009(true);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4762(i, 15, interfaceC0705, c0857);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m7081(C0777 c0777, InterfaceC4745 interfaceC4745, InterfaceC0705 interfaceC0705, C1808 c1808, C5521 c5521, InterfaceC5731 interfaceC5731, C0857 c0857, C5362 c5362, int i) {
        int i2;
        C5627 c5627;
        C5627 c5628;
        boolean z;
        C5627 c5629;
        C5627 c5627M5203;
        boolean z2;
        boolean z3;
        C0857 c0858 = c0857;
        C4852 c4852 = c0777.f2814;
        c5362.m8979(1912839215);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(c0777) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8977(interfaceC4745) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8963(interfaceC0705) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8963(c1808) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= c5362.m8963(c5521) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= c5362.m8977(interfaceC5731) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= c5362.m8977(c0858) ? 8388608 : 4194304;
        }
        if (!c5362.m9011(i3 & 1, (4793491 & i3) != 4793490)) {
            c5362.m8982();
        } else if (((Boolean) interfaceC4745.mo211(c4852.getValue())).booleanValue() || ((Boolean) interfaceC4745.mo211(c0777.m1671())).booleanValue() || c0777.m1681() || c0777.m1677()) {
            c5362.m8957(-232386135);
            int i4 = i3 & 14;
            int i5 = i4 | 48;
            int i6 = i5 & 14;
            boolean z4 = ((i6 ^ 6) > 4 && c5362.m8963(c0777)) || (i5 & 6) == 4;
            Object objM8999 = c5362.m8999();
            Object obj = C2850.f9517;
            if (z4 || objM8999 == obj) {
                objM8999 = c0777.m1671();
                c5362.m8987(objM8999);
            }
            if (c0777.m1681()) {
                objM8999 = c0777.m1671();
            }
            c5362.m8957(1844425648);
            EnumC0211 enumC0211M7082 = m7082(c0777, interfaceC4745, objM8999, c5362);
            c5362.m9009(false);
            Object value = c4852.getValue();
            c5362.m8957(1844425648);
            EnumC0211 enumC0211M7083 = m7082(c0777, interfaceC4745, value, c5362);
            c5362.m9009(false);
            int i7 = i6 | 3072;
            int i8 = (i7 & 14) ^ 6;
            boolean z5 = (i8 > 4 && c5362.m8963(c0777)) || (i7 & 6) == 4;
            Object objM89910 = c5362.m8999();
            if (z5 || objM89910 == obj) {
                objM89910 = new C0777(new C5208(enumC0211M7082), c0777, AbstractC3761.m6621(new StringBuilder(), c0777.f2808, " > EnterExitTransition"));
                c5362.m8987(objM89910);
            }
            C0777 c0778 = (C0777) objM89910;
            boolean zM8963 = ((i8 > 4 && c5362.m8963(c0777)) || (i7 & 6) == 4) | c5362.m8963(c0778);
            Object objM89911 = c5362.m8999();
            if (zM8963 || objM89911 == obj) {
                objM89911 = new C1708(16, c0777, c0778);
                c5362.m8987(objM89911);
            }
            AbstractC3925.m7028(c0778, (InterfaceC4745) objM89911, c5362);
            if (c0777.m1681()) {
                c0778.m1678(enumC0211M7082, enumC0211M7083);
            } else {
                c0778.m1680(enumC0211M7083);
                c0778.f2817.setValue(Boolean.FALSE);
            }
            C0969 c0969 = AbstractC0757.f2750;
            boolean zM8964 = c5362.m8963(c0778);
            Object objM89912 = c5362.m8999();
            if (zM8964 || objM89912 == obj) {
                objM89912 = AbstractC2774.m5183(c1808);
                c5362.m8987(objM89912);
            }
            InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM89912;
            Object objM1671 = c0778.m1671();
            C4852 c4853 = c0778.f2814;
            Object value2 = c4853.getValue();
            EnumC0211 enumC0211 = EnumC0211.f795;
            if (objM1671 == value2 && c0778.m1671() == enumC0211) {
                if (c0778.m1681()) {
                    interfaceC4367.setValue(c1808);
                } else {
                    interfaceC4367.setValue(C1808.f6020);
                }
            } else if (c4853.getValue() == enumC0211) {
                interfaceC4367.setValue(((C1808) interfaceC4367.getValue()).m3590(c1808));
            }
            C1808 c1809 = (C1808) interfaceC4367.getValue();
            boolean zM8965 = c5362.m8963(c0778);
            Object objM89913 = c5362.m8999();
            if (zM8965 || objM89913 == obj) {
                objM89913 = AbstractC2774.m5183(c5521);
                c5362.m8987(objM89913);
            }
            InterfaceC4367 interfaceC4368 = (InterfaceC4367) objM89913;
            if (c0778.m1671() == c4853.getValue() && c0778.m1671() == enumC0211) {
                if (c0778.m1681()) {
                    interfaceC4368.setValue(c5521);
                } else {
                    interfaceC4368.setValue(C5521.f18230);
                }
            } else if (c4853.getValue() != enumC0211) {
                interfaceC4368.setValue(((C5521) interfaceC4368.getValue()).m9204(c5521));
            }
            C5521 c5522 = (C5521) interfaceC4368.getValue();
            Object objM5175 = AbstractC2774.m5175(interfaceC5731, c5362);
            Object objMo219 = interfaceC5731.mo219(c0778.m1671(), c4853.getValue());
            boolean zM8966 = c5362.m8963(c0778) | c5362.m8963(objM5175);
            Object objM89914 = c5362.m8999();
            InterfaceC0443 interfaceC0443 = null;
            if (zM8966 || objM89914 == obj) {
                objM89914 = new C0061(c0778, objM5175, interfaceC0443, 5);
                c5362.m8987(objM89914);
            }
            InterfaceC5731 interfaceC5732 = (InterfaceC5731) objM89914;
            Object objM89915 = c5362.m8999();
            if (objM89915 == obj) {
                objM89915 = AbstractC2774.m5183(objMo219);
                c5362.m8987(objM89915);
            }
            InterfaceC4367 interfaceC4369 = (InterfaceC4367) objM89915;
            boolean zM8977 = c5362.m8977(interfaceC5732);
            Object objM89916 = c5362.m8999();
            if (zM8977 || objM89916 == obj) {
                objM89916 = new C3180(interfaceC5732, interfaceC4369, interfaceC0443, 0);
                c5362.m8987(objM89916);
            }
            AbstractC3925.m7030((InterfaceC5731) objM89916, c5362, C2358.f7817);
            Object objM1672 = c0778.m1671();
            EnumC0211 enumC0212 = EnumC0211.f793;
            if (objM1672 == enumC0212 && c4853.getValue() == enumC0212 && ((Boolean) interfaceC4369.getValue()).booleanValue()) {
                c5362.m8957(-229368781);
                z3 = false;
                c5362.m9009(false);
                c0858 = c0857;
            } else {
                c5362.m8957(-230699766);
                boolean z6 = i4 == 4;
                Object objM89917 = c5362.m8999();
                if (z6 || objM89917 == obj) {
                    objM89917 = new C4784();
                    c5362.m8987(objM89917);
                }
                C4784 c4784 = (C4784) objM89917;
                C1280 c1280 = AbstractC3831.f12714;
                Object objM89918 = c5362.m8999();
                if (objM89918 == obj) {
                    objM89918 = C3709.f12364;
                    c5362.m8987(objM89918);
                }
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) objM89918;
                c5362.m8957(-167964673);
                c5362.m9009(false);
                c5362.m8957(-167961890);
                c5362.m9009(false);
                C3650 c3650 = c1809.f6021;
                C3650 c3651 = c5522.f18231;
                C2565 c2565 = c3650.f12211;
                C5388 c5388 = c3650.f12209;
                boolean z7 = (c2565 == null && c3651.f12211 == null) ? false : true;
                boolean z8 = (c5388 == null && c3651.f12209 == null) ? false : true;
                if (z7) {
                    c5362.m8957(-911488127);
                    Object objM89919 = c5362.m8999();
                    if (objM89919 == obj) {
                        objM89919 = "Built-in slide";
                        c5362.m8987("Built-in slide");
                    }
                    C5627 c5627M5204 = AbstractC2774.m5203(c0778, c1280, (String) objM89919, c5362);
                    c5362.m9009(false);
                    c5627 = c5627M5204;
                } else {
                    c5362.m8957(-911382324);
                    c5362.m9009(false);
                    c5627 = null;
                }
                if (z8 != 0) {
                    c5362.m8957(-911290533);
                    C1280 c1281 = AbstractC3831.f12715;
                    Object objM89920 = c5362.m8999();
                    if (objM89920 == obj) {
                        objM89920 = "Built-in shrink/expand";
                        c5362.m8987("Built-in shrink/expand");
                    }
                    C5627 c5627M5205 = AbstractC2774.m5203(c0778, c1281, (String) objM89920, c5362);
                    c5362.m9009(false);
                    c5628 = c5627M5205;
                } else {
                    c5362.m8957(-911179709);
                    c5362.m9009(false);
                    c5628 = null;
                }
                if (z8 != 0) {
                    c5362.m8957(-911106083);
                    Object objM89921 = c5362.m8999();
                    if (objM89921 == obj) {
                        objM89921 = "Built-in InterruptionHandlingOffset";
                        c5362.m8987("Built-in InterruptionHandlingOffset");
                    }
                    C5627 c5627M5206 = AbstractC2774.m5203(c0778, c1280, (String) objM89921, c5362);
                    z = false;
                    c5362.m9009(false);
                    c5629 = c5627M5206;
                } else {
                    z = false;
                    c5362.m8957(-910935677);
                    c5362.m9009(false);
                    c5629 = null;
                }
                boolean z9 = !z8;
                float[] fArr = C3444.f11438;
                c5362.m8957(-910130296);
                c5362.m9009(z);
                if (c3650.f12212 == null && c3651.f12212 == null) {
                    c5362.m8957(-703709976);
                    c5362.m9009(z);
                    z2 = z;
                    c5627M5203 = null;
                } else {
                    c5362.m8957(-703879421);
                    C1280 c1282 = AbstractC3831.f12709;
                    Object objM89922 = c5362.m8999();
                    if (objM89922 == obj) {
                        objM89922 = "Built-in alpha";
                        c5362.m8987("Built-in alpha");
                    }
                    c5627M5203 = AbstractC2774.m5203(c0778, c1282, (String) objM89922, c5362);
                    z2 = false;
                    c5362.m9009(false);
                }
                c5362.m8957(-703472888);
                c5362.m9009(z2);
                c5362.m8957(-703222904);
                c5362.m9009(z2);
                boolean zM8978 = c5362.m8977(c5627M5203) | c5362.m8963(c1809) | c5362.m8963(c5522) | c5362.m8977(null) | c5362.m8963(c0778) | c5362.m8977(null);
                Object objM89923 = c5362.m8999();
                if (zM8978 || objM89923 == obj) {
                    objM89923 = new C3106(c5627M5203, c0778, c1809, c5522);
                    c5362.m8987(objM89923);
                }
                C3106 c3106 = (C3106) objM89923;
                boolean zM9006 = c5362.m9006(z9) | c5362.m8963(interfaceC4448);
                Object objM89924 = c5362.m8999();
                if (zM9006 || objM89924 == obj) {
                    objM89924 = new C5035(interfaceC4448, z9);
                    c5362.m8987(objM89924);
                }
                C4217 c4217 = C4217.f13994;
                InterfaceC0705 interfaceC0705Mo1571 = AbstractC4554.m7887(c4217, (InterfaceC4745) objM89924).mo1571(new C2676(c0778, c5628, c5629, c5627, c1809, c5522, interfaceC4448, c3106)).mo1571(c4217);
                c5362.m8957(-7404393);
                c5362.m9009(false);
                InterfaceC0705 interfaceC0705Mo1572 = interfaceC0705.mo1571(interfaceC0705Mo1571.mo1571(c4217));
                Object objM89925 = c5362.m8999();
                if (objM89925 == obj) {
                    objM89925 = new C3692(c4784);
                    c5362.m8987(objM89925);
                }
                C3692 c3692 = (C3692) objM89925;
                int iHashCode = Long.hashCode(c5362.f17657);
                C2103 c2103M8994 = c5362.m8994();
                InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705Mo1572);
                InterfaceC4576.f15106.getClass();
                InterfaceC4448 interfaceC4449 = C0849.f3049;
                c5362.m8983();
                if (c5362.f17668) {
                    c5362.m9005(interfaceC4449);
                } else {
                    c5362.m8972();
                }
                AbstractC0993.m2127(C0849.f3048, c5362, c3692);
                AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
                AbstractC0993.m2153(c5362, Integer.valueOf(iHashCode), C0849.f3053);
                AbstractC0993.m2146(c5362, C0849.f3050);
                AbstractC0993.m2127(C0849.f3052, c5362, interfaceC0705M2161);
                c0858 = c0857;
                c0858.mo1173(c4784, c5362, Integer.valueOf((i3 >> 18) & 112));
                c5362.m9009(true);
                z3 = false;
                c5362.m9009(false);
            }
            c5362.m9009(z3);
        } else {
            c5362.m8957(-229362829);
            c5362.m9009(false);
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3780(c0777, interfaceC4745, interfaceC0705, c1808, c5521, interfaceC5731, c0858, i);
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final EnumC0211 m7082(C0777 c0777, InterfaceC4745 interfaceC4745, Object obj, C5362 c5362) {
        c5362.m8989(-422486745, 0, c0777, null);
        boolean zM1681 = c0777.m1681();
        EnumC0211 enumC0211 = EnumC0211.f796;
        EnumC0211 enumC0212 = EnumC0211.f793;
        EnumC0211 enumC0213 = EnumC0211.f795;
        if (zM1681) {
            c5362.m8957(-212166497);
            c5362.m9009(false);
            if (((Boolean) interfaceC4745.mo211(obj)).booleanValue()) {
                enumC0211 = enumC0213;
            } else if (((Boolean) interfaceC4745.mo211(c0777.m1671())).booleanValue()) {
                enumC0211 = enumC0212;
            }
        } else {
            c5362.m8957(-211892364);
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = AbstractC2774.m5183(Boolean.FALSE);
                c5362.m8987(objM8999);
            }
            InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
            if (((Boolean) interfaceC4745.mo211(c0777.m1671())).booleanValue()) {
                interfaceC4367.setValue(Boolean.TRUE);
            }
            if (((Boolean) interfaceC4745.mo211(obj)).booleanValue()) {
                enumC0211 = enumC0213;
            } else if (((Boolean) interfaceC4367.getValue()).booleanValue()) {
                enumC0211 = enumC0212;
            }
            c5362.m9009(false);
        }
        c5362.m9009(false);
        return enumC0211;
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static synchronized boolean m7083(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f13128;
        if (context2 != null && (bool = f13126) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f13126 = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f13126 = boolValueOf;
        f13128 = applicationContext;
        return boolValueOf.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0110  */
    /* JADX WARN: Code duplicated, block: B:103:0x0113  */
    /* JADX WARN: Code duplicated, block: B:106:0x011c  */
    /* JADX WARN: Code duplicated, block: B:108:0x012b  */
    /* JADX WARN: Code duplicated, block: B:121:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0151  */
    /* JADX WARN: Code duplicated, block: B:125:0x0157  */
    /* JADX WARN: Code duplicated, block: B:128:0x0165  */
    /* JADX WARN: Code duplicated, block: B:130:0x0173  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:139:0x01be  */
    /* JADX WARN: Code duplicated, block: B:143:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:155:0x0211  */
    /* JADX WARN: Code duplicated, block: B:157:0x0226  */
    /* JADX WARN: Code duplicated, block: B:160:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0242  */
    /* JADX WARN: Code duplicated, block: B:166:0x025e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0260  */
    /* JADX WARN: Code duplicated, block: B:169:0x0264  */
    /* JADX WARN: Code duplicated, block: B:170:0x0267  */
    /* JADX WARN: Code duplicated, block: B:172:0x026b  */
    /* JADX WARN: Code duplicated, block: B:173:0x026e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0272  */
    /* JADX WARN: Code duplicated, block: B:176:0x0275  */
    /* JADX WARN: Code duplicated, block: B:179:0x027d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0294  */
    /* JADX WARN: Code duplicated, block: B:183:0x02af  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:199:0x02e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:205:0x0309  */
    /* JADX WARN: Code duplicated, block: B:206:0x0315  */
    /* JADX WARN: Code duplicated, block: B:209:0x031c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0365  */
    /* JADX WARN: Code duplicated, block: B:214:0x0374  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:99:0x0102  */
    /* JADX INFO: renamed from: ۦؑ */
    public static final void m7084(final InterfaceC4448 interfaceC4448, final InterfaceC0705 interfaceC0705, boolean z, InterfaceC2864 interfaceC2864, C4697 c4697, C1446 c1446, InterfaceC1291 interfaceC1291, final InterfaceC2609 interfaceC2609, C5362 c5362, final int i, final int i2) {
        int i3;
        boolean z2;
        InterfaceC2864 interfaceC2864M546;
        C4697 c4698;
        C1446 c1447;
        int i4;
        int i5;
        InterfaceC1291 interfaceC1292;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        final InterfaceC1291 interfaceC1293;
        final boolean z5;
        final InterfaceC2864 interfaceC2865;
        final C4697 c4699;
        final C1446 c1448;
        C5863 c5863M8965;
        C4697 c46910;
        InterfaceC1291 interfaceC1294;
        int i8;
        boolean z6;
        C4697 c46911;
        InterfaceC2864 interfaceC2866;
        C2917 c2917;
        Object objM8999;
        Object obj;
        C2243 c2243;
        long j;
        long j2;
        int i9;
        Object objM89910;
        C1347 c1347;
        boolean zM8963;
        Object objM89911;
        InterfaceC2714 interfaceC2714;
        float f;
        Object objM89912;
        C5825 c5825;
        boolean zM8977;
        Object objM89913;
        C1446 c1449;
        C3411 c3411;
        float f2;
        Object objM89914;
        int i10;
        c5362.m8979(-1310015664);
        if ((i & 6) == 0) {
            i3 = (c5362.m8977(interfaceC4448) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c5362.m8963(interfaceC0705) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= c5362.m9006(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    interfaceC2864M546 = interfaceC2864;
                    int i12 = c5362.m8963(interfaceC2864M546) ? 2048 : 1024;
                    i3 |= i12;
                } else {
                    interfaceC2864M546 = interfaceC2864;
                }
                i3 |= i12;
            } else {
                interfaceC2864M546 = interfaceC2864;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    c4698 = c4697;
                    int i13 = c5362.m8963(c4698) ? 16384 : 8192;
                    i3 |= i13;
                } else {
                    c4698 = c4697;
                }
                i3 |= i13;
            } else {
                c4698 = c4697;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    c1447 = c1446;
                    int i14 = c5362.m8963(c1447) ? 131072 : 65536;
                    i3 |= i14;
                } else {
                    c1447 = c1446;
                }
                i3 |= i14;
            } else {
                c1447 = c1446;
            }
            if ((i2 & 64) != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (c5362.m8963(null)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            i5 = i2 & 128;
            if (i5 != 0) {
                if ((12582912 & i) == 0) {
                    interfaceC1292 = interfaceC1291;
                    if (c5362.m8963(interfaceC1292)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i3 |= i6;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (c5362.m8963(null)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                if ((805306368 & i) != 0) {
                    if (c5362.m8977(interfaceC2609)) {
                        i10 = 536870912;
                    } else {
                        i10 = 268435456;
                    }
                    i3 |= i10;
                }
                z3 = true;
                if ((i3 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c5362.m9011(i3 & 1, z4)) {
                    c5362.m8971();
                    if ((i & 1) != 0 || c5362.m8969()) {
                        if (i11 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            C1393 c1393 = AbstractC3017.f10163;
                            i3 &= -7169;
                            interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                        }
                        if ((i2 & 16) != 0) {
                            C1393 c1394 = AbstractC3017.f10163;
                            c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                            c46910 = c2917.f9729;
                            if (c46910 == null) {
                                c46910 = new C4697(AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 10), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.1f, 14), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14));
                                c2917.f9729 = c46910;
                            }
                            i3 &= -57345;
                        } else {
                            c46910 = c4698;
                        }
                        if ((i2 & 32) != 0) {
                            C1393 c1395 = AbstractC3017.f10163;
                            i3 &= -458753;
                            c1447 = new C1446(0.0f, 0.0f, 0.0f, 1.0f);
                        }
                        if (i5 != 0) {
                            interfaceC1294 = AbstractC3017.f10163;
                        } else {
                            interfaceC1294 = interfaceC1291;
                        }
                        boolean z7 = z2;
                        i8 = i3;
                        z6 = z7;
                        interfaceC1292 = interfaceC1294;
                        c46911 = c46910;
                        interfaceC2866 = interfaceC2864M546;
                    } else {
                        c5362.m8982();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        boolean z8 = z2;
                        i8 = i3;
                        z6 = z8;
                        interfaceC2866 = interfaceC2864M546;
                        c46911 = c4698;
                    }
                    c5362.m8964();
                    c5362.m8957(1691738187);
                    objM8999 = c5362.m8999();
                    obj = C2850.f9517;
                    if (objM8999 == obj) {
                        objM8999 = new C2243();
                        c5362.m8987(objM8999);
                    }
                    c2243 = (C2243) objM8999;
                    c5362.m9009(false);
                    if (z6) {
                        j = c46911.f15490;
                    } else {
                        j = c46911.f15488;
                    }
                    if (z6) {
                        j2 = c46911.f15489;
                    } else {
                        j2 = c46911.f15491;
                    }
                    long j3 = j;
                    if (c1447 == null) {
                        c5362.m8957(1691921830);
                        c5362.m9009(false);
                        c46911 = c46911;
                        interfaceC2866 = interfaceC2866;
                        c2243 = c2243;
                        c1449 = c1447;
                        j2 = j2;
                        c3411 = null;
                    } else {
                        c5362.m8957(-499611205);
                        i9 = ((i8 >> 6) & 14) | ((i8 >> 9) & 896);
                        objM89910 = c5362.m8999();
                        if (objM89910 == obj) {
                            objM89910 = new C1347();
                            c5362.m8987(objM89910);
                        }
                        c1347 = (C1347) objM89910;
                        zM8963 = c5362.m8963(c2243);
                        objM89911 = c5362.m8999();
                        if (zM8963 || objM89911 == obj) {
                            objM89911 = new C0023(c2243, c1347, null, 9);
                            c5362.m8987(objM89911);
                        }
                        AbstractC3925.m7030((InterfaceC5731) objM89911, c5362, c2243);
                        interfaceC2714 = (InterfaceC2714) AbstractC0973.m2043(c1347);
                        if (!z6) {
                            f = 0.0f;
                        } else if (interfaceC2714 instanceof C3656) {
                            f = c1447.f4951;
                        } else if (interfaceC2714 instanceof C0266) {
                            f = c1447.f4953;
                        } else if (interfaceC2714 instanceof C3213) {
                            f = c1447.f4950;
                        } else {
                            f = c1447.f4952;
                        }
                        objM89912 = c5362.m8999();
                        if (objM89912 == obj) {
                            objM89912 = new C5825(new C4497(f), AbstractC3831.f12711, null, 12);
                            c5362.m8987(objM89912);
                        }
                        c5825 = (C5825) objM89912;
                        C4497 c4497 = new C4497(f);
                        boolean zM8978 = c5362.m8977(c5825) | c5362.m8956(f) | ((((i9 & 14) ^ 6) <= 4 && c5362.m9006(z6)) || (i9 & 6) == 4);
                        if ((((i9 & 896) ^ 384) > 256 || !c5362.m8963(c1447)) && (i9 & 384) != 256) {
                        }
                        zM8977 = zM8978 | z3 | c5362.m8977(interfaceC2714);
                        objM89913 = c5362.m8999();
                        if (!zM8977 || objM89913 == obj) {
                            c1449 = c1447;
                            objM89913 = new C1070(c5825, f, z6, c1449, interfaceC2714, null);
                            c5362.m8987(objM89913);
                        } else {
                            c1449 = c1447;
                        }
                        AbstractC3925.m7030((InterfaceC5731) objM89913, c5362, c4497);
                        c3411 = c5825.f19169;
                        c5362.m9009(false);
                    }
                    if (c3411 != null) {
                        f2 = ((C4497) c3411.f11359.getValue()).f14871;
                    } else {
                        f2 = 0.0f;
                    }
                    objM89914 = c5362.m8999();
                    if (objM89914 == obj) {
                        objM89914 = new C0086(13);
                        c5362.m8987(objM89914);
                    }
                    InterfaceC1291 interfaceC1295 = interfaceC1292;
                    long j4 = j2;
                    InterfaceC2864 interfaceC2867 = interfaceC2866;
                    AbstractC0701.m1559(interfaceC4448, AbstractC1697.m3510(interfaceC0705, false, (InterfaceC4745) objM89914), z6, interfaceC2867, j3, j4, 0.0f, f2, c2243, AbstractC3925.m7034(-535639973, new C1874(j4, interfaceC1295, interfaceC2609, 0), c5362), c5362, (i8 & 8078) | (234881024 & (i8 << 6)), 64);
                    z5 = z6;
                    interfaceC2865 = interfaceC2867;
                    interfaceC1293 = interfaceC1295;
                    c1448 = c1449;
                    c4699 = c46911;
                } else {
                    c5362.m8982();
                    interfaceC1293 = interfaceC1291;
                    z5 = z2;
                    interfaceC2865 = interfaceC2864M546;
                    c4699 = c4698;
                    c1448 = c1447;
                }
                c5863M8965 = c5362.m8965();
                if (c5863M8965 != null) {
                    c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥۤۛ٘
                        @Override // p000.InterfaceC5731
                        /* JADX INFO: renamed from: ۥۜ */
                        public final Object mo219(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            AbstractC3933.m7084(interfaceC4448, interfaceC0705, z5, interfaceC2865, c4699, c1448, interfaceC1293, interfaceC2609, (C5362) obj2, AbstractC3831.m6835(i | 1), i2);
                            return C2358.f7817;
                        }
                    };
                }
            }
            i3 |= 12582912;
            interfaceC1292 = interfaceC1291;
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (c5362.m8963(null)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            if ((805306368 & i) != 0) {
                if (c5362.m8977(interfaceC2609)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i3 |= i10;
            }
            z3 = true;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c5362.m9011(i3 & 1, z4)) {
                c5362.m8971();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        C1393 c1396 = AbstractC3017.f10163;
                        i3 &= -7169;
                        interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                    }
                    if ((i2 & 16) != 0) {
                        C1393 c1397 = AbstractC3017.f10163;
                        c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                        c46910 = c2917.f9729;
                        if (c46910 == null) {
                            c46910 = new C4697(AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 10), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.1f, 14), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14));
                            c2917.f9729 = c46910;
                        }
                        i3 &= -57345;
                    } else {
                        c46910 = c4698;
                    }
                    if ((i2 & 32) != 0) {
                        C1393 c1398 = AbstractC3017.f10163;
                        i3 &= -458753;
                        c1447 = new C1446(0.0f, 0.0f, 0.0f, 1.0f);
                    }
                    if (i5 != 0) {
                        interfaceC1294 = AbstractC3017.f10163;
                    } else {
                        interfaceC1294 = interfaceC1291;
                    }
                    boolean z9 = z2;
                    i8 = i3;
                    z6 = z9;
                    interfaceC1292 = interfaceC1294;
                    c46911 = c46910;
                    interfaceC2866 = interfaceC2864M546;
                } else {
                    if (i11 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        C1393 c1399 = AbstractC3017.f10163;
                        i3 &= -7169;
                        interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                    }
                    if ((i2 & 16) != 0) {
                        C1393 c13910 = AbstractC3017.f10163;
                        c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                        c46910 = c2917.f9729;
                        if (c46910 == null) {
                            c46910 = new C4697(AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 10), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.1f, 14), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14));
                            c2917.f9729 = c46910;
                        }
                        i3 &= -57345;
                    } else {
                        c46910 = c4698;
                    }
                    if ((i2 & 32) != 0) {
                        C1393 c13911 = AbstractC3017.f10163;
                        i3 &= -458753;
                        c1447 = new C1446(0.0f, 0.0f, 0.0f, 1.0f);
                    }
                    if (i5 != 0) {
                        interfaceC1294 = AbstractC3017.f10163;
                    } else {
                        interfaceC1294 = interfaceC1291;
                    }
                    boolean z10 = z2;
                    i8 = i3;
                    z6 = z10;
                    interfaceC1292 = interfaceC1294;
                    c46911 = c46910;
                    interfaceC2866 = interfaceC2864M546;
                }
                c5362.m8964();
                c5362.m8957(1691738187);
                objM8999 = c5362.m8999();
                obj = C2850.f9517;
                if (objM8999 == obj) {
                    objM8999 = new C2243();
                    c5362.m8987(objM8999);
                }
                c2243 = (C2243) objM8999;
                c5362.m9009(false);
                if (z6) {
                    j = c46911.f15490;
                } else {
                    j = c46911.f15488;
                }
                if (z6) {
                    j2 = c46911.f15489;
                } else {
                    j2 = c46911.f15491;
                }
                long j5 = j;
                if (c1447 == null) {
                    c5362.m8957(1691921830);
                    c5362.m9009(false);
                    c46911 = c46911;
                    interfaceC2866 = interfaceC2866;
                    c2243 = c2243;
                    c1449 = c1447;
                    j2 = j2;
                    c3411 = null;
                } else {
                    c5362.m8957(-499611205);
                    i9 = ((i8 >> 6) & 14) | ((i8 >> 9) & 896);
                    objM89910 = c5362.m8999();
                    if (objM89910 == obj) {
                        objM89910 = new C1347();
                        c5362.m8987(objM89910);
                    }
                    c1347 = (C1347) objM89910;
                    zM8963 = c5362.m8963(c2243);
                    objM89911 = c5362.m8999();
                    if (zM8963) {
                        objM89911 = new C0023(c2243, c1347, null, 9);
                        c5362.m8987(objM89911);
                    } else {
                        objM89911 = new C0023(c2243, c1347, null, 9);
                        c5362.m8987(objM89911);
                    }
                    AbstractC3925.m7030((InterfaceC5731) objM89911, c5362, c2243);
                    interfaceC2714 = (InterfaceC2714) AbstractC0973.m2043(c1347);
                    if (!z6) {
                        f = 0.0f;
                    } else if (interfaceC2714 instanceof C3656) {
                        f = c1447.f4951;
                    } else if (interfaceC2714 instanceof C0266) {
                        f = c1447.f4953;
                    } else if (interfaceC2714 instanceof C3213) {
                        f = c1447.f4950;
                    } else {
                        f = c1447.f4952;
                    }
                    objM89912 = c5362.m8999();
                    if (objM89912 == obj) {
                        objM89912 = new C5825(new C4497(f), AbstractC3831.f12711, null, 12);
                        c5362.m8987(objM89912);
                    }
                    c5825 = (C5825) objM89912;
                    C4497 c4498 = new C4497(f);
                    boolean zM8979 = c5362.m8977(c5825) | c5362.m8956(f) | ((((i9 & 14) ^ 6) <= 4 && c5362.m9006(z6)) || (i9 & 6) == 4);
                    z3 = ((i9 & 896) ^ 384) > 256 ? false : false;
                    zM8977 = zM8979 | z3 | c5362.m8977(interfaceC2714);
                    objM89913 = c5362.m8999();
                    if (zM8977) {
                        c1449 = c1447;
                        objM89913 = new C1070(c5825, f, z6, c1449, interfaceC2714, null);
                        c5362.m8987(objM89913);
                    } else {
                        c1449 = c1447;
                        objM89913 = new C1070(c5825, f, z6, c1449, interfaceC2714, null);
                        c5362.m8987(objM89913);
                    }
                    AbstractC3925.m7030((InterfaceC5731) objM89913, c5362, c4498);
                    c3411 = c5825.f19169;
                    c5362.m9009(false);
                }
                if (c3411 != null) {
                    f2 = ((C4497) c3411.f11359.getValue()).f14871;
                } else {
                    f2 = 0.0f;
                }
                objM89914 = c5362.m8999();
                if (objM89914 == obj) {
                    objM89914 = new C0086(13);
                    c5362.m8987(objM89914);
                }
                InterfaceC1291 interfaceC1296 = interfaceC1292;
                long j6 = j2;
                InterfaceC2864 interfaceC2868 = interfaceC2866;
                AbstractC0701.m1559(interfaceC4448, AbstractC1697.m3510(interfaceC0705, false, (InterfaceC4745) objM89914), z6, interfaceC2868, j5, j6, 0.0f, f2, c2243, AbstractC3925.m7034(-535639973, new C1874(j6, interfaceC1296, interfaceC2609, 0), c5362), c5362, (i8 & 8078) | (234881024 & (i8 << 6)), 64);
                z5 = z6;
                interfaceC2865 = interfaceC2868;
                interfaceC1293 = interfaceC1296;
                c1448 = c1449;
                c4699 = c46911;
            } else {
                c5362.m8982();
                interfaceC1293 = interfaceC1291;
                z5 = z2;
                interfaceC2865 = interfaceC2864M546;
                c4699 = c4698;
                c1448 = c1447;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥۤۛ٘
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        AbstractC3933.m7084(interfaceC4448, interfaceC0705, z5, interfaceC2865, c4699, c1448, interfaceC1293, interfaceC2609, (C5362) obj2, AbstractC3831.m6835(i | 1), i2);
                        return C2358.f7817;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                interfaceC2864M546 = interfaceC2864;
                if (c5362.m8963(interfaceC2864M546)) {
                }
                i3 |= i12;
            } else {
                interfaceC2864M546 = interfaceC2864;
            }
            i3 |= i12;
        } else {
            interfaceC2864M546 = interfaceC2864;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                c4698 = c4697;
                if (c5362.m8963(c4698)) {
                }
                i3 |= i13;
            } else {
                c4698 = c4697;
            }
            i3 |= i13;
        } else {
            c4698 = c4697;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                c1447 = c1446;
                if (c5362.m8963(c1447)) {
                }
                i3 |= i14;
            } else {
                c1447 = c1446;
            }
            i3 |= i14;
        } else {
            c1447 = c1446;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (c5362.m8963(null)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        i5 = i2 & 128;
        if (i5 != 0) {
            if ((12582912 & i) == 0) {
                interfaceC1292 = interfaceC1291;
                if (c5362.m8963(interfaceC1292)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (c5362.m8963(null)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            if ((805306368 & i) != 0) {
                if (c5362.m8977(interfaceC2609)) {
                    i10 = 536870912;
                } else {
                    i10 = 268435456;
                }
                i3 |= i10;
            }
            z3 = true;
            if ((i3 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c5362.m9011(i3 & 1, z4)) {
                c5362.m8971();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        C1393 c13912 = AbstractC3017.f10163;
                        i3 &= -7169;
                        interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                    }
                    if ((i2 & 16) != 0) {
                        C1393 c13913 = AbstractC3017.f10163;
                        c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                        c46910 = c2917.f9729;
                        if (c46910 == null) {
                            c46910 = new C4697(AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 10), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.1f, 14), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14));
                            c2917.f9729 = c46910;
                        }
                        i3 &= -57345;
                    } else {
                        c46910 = c4698;
                    }
                    if ((i2 & 32) != 0) {
                        C1393 c13914 = AbstractC3017.f10163;
                        i3 &= -458753;
                        c1447 = new C1446(0.0f, 0.0f, 0.0f, 1.0f);
                    }
                    if (i5 != 0) {
                        interfaceC1294 = AbstractC3017.f10163;
                    } else {
                        interfaceC1294 = interfaceC1291;
                    }
                    boolean z11 = z2;
                    i8 = i3;
                    z6 = z11;
                    interfaceC1292 = interfaceC1294;
                    c46911 = c46910;
                    interfaceC2866 = interfaceC2864M546;
                } else {
                    if (i11 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        C1393 c13915 = AbstractC3017.f10163;
                        i3 &= -7169;
                        interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                    }
                    if ((i2 & 16) != 0) {
                        C1393 c13916 = AbstractC3017.f10163;
                        c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                        c46910 = c2917.f9729;
                        if (c46910 == null) {
                            c46910 = new C4697(AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 10), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.1f, 14), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14));
                            c2917.f9729 = c46910;
                        }
                        i3 &= -57345;
                    } else {
                        c46910 = c4698;
                    }
                    if ((i2 & 32) != 0) {
                        C1393 c13917 = AbstractC3017.f10163;
                        i3 &= -458753;
                        c1447 = new C1446(0.0f, 0.0f, 0.0f, 1.0f);
                    }
                    if (i5 != 0) {
                        interfaceC1294 = AbstractC3017.f10163;
                    } else {
                        interfaceC1294 = interfaceC1291;
                    }
                    boolean z12 = z2;
                    i8 = i3;
                    z6 = z12;
                    interfaceC1292 = interfaceC1294;
                    c46911 = c46910;
                    interfaceC2866 = interfaceC2864M546;
                }
                c5362.m8964();
                c5362.m8957(1691738187);
                objM8999 = c5362.m8999();
                obj = C2850.f9517;
                if (objM8999 == obj) {
                    objM8999 = new C2243();
                    c5362.m8987(objM8999);
                }
                c2243 = (C2243) objM8999;
                c5362.m9009(false);
                if (z6) {
                    j = c46911.f15490;
                } else {
                    j = c46911.f15488;
                }
                if (z6) {
                    j2 = c46911.f15489;
                } else {
                    j2 = c46911.f15491;
                }
                long j7 = j;
                if (c1447 == null) {
                    c5362.m8957(1691921830);
                    c5362.m9009(false);
                    c46911 = c46911;
                    interfaceC2866 = interfaceC2866;
                    c2243 = c2243;
                    c1449 = c1447;
                    j2 = j2;
                    c3411 = null;
                } else {
                    c5362.m8957(-499611205);
                    i9 = ((i8 >> 6) & 14) | ((i8 >> 9) & 896);
                    objM89910 = c5362.m8999();
                    if (objM89910 == obj) {
                        objM89910 = new C1347();
                        c5362.m8987(objM89910);
                    }
                    c1347 = (C1347) objM89910;
                    zM8963 = c5362.m8963(c2243);
                    objM89911 = c5362.m8999();
                    if (zM8963) {
                        objM89911 = new C0023(c2243, c1347, null, 9);
                        c5362.m8987(objM89911);
                    } else {
                        objM89911 = new C0023(c2243, c1347, null, 9);
                        c5362.m8987(objM89911);
                    }
                    AbstractC3925.m7030((InterfaceC5731) objM89911, c5362, c2243);
                    interfaceC2714 = (InterfaceC2714) AbstractC0973.m2043(c1347);
                    if (!z6) {
                        f = 0.0f;
                    } else if (interfaceC2714 instanceof C3656) {
                        f = c1447.f4951;
                    } else if (interfaceC2714 instanceof C0266) {
                        f = c1447.f4953;
                    } else if (interfaceC2714 instanceof C3213) {
                        f = c1447.f4950;
                    } else {
                        f = c1447.f4952;
                    }
                    objM89912 = c5362.m8999();
                    if (objM89912 == obj) {
                        objM89912 = new C5825(new C4497(f), AbstractC3831.f12711, null, 12);
                        c5362.m8987(objM89912);
                    }
                    c5825 = (C5825) objM89912;
                    C4497 c4499 = new C4497(f);
                    boolean zM89710 = c5362.m8977(c5825) | c5362.m8956(f) | ((((i9 & 14) ^ 6) <= 4 && c5362.m9006(z6)) || (i9 & 6) == 4);
                    if (((i9 & 896) ^ 384) > 256) {
                    }
                    zM8977 = zM89710 | z3 | c5362.m8977(interfaceC2714);
                    objM89913 = c5362.m8999();
                    if (zM8977) {
                        c1449 = c1447;
                        objM89913 = new C1070(c5825, f, z6, c1449, interfaceC2714, null);
                        c5362.m8987(objM89913);
                    } else {
                        c1449 = c1447;
                        objM89913 = new C1070(c5825, f, z6, c1449, interfaceC2714, null);
                        c5362.m8987(objM89913);
                    }
                    AbstractC3925.m7030((InterfaceC5731) objM89913, c5362, c4499);
                    c3411 = c5825.f19169;
                    c5362.m9009(false);
                }
                if (c3411 != null) {
                    f2 = ((C4497) c3411.f11359.getValue()).f14871;
                } else {
                    f2 = 0.0f;
                }
                objM89914 = c5362.m8999();
                if (objM89914 == obj) {
                    objM89914 = new C0086(13);
                    c5362.m8987(objM89914);
                }
                InterfaceC1291 interfaceC1297 = interfaceC1292;
                long j8 = j2;
                InterfaceC2864 interfaceC2869 = interfaceC2866;
                AbstractC0701.m1559(interfaceC4448, AbstractC1697.m3510(interfaceC0705, false, (InterfaceC4745) objM89914), z6, interfaceC2869, j7, j8, 0.0f, f2, c2243, AbstractC3925.m7034(-535639973, new C1874(j8, interfaceC1297, interfaceC2609, 0), c5362), c5362, (i8 & 8078) | (234881024 & (i8 << 6)), 64);
                z5 = z6;
                interfaceC2865 = interfaceC2869;
                interfaceC1293 = interfaceC1297;
                c1448 = c1449;
                c4699 = c46911;
            } else {
                c5362.m8982();
                interfaceC1293 = interfaceC1291;
                z5 = z2;
                interfaceC2865 = interfaceC2864M546;
                c4699 = c4698;
                c1448 = c1447;
            }
            c5863M8965 = c5362.m8965();
            if (c5863M8965 != null) {
                c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥۤۛ٘
                    @Override // p000.InterfaceC5731
                    /* JADX INFO: renamed from: ۥۜ */
                    public final Object mo219(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        AbstractC3933.m7084(interfaceC4448, interfaceC0705, z5, interfaceC2865, c4699, c1448, interfaceC1293, interfaceC2609, (C5362) obj2, AbstractC3831.m6835(i | 1), i2);
                        return C2358.f7817;
                    }
                };
            }
        }
        i3 |= 12582912;
        interfaceC1292 = interfaceC1291;
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (c5362.m8963(null)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        if ((805306368 & i) != 0) {
            if (c5362.m8977(interfaceC2609)) {
                i10 = 536870912;
            } else {
                i10 = 268435456;
            }
            i3 |= i10;
        }
        z3 = true;
        if ((i3 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c5362.m9011(i3 & 1, z4)) {
            c5362.m8971();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    C1393 c13918 = AbstractC3017.f10163;
                    i3 &= -7169;
                    interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                }
                if ((i2 & 16) != 0) {
                    C1393 c13919 = AbstractC3017.f10163;
                    c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                    c46910 = c2917.f9729;
                    if (c46910 == null) {
                        c46910 = new C4697(AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 10), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.1f, 14), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14));
                        c2917.f9729 = c46910;
                    }
                    i3 &= -57345;
                } else {
                    c46910 = c4698;
                }
                if ((i2 & 32) != 0) {
                    C1393 c139110 = AbstractC3017.f10163;
                    i3 &= -458753;
                    c1447 = new C1446(0.0f, 0.0f, 0.0f, 1.0f);
                }
                if (i5 != 0) {
                    interfaceC1294 = AbstractC3017.f10163;
                } else {
                    interfaceC1294 = interfaceC1291;
                }
                boolean z13 = z2;
                i8 = i3;
                z6 = z13;
                interfaceC1292 = interfaceC1294;
                c46911 = c46910;
                interfaceC2866 = interfaceC2864M546;
            } else {
                if (i11 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    C1393 c139111 = AbstractC3017.f10163;
                    i3 &= -7169;
                    interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                }
                if ((i2 & 16) != 0) {
                    C1393 c139112 = AbstractC3017.f10163;
                    c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                    c46910 = c2917.f9729;
                    if (c46910 == null) {
                        c46910 = new C4697(AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 10), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.1f, 14), C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14));
                        c2917.f9729 = c46910;
                    }
                    i3 &= -57345;
                } else {
                    c46910 = c4698;
                }
                if ((i2 & 32) != 0) {
                    C1393 c139113 = AbstractC3017.f10163;
                    i3 &= -458753;
                    c1447 = new C1446(0.0f, 0.0f, 0.0f, 1.0f);
                }
                if (i5 != 0) {
                    interfaceC1294 = AbstractC3017.f10163;
                } else {
                    interfaceC1294 = interfaceC1291;
                }
                boolean z14 = z2;
                i8 = i3;
                z6 = z14;
                interfaceC1292 = interfaceC1294;
                c46911 = c46910;
                interfaceC2866 = interfaceC2864M546;
            }
            c5362.m8964();
            c5362.m8957(1691738187);
            objM8999 = c5362.m8999();
            obj = C2850.f9517;
            if (objM8999 == obj) {
                objM8999 = new C2243();
                c5362.m8987(objM8999);
            }
            c2243 = (C2243) objM8999;
            c5362.m9009(false);
            if (z6) {
                j = c46911.f15490;
            } else {
                j = c46911.f15488;
            }
            if (z6) {
                j2 = c46911.f15489;
            } else {
                j2 = c46911.f15491;
            }
            long j9 = j;
            if (c1447 == null) {
                c5362.m8957(1691921830);
                c5362.m9009(false);
                c46911 = c46911;
                interfaceC2866 = interfaceC2866;
                c2243 = c2243;
                c1449 = c1447;
                j2 = j2;
                c3411 = null;
            } else {
                c5362.m8957(-499611205);
                i9 = ((i8 >> 6) & 14) | ((i8 >> 9) & 896);
                objM89910 = c5362.m8999();
                if (objM89910 == obj) {
                    objM89910 = new C1347();
                    c5362.m8987(objM89910);
                }
                c1347 = (C1347) objM89910;
                zM8963 = c5362.m8963(c2243);
                objM89911 = c5362.m8999();
                if (zM8963) {
                    objM89911 = new C0023(c2243, c1347, null, 9);
                    c5362.m8987(objM89911);
                } else {
                    objM89911 = new C0023(c2243, c1347, null, 9);
                    c5362.m8987(objM89911);
                }
                AbstractC3925.m7030((InterfaceC5731) objM89911, c5362, c2243);
                interfaceC2714 = (InterfaceC2714) AbstractC0973.m2043(c1347);
                if (!z6) {
                    f = 0.0f;
                } else if (interfaceC2714 instanceof C3656) {
                    f = c1447.f4951;
                } else if (interfaceC2714 instanceof C0266) {
                    f = c1447.f4953;
                } else if (interfaceC2714 instanceof C3213) {
                    f = c1447.f4950;
                } else {
                    f = c1447.f4952;
                }
                objM89912 = c5362.m8999();
                if (objM89912 == obj) {
                    objM89912 = new C5825(new C4497(f), AbstractC3831.f12711, null, 12);
                    c5362.m8987(objM89912);
                }
                c5825 = (C5825) objM89912;
                C4497 c44910 = new C4497(f);
                boolean zM89711 = c5362.m8977(c5825) | c5362.m8956(f) | ((((i9 & 14) ^ 6) <= 4 && c5362.m9006(z6)) || (i9 & 6) == 4);
                if (((i9 & 896) ^ 384) > 256) {
                }
                zM8977 = zM89711 | z3 | c5362.m8977(interfaceC2714);
                objM89913 = c5362.m8999();
                if (zM8977) {
                    c1449 = c1447;
                    objM89913 = new C1070(c5825, f, z6, c1449, interfaceC2714, null);
                    c5362.m8987(objM89913);
                } else {
                    c1449 = c1447;
                    objM89913 = new C1070(c5825, f, z6, c1449, interfaceC2714, null);
                    c5362.m8987(objM89913);
                }
                AbstractC3925.m7030((InterfaceC5731) objM89913, c5362, c44910);
                c3411 = c5825.f19169;
                c5362.m9009(false);
            }
            if (c3411 != null) {
                f2 = ((C4497) c3411.f11359.getValue()).f14871;
            } else {
                f2 = 0.0f;
            }
            objM89914 = c5362.m8999();
            if (objM89914 == obj) {
                objM89914 = new C0086(13);
                c5362.m8987(objM89914);
            }
            InterfaceC1291 interfaceC1298 = interfaceC1292;
            long j10 = j2;
            InterfaceC2864 interfaceC28610 = interfaceC2866;
            AbstractC0701.m1559(interfaceC4448, AbstractC1697.m3510(interfaceC0705, false, (InterfaceC4745) objM89914), z6, interfaceC28610, j9, j10, 0.0f, f2, c2243, AbstractC3925.m7034(-535639973, new C1874(j10, interfaceC1298, interfaceC2609, 0), c5362), c5362, (i8 & 8078) | (234881024 & (i8 << 6)), 64);
            z5 = z6;
            interfaceC2865 = interfaceC28610;
            interfaceC1293 = interfaceC1298;
            c1448 = c1449;
            c4699 = c46911;
        } else {
            c5362.m8982();
            interfaceC1293 = interfaceC1291;
            z5 = z2;
            interfaceC2865 = interfaceC2864M546;
            c4699 = c4698;
            c1448 = c1447;
        }
        c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥۤۛ٘
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC3933.m7084(interfaceC4448, interfaceC0705, z5, interfaceC2865, c4699, c1448, interfaceC1293, interfaceC2609, (C5362) obj2, AbstractC3831.m6835(i | 1), i2);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final InterfaceC0705 m7085(InterfaceC0705 interfaceC0705, InterfaceC3096 interfaceC3096, EnumC1616 enumC1616, C2851 c2851, boolean z, InterfaceC0738 interfaceC0738, C2243 c2243, C1713 c1713) {
        EnumC1616 enumC1617 = EnumC1616.f5425;
        C4217 c4217 = C4217.f13994;
        return interfaceC0705.mo1571(enumC1616 == enumC1617 ? AbstractC5537.m9269(c4217, C0809.f2879) : AbstractC5537.m9269(c4217, C0809.f2880)).mo1571(new C4721(c2851, c1713, interfaceC0738, c2243, enumC1616, interfaceC3096, z, false));
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static double m7086(double d) {
        double d2 = d / 100.0d;
        return (d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final AbstractC5381 m7087(InterfaceC3975 interfaceC3975, int i) {
        AbstractC5381 abstractC5381 = ((AbstractC5381) interfaceC3975).f17791.f17783;
        if (abstractC5381 == null || (abstractC5381.f17782 & i) == 0) {
            return null;
        }
        while (abstractC5381 != null) {
            int i2 = abstractC5381.f17781;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return abstractC5381;
            }
            abstractC5381 = abstractC5381.f17783;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static boolean m7088(double d, double d2, double d3) {
        return ((d2 - d) + 25.132741228718345d) % 6.283185307179586d < ((d3 - d) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final int m7089(int i, C0863 c0863) {
        int i2 = c0863.f3180 - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = c0863.f3182;
            int i5 = ((C4014) objArr[i4]).f13382;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((C4014) objArr[i3]).f13382) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final void m7090(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC4690.m8035("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + ']');
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final long m7091(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final Bundle m7092(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        C1078.m2272(AbstractC3761.m6629("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final void m7093(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC4690.m8035("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + ']');
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final long m7094() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static InterfaceC5130 m7095(int i, InterfaceC4448 interfaceC4448) {
        C1397 c1397 = C1397.f4779;
        int iM6632 = AbstractC3761.m6632(i);
        if (iM6632 == 0) {
            return new C2432(interfaceC4448);
        }
        if (iM6632 == 1) {
            C5201 c5201 = new C5201();
            c5201.f17196 = interfaceC4448;
            c5201.f17195 = c1397;
            return c5201;
        }
        if (iM6632 != 2) {
            C1078.m2275();
            return null;
        }
        C1547 c1547 = new C1547();
        c1547.f5234 = interfaceC4448;
        c1547.f5233 = c1397;
        return c1547;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static final void m7096(final InterfaceC4448 interfaceC4448, InterfaceC0705 interfaceC0705, boolean z, InterfaceC2864 interfaceC2864, C4697 c4697, InterfaceC1291 interfaceC1291, final InterfaceC2609 interfaceC2609, C5362 c5362, final int i, final int i2) {
        InterfaceC4448 interfaceC4449;
        int i3;
        final InterfaceC0705 interfaceC0706;
        int i4;
        final boolean z2;
        final InterfaceC2864 interfaceC2865;
        final C4697 c4698;
        final InterfaceC1291 interfaceC1292;
        InterfaceC2864 interfaceC2864M546;
        int i5;
        InterfaceC0705 interfaceC0707;
        boolean z3;
        InterfaceC1291 interfaceC1293;
        C4697 c4699;
        c5362.m8979(-1061374109);
        if ((i & 6) == 0) {
            interfaceC4449 = interfaceC4448;
            i3 = i | (c5362.m8977(interfaceC4449) ? 4 : 2);
        } else {
            interfaceC4449 = interfaceC4448;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
            interfaceC0706 = interfaceC0705;
        } else {
            interfaceC0706 = interfaceC0705;
            i4 = i3 | (c5362.m8963(interfaceC0706) ? 32 : 16);
        }
        int i7 = i4 | 115025280;
        if (c5362.m9011(i7 & 1, (306783379 & i7) != 306783378)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                InterfaceC0705 interfaceC0708 = i6 != 0 ? C4217.f13994 : interfaceC0706;
                C1393 c1393 = AbstractC3017.f10163;
                interfaceC2864M546 = AbstractC0265.m546(7, c5362);
                C2917 c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                C4697 c46910 = c2917.f9781;
                if (c46910 == null) {
                    long j = C1327.f4592;
                    C4697 c46911 = new C4697(j, AbstractC0118.m212(c2917, 26), j, C1327.m2826(AbstractC0118.m212(c2917, 19), 0.38f, 14));
                    c2917.f9781 = c46911;
                    c46910 = c46911;
                }
                i5 = i7 & (-64513);
                interfaceC0707 = interfaceC0708;
                z3 = true;
                interfaceC1293 = AbstractC3017.f10162;
                c4699 = c46910;
            } else {
                c5362.m8982();
                z3 = z;
                c4699 = c4697;
                interfaceC1293 = interfaceC1291;
                i5 = i7 & (-64513);
                interfaceC0707 = interfaceC0706;
                interfaceC2864M546 = interfaceC2864;
            }
            c5362.m8964();
            m7084(interfaceC4449, interfaceC0707, z3, interfaceC2864M546, c4699, null, interfaceC1293, interfaceC2609, c5362, i5 & 2147483646, 0);
            interfaceC2865 = interfaceC2864M546;
            interfaceC1292 = interfaceC1293;
            interfaceC0706 = interfaceC0707;
            c4698 = c4699;
            z2 = z3;
        } else {
            c5362.m8982();
            z2 = z;
            interfaceC2865 = interfaceC2864;
            c4698 = c4697;
            interfaceC1292 = interfaceC1291;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731() { // from class: ۥّ٘ؖٞ
                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC3933.m7096(interfaceC4448, interfaceC0706, z2, interfaceC2865, c4698, interfaceC1292, interfaceC2609, (C5362) obj, AbstractC3831.m6835(i | 1), i2);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static void m7097(C0126 c0126, List list, C1946 c1946) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iM231 = c0126.m231((C4356) list.get(i));
            int iM229 = c0126.m229(c0126.f490, c0126.m236(iM231));
            Object obj = iM229 < c0126.m235(c0126.f490, c0126.m236(iM231 + 1)) ? c0126.f482[c0126.m265(iM229)] : C2850.f9517;
            C5863 c5863 = obj instanceof C5863 ? (C5863) obj : null;
            if (c5863 != null) {
                c5863.f19364 = c1946;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final void m7098(String str, InterfaceC0705 interfaceC0705, long j, int i, C3564 c3564, int i2, boolean z, long j2, long j3, long j4, boolean z2, C5362 c5362, int i3) {
        int i4;
        long j5;
        boolean z3;
        long j6;
        long j7;
        int i5;
        boolean z4;
        boolean z5;
        C3564 c3565;
        long j8;
        boolean z6;
        int i6;
        int i7;
        long j9;
        long j10;
        long j11;
        boolean z7;
        c5362.m8979(-1184734894);
        int i8 = i3 | (c5362.m8963(str) ? 4 : 2) | (c5362.m8963(interfaceC0705) ? 32 : 16) | (c5362.m8961(j) ? 256 : 128) | 115043328 | (c5362.m8963(c3564) ? 536870912 : 268435456);
        if ((1533916891 & i8) == 306783378 && c5362.m8953()) {
            c5362.m8982();
            i6 = i;
            i7 = i2;
            z6 = z;
            j9 = j2;
            j10 = j3;
            j11 = j4;
            z7 = z2;
        } else {
            c5362.m8971();
            if ((i3 & 1) == 0 || c5362.m8969()) {
                long j12 = C1327.f4586;
                long j13 = C1327.f4591;
                i4 = Integer.MAX_VALUE;
                j5 = C1327.f4592;
                z3 = true;
                j6 = j13;
                j7 = j12;
                i5 = 7;
                z4 = true;
            } else {
                c5362.m8982();
                i4 = i;
                i5 = i2;
                z4 = z;
                j7 = j2;
                j6 = j3;
                j5 = j4;
                z3 = z2;
            }
            c5362.m8964();
            long j14 = ((C1327) c5362.m8997(AbstractC0194.f721)).f4595;
            Context context = (Context) c5362.m8997(AbstractC4354.f14355);
            int i9 = i4;
            c5362.m8989(-140492789, 0, null, null);
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                C2808 c2808 = new C2808(context);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                if (Build.VERSION.SDK_INT >= 28) {
                    arrayList5.add(new C1957());
                } else {
                    arrayList5.add(new C3716());
                }
                C1199 c1199 = new C1199((Context) c2808.f9378, (C3294) c2808.f9376, new C2432(new C4104(c2808, 0)), new C2432(new C4104(c2808, 1)), new C2432(C3709.f12356), new C0117(AbstractC2133.m4159(arrayList), AbstractC2133.m4159(arrayList2), AbstractC2133.m4159(arrayList3), AbstractC2133.m4159(arrayList4), AbstractC2133.m4159(arrayList5)), (C4036) c2808.f9377);
                ArrayList arrayList6 = new ArrayList(3);
                TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                z5 = z4;
                arrayList6.add(new C1783(AbstractC4225.m7470(j7), AbstractC4225.m7470(j6), z3));
                arrayList6.add(new C5777());
                arrayList6.add(new C2922(new C4228(29, context), c1199));
                arrayList6.add(new C5438(1));
                float f = context.getResources().getDisplayMetrics().density;
                C2268 c2268 = new C2268(3, (byte) 0);
                c2268.f7526 = -1;
                c2268.f7527 = (int) ((4 * f) + 0.5f);
                c2268.f7526 = (int) ((1 * f) + 0.5f);
                arrayList6.add(new C1707(new C2268(c2268)));
                arrayList6.add(new C4768(i5));
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.textColorLink});
                int i10 = 0;
                try {
                    int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.colorBackground});
                    try {
                        int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
                        typedArrayObtainStyledAttributes2.recycle();
                        arrayList6.add(new C1707(new C1571(color, color, color2)));
                        if (z5) {
                            arrayList6.add(new C5438(i10));
                        }
                        arrayList6.add(new C5438(2));
                        c3565 = c3564;
                        arrayList6.add(new C1530(j5, c3565));
                        if (arrayList6.isEmpty()) {
                            C1078.m2276("No plugins were added to this builder. Use #usePlugin method to add them");
                            return;
                        }
                        C2808 c2809 = new C2808(arrayList6);
                        Iterator it = arrayList6.iterator();
                        while (it.hasNext()) {
                            c2809.m5337((AbstractC0097) it.next());
                        }
                        ArrayList arrayList7 = (ArrayList) c2809.f9376;
                        C1489 c1489 = new C1489(11);
                        float f2 = context.getResources().getDisplayMetrics().density;
                        C5728 c5728 = new C5728();
                        c5728.f18876 = true;
                        c5728.f18879 = -1;
                        c5728.f18880 = -1;
                        c5728.f18875 = (int) ((8 * f2) + 0.5f);
                        c5728.f18874 = (int) ((24 * f2) + 0.5f);
                        c5728.f18871 = (int) ((4 * f2) + 0.5f);
                        c5728.f18877 = (int) ((1 * f2) + 0.5f);
                        c5728.f18879 = (int) ((1 * f2) + 0.5f);
                        c5728.f18880 = (int) ((4 * f2) + 0.5f);
                        C3571 c3571 = new C3571();
                        C5008 c5008 = new C5008(1);
                        C5008 c5009 = new C5008(0);
                        Iterator it2 = arrayList7.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = it2;
                            AbstractC0097 abstractC0097 = (AbstractC0097) it2.next();
                            abstractC0097.mo3530(c1489);
                            abstractC0097.mo3267(c5728);
                            abstractC0097.mo3264(c3571);
                            abstractC0097.mo3529(c5008);
                            abstractC0097.mo3528(c5009);
                            it2 = it3;
                        }
                        C5728 c5729 = new C5728();
                        c5729.f18876 = c5728.f18876;
                        c5729.f18874 = c5728.f18874;
                        c5729.f18871 = c5728.f18871;
                        c5729.f18877 = c5728.f18877;
                        c5729.f18872 = c5728.f18872;
                        c5729.f18873 = c5728.f18873;
                        c5729.f18881 = c5728.f18881;
                        c5729.f18875 = c5728.f18875;
                        c5729.f18879 = c5728.f18879;
                        c5729.f18878 = c5728.f18878;
                        c5729.f18880 = c5728.f18880;
                        C3121 c3121 = new C3121(5, Collections.unmodifiableMap(c5009.f16580));
                        c3571.f11831 = c5729;
                        c3571.f11829 = c3121;
                        if (((AbstractC1605) c3571.f11830) == null) {
                            c3571.f11830 = new C4581();
                        }
                        if (((C4369) c3571.f11826) == null) {
                            c3571.f11826 = new C4369(0);
                        }
                        if (((C4992) c3571.f11827) == null) {
                            c3571.f11827 = new C4992(16);
                        }
                        if (((C4992) c3571.f11825) == null) {
                            c3571.f11825 = new C4992(13);
                        }
                        if (((C4992) c3571.f11828) == null) {
                            c3571.f11828 = new C4992(14);
                        }
                        objM8999 = new C5433(new C1489(c1489), new C3369(9, c5008, new C2711(c3571)), Collections.unmodifiableList(arrayList7));
                        c5362.m8987(objM8999);
                    } catch (Throwable th) {
                        typedArrayObtainStyledAttributes2.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            } else {
                z5 = z4;
                c3565 = c3564;
            }
            C5433 c5433 = (C5433) objM8999;
            c5362.m9009(false);
            c5362.m8989(-140492284, 0, null, null);
            c5362.m9009(false);
            c5362.m8989(-140492068, 0, null, null);
            boolean zM8961 = ((i8 & 896) == 256) | ((((1879048192 & i8) ^ 805306368) > 536870912 && c5362.m8963(c3565)) || (i8 & 805306368) == 536870912) | c5362.m8961(j14);
            Object objM89910 = c5362.m8999();
            if (zM8961 || objM89910 == c4036) {
                objM89910 = new C1509(j, c3565, j14, i9);
                j8 = j14;
                c5362.m8987(objM89910);
            } else {
                j8 = j14;
            }
            c5362.m9009(false);
            AbstractC4489.m7795((InterfaceC4745) objM89910, interfaceC0705, new C4151(c5433, str, i9, c3564, j8), c5362, 0);
            z6 = z5;
            i6 = i9;
            i7 = i5;
            j9 = j7;
            j10 = j6;
            j11 = j5;
            z7 = z3;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C1467(str, interfaceC0705, j, i6, c3564, i7, z6, j9, j10, j11, z7, i3);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static void m7099(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final C3263 m7100(C2316 c2316, C1249 c1249) {
        c2316.getClass();
        int length = c1249.f4307.length();
        int length2 = c1249.f4307.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            m7090(i, length2, i);
        }
        m7090(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            m7093(i2, length, i2);
        }
        m7093(length2, length, length2);
        return new C3263(c1249, new C2268(c1249.f4307.length(), c1249.f4307.length(), 5));
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static double m7101(double d) {
        int i;
        double dPow = Math.pow(Math.abs(d), 0.42d);
        if (d < 0.0d) {
            i = -1;
        } else {
            i = d == 0.0d ? 0 : 1;
        }
        return ((((double) i) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m7102(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            C1078.m2272(AbstractC5078.m8679("fromIndex: ", i, i2, " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }
}
