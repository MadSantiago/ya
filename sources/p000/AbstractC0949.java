package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Process;
import android.os.UserManager;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EdgeEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: renamed from: ۥٍؙؓٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0949 {

    /* JADX INFO: renamed from: ۥٖ */
    public static Thread f3366 = null;

    /* JADX INFO: renamed from: ۥۗ */
    public static volatile boolean f3367 = false;

    /* JADX INFO: renamed from: ۥۣ */
    public static UserManager f3369;

    /* JADX INFO: renamed from: ۦٗ */
    public static volatile Handler f3374;

    /* JADX INFO: renamed from: ۥؗ */
    public static final C0857 f3360 = new C0857(1281109799, new C2463(2), false);

    /* JADX INFO: renamed from: ۦؑ */
    public static final C0857 f3370 = new C0857(1078976336, new C2463(9), false);

    /* JADX INFO: renamed from: ۥُ */
    public static final C0857 f3362 = new C0857(842358511, new C2463(10), false);

    /* JADX INFO: renamed from: ۥّ */
    public static final C0857 f3363 = new C0857(605740686, new C2463(11), false);

    /* JADX INFO: renamed from: ۦۙ */
    public static final C0857 f3377 = new C0857(369122861, new C2463(12), false);

    /* JADX INFO: renamed from: ۥۜ */
    public static final C0857 f3368 = new C0857(132505036, new C2463(13), false);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C0857 f3375 = new C0857(-1159676594, new C2463(14), false);

    /* JADX INFO: renamed from: ۦِ */
    public static final C0857 f3373 = new C0857(918293125, new C2463(3), false);

    /* JADX INFO: renamed from: ۦۗ */
    public static final C0857 f3376 = new C0857(1684540472, new C2463(4), false);

    /* JADX INFO: renamed from: ۦؚ */
    public static final C0857 f3371 = new C0857(1453647791, new C2463(5), false);

    /* JADX INFO: renamed from: ۦٌ */
    public static final C0857 f3372 = new C0857(1726383262, new C2463(6), false);

    /* JADX INFO: renamed from: ۦۚ */
    public static final C0857 f3378 = new C0857(783572919, new C2463(7), false);

    /* JADX INFO: renamed from: ۦۨ */
    public static final C0857 f3380 = new C0857(-1214732370, new C2463(8), false);

    /* JADX INFO: renamed from: ۦ۟ */
    public static final Object f3379 = new Object();

    /* JADX INFO: renamed from: ۥْ */
    public static final C1797 f3364 = new C1797(16);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C0776 f3365 = new C0776(2);

    /* JADX INFO: renamed from: ۥَ */
    public static final Object f3361 = new Object();

    /* JADX INFO: renamed from: ۥؓ */
    public static final InterfaceC0705 m1922(InterfaceC0705 interfaceC0705, String str) {
        return interfaceC0705.mo1571(new C3350(str));
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static final C5706 m1923(String str) {
        int i;
        AbstractC2133.m4156(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new C5706(i2);
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static C0156 m1924(InterfaceC5731 interfaceC5731) {
        C0156 c0156 = new C0156();
        c0156.f594 = AbstractC2776.m5246(c0156, c0156, interfaceC5731);
        return c0156;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m1925(final int i, final int i2, final boolean z, InterfaceC1291 interfaceC1291, final InterfaceC4745 interfaceC4745, C5362 c5362, final int i3) {
        final InterfaceC1291 interfaceC1292;
        InterfaceC1291 interfaceC1291M9388;
        int i4;
        C5362 c5363;
        C5362 c5364 = c5362;
        c5364.m8979(-304899963);
        new C4441(new long[]{-3531756065032409175L, 1225180551685544854L, 5388321598486494743L, 3899426785371539554L, 242223244344924868L, 7245880012347099206L, -2955426958134415314L, 6613841526087927867L, -5013636592333532788L, -1051780738775087874L, 1629152783103803985L, -6954832896836788148L, -8261564051462692932L, 8949991399761917875L, -3089539550901200935L, 4771862503283249687L, 9199730206304640734L}).toString();
        int i5 = i3 | (c5364.m8988(i) ? 4 : 2) | (c5364.m8988(i2) ? 32 : 16) | (c5364.m9006(z) ? 256 : 128) | 1024 | (c5364.m8977(interfaceC4745) ? 16384 : 8192);
        if (c5364.m9011(i5 & 1, (i5 & 9363) != 9362)) {
            c5364.m8971();
            if ((i3 & 1) == 0 || c5364.m8969()) {
                interfaceC1291M9388 = AbstractC5568.m9388(5.0f, 15.0f, 0.0f, 8);
                i4 = i5 & (-7169);
            } else {
                c5364.m8982();
                i4 = i5 & (-7169);
                interfaceC1291M9388 = interfaceC1291;
            }
            c5364.m8964();
            new C4441(new long[]{702234578250703486L, -4212738479722316641L, 7527462349593458327L, 8981123028662560299L, -3485738834152552368L, 8182490523953335070L}).toString();
            Object objM8999 = c5364.m8999();
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                objM8999 = AbstractC2774.m5183(Boolean.valueOf(z));
                c5364.m8987(objM8999);
            }
            InterfaceC4367 interfaceC4367 = (InterfaceC4367) objM8999;
            C4274 c4274 = C1298.f4423;
            InterfaceC0705 interfaceC0705M9382 = AbstractC5568.m9382(AbstractC5537.m9269(AbstractC5568.m9378(AbstractC4410.f14521, interfaceC1291M9388), AbstractC0520.m1170(20.0f)), AbstractC2133.m4122(c5364) ? AbstractC3951.f13219 : AbstractC3951.f13216, AbstractC2552.f8518);
            boolean zBooleanValue = ((Boolean) interfaceC4367.getValue()).booleanValue();
            new C4441(new long[]{-1750178233982817015L, 2254737198285672698L, 5083222181271628771L, 9107098957535269542L, -8437891954678536069L, 2758249000491546284L}).toString();
            boolean z2 = (i4 & 57344) == 16384;
            Object objM89910 = c5362.m8999();
            int i6 = 5;
            if (z2 || objM89910 == c4036) {
                objM89910 = new C1708(i6, interfaceC4745, interfaceC4367);
                c5363 = c5362;
                c5363.m8987(objM89910);
            } else {
                c5363 = c5362;
            }
            InterfaceC0705 interfaceC0705M9376 = AbstractC5568.m9376(AbstractC5537.m9215(interfaceC0705M9382, zBooleanValue, null, (InterfaceC4745) objM89910, 14), 15.0f);
            new C4441(new long[]{4857111542360436991L, -9001627580684773560L, 6298635345258169089L, -4284692506749619634L, -2550285401569497543L, -2737520097168647715L, 4222942259336291342L, -5261804373334652473L, 6416536684680550179L, 3753894113529716249L, 366179550311513027L, -658311395119121726L, 3479809191588633291L, -3191375271390090396L}).toString();
            C3668 c3668M6047 = AbstractC3287.m6047(AbstractC4225.f14014, c4274, c5363, 48);
            new C4441(new long[]{-2640291157303293686L, -7360511997963524568L, 219432248940070108L, 7022347508957494184L, 3942685909260397376L, -7240715611463111049L, 553423584264639718L, -4214392199806109952L, -5660942356018055807L, -4038477864832145546L, -472270349403041322L, 4873093157304459527L}).toString();
            int iHashCode = Long.hashCode(c5363.f17657);
            C2103 c2103M8994 = c5363.m8994();
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5363, interfaceC0705M9376);
            InterfaceC4576.f15106.getClass();
            C3709 c3709 = C0849.f3049;
            new C4441(new long[]{2978582710287890121L, 2230942433020462020L, 206393857475183361L, 1005291460554612472L, 8899935288061318471L, -2641914748536010171L, 4155464686474616696L, -4566087185806629325L, 5140737402604278264L, -1287489423148721758L, -3871270602458803786L, -7973093120859050245L}).toString();
            c5363.m8983();
            if (c5363.f17668) {
                c5363.m9005(c3709);
            } else {
                c5363.m8972();
            }
            C3136 c3136 = C0849.f3048;
            AbstractC0993.m2127(c3136, c5363, c3668M6047);
            C3136 c3137 = C0849.f3047;
            AbstractC0993.m2127(c3137, c5363, c2103M8994);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C3136 c3138 = C0849.f3053;
            AbstractC0993.m2127(c3138, c5363, numValueOf);
            C1931 c1931 = C0849.f3050;
            AbstractC0993.m2146(c5363, c1931);
            C3136 c3139 = C0849.f3052;
            AbstractC0993.m2127(c3139, c5363, interfaceC0705M2161);
            new C4441(new long[]{1646455061593795190L, -4540987748754934980L, 1049062615357842450L, -9118007580349094569L, -4133088024726294158L}).toString();
            new C4441(new long[]{6550735659984245046L, -8405384715506352043L, 2307204954601857983L, -597882470865260786L, -6317836742403056299L, 3683133973828838676L, 5654408718192418296L}).toString();
            C4570 c4570 = new C4570(1.0f, true);
            new C4441(new long[]{-4602558456035046065L, 7422611699285896999L, 1907273472012216854L, -8589438250379894442L, -7393484540176107989L, -9194408961071909151L, 1148520881344518089L, 8337793448451029854L, 5548771745708631184L, -3158071828037137213L, -7989926813343592368L, 2367720884356931098L, 3980154849719484724L, 8110288820426347954L, 7965142234485218477L}).toString();
            C3113 c3113M9197 = AbstractC5501.m9197(AbstractC4225.f14009, C1298.f4443, c5363, 0);
            InterfaceC1291 interfaceC1293 = interfaceC1291M9388;
            new C4441(new long[]{-3790057609878343998L, 6725821206595191764L, -1661432256255947335L, 1219170724693639564L, 6337436168042281561L, 9061945232206084262L, -223092366514317179L, 1418562462773986404L, -8375301526829965308L, 5388253584519366828L, 3182250681899354348L, -7405020606580499879L}).toString();
            int iHashCode2 = Long.hashCode(c5363.f17657);
            C2103 c2103M8995 = c5363.m8994();
            InterfaceC0705 interfaceC0705M2162 = AbstractC0993.m2161(c5363, c4570);
            new C4441(new long[]{-7455965104623624449L, 4930106573990125989L, 1099840458421953108L, -3038111091757439368L, 413006571079362822L, 2551900818779404933L, 7250539830833084152L, 6260327183624181954L, 146916719958206303L, 2496276269519792807L, -7755714245498836781L, -1334797139356307670L}).toString();
            c5363.m8983();
            if (c5363.f17668) {
                c5363.m9005(c3709);
            } else {
                c5363.m8972();
            }
            AbstractC0993.m2127(c3136, c5363, c3113M9197);
            AbstractC0993.m2127(c3137, c5363, c2103M8995);
            AbstractC0993.m2127(c3138, c5363, Integer.valueOf(iHashCode2));
            AbstractC0993.m2146(c5363, c1931);
            AbstractC0993.m2127(c3139, c5363, interfaceC0705M2162);
            new C4441(new long[]{4040990687390991845L, -8840107163848702825L, -4194059006167518155L, -7627449823953960145L, 5064491178440033173L}).toString();
            new C4441(new long[]{6520527521945822485L, 1887796866771578906L, 5518085212732796432L, 6031858430250567826L, -5645527578016859435L, -6058980913746869236L, 5599494685752845992L, 3440435941292246821L, 380121675735867526L, -7301860339773044299L, 3182411195068500600L, -6832870955770394574L, 8596640448698404633L, -3057909452813159883L}).toString();
            String strM5804 = C3133.m5804(i, c5363);
            C1626 c1626 = C1626.f5441;
            C4216 c4216 = AbstractC4957.f16399;
            C5362 c5365 = c5363;
            AbstractC0495.m1105(strM5804, null, 0L, 0L, c1626, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5363.m8997(c4216)).f14550, c5365, 1572864, 0, 131006);
            C4217 c4217 = C4217.f13994;
            AbstractC1434.m3048(c5365, AbstractC4410.m7703(c4217, 2.0f));
            AbstractC0495.m1105(C3133.m5804(i2, c5365), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((C4413) c5365.m8997(c4216)).f14550, c5362, 0, 0, 131070);
            c5362.m9009(true);
            c5364 = c5362;
            AbstractC3925.m7055(((Boolean) interfaceC4367.getValue()).booleanValue(), AbstractC5568.m9381(c4217, 10.0f, 0.0f, 0.0f, 0.0f, 14), false, null, c5364, 432);
            c5364.m9009(true);
            interfaceC1292 = interfaceC1293;
        } else {
            c5364.m8982();
            interfaceC1292 = interfaceC1291;
        }
        C5863 c5863M8965 = c5364.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(i, i2, z, interfaceC1292, interfaceC4745, i3) { // from class: ۦٍؓؓۨ

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ InterfaceC4745 f10643;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ boolean f10644;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ InterfaceC1291 f10645;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ int f10646;

                /* JADX INFO: renamed from: ۦۨ */
                public final /* synthetic */ int f10647;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(1);
                    AbstractC0949.m1925(this.f10647, this.f10646, this.f10644, this.f10645, this.f10643, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥً */
    public static final C3102 m1926(C5362 c5362) {
        C5362 c5363;
        c5362.m8978(206, AbstractC5508.f18187);
        if (c5362.f17668) {
            C0126.m226(c5362.f17665);
        }
        Object objM9001 = c5362.m9001();
        C1670 c5656 = objM9001 instanceof C1670 ? (C1670) objM9001 : null;
        if (c5656 == null) {
            c5363 = c5362;
            c5656 = new C5656(new C2682(new C3102(c5363, c5362.f17657, c5362.f17650, c5362.f17646, c5362.f17661.f6428)), -1);
            c5363.m9003(c5656);
        } else {
            c5363 = c5362;
        }
        C3102 c3102 = ((C2682) c5656.f5567).f8900;
        c3102.f10396.setValue(c5363.m8994());
        c5363.m9009(false);
        return c3102;
    }

    /* JADX INFO: renamed from: ۥَ */
    public static void m1927(InterfaceC2442 interfaceC2442, AbstractC3925 abstractC3925, long j) {
        if (abstractC3925 instanceof C2490) {
            C2793 c2793 = ((C2490) abstractC3925).f8283;
            interfaceC2442.mo3902(j, (((long) Float.floatToRawIntBits(c2793.f9343)) << 32) | (((long) Float.floatToRawIntBits(c2793.f9342)) & 4294967295L), (((long) Float.floatToRawIntBits(c2793.f9341 - c2793.f9343)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(c2793.f9344 - c2793.f9342))), 1.0f, 3);
            return;
        }
        boolean z = abstractC3925 instanceof C4996;
        C1548 c1548 = C1548.f5235;
        if (!z) {
            if (abstractC3925 instanceof C0889) {
                interfaceC2442.mo3904(((C0889) abstractC3925).f3231, j, c1548);
                return;
            } else {
                C1078.m2275();
                return;
            }
        }
        C4996 c4996 = (C4996) abstractC3925;
        C0935 c0935 = c4996.f16535;
        if (c0935 != null) {
            interfaceC2442.mo3904(c0935, j, c1548);
            return;
        }
        C5293 c5293 = c4996.f16536;
        float f = c5293.f17433;
        float f2 = c5293.f17435;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c5293.f17434 >> 32));
        interfaceC2442.mo3905(j, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(c5293.f17430 - f2)) << 32) | (((long) Float.floatToRawIntBits(c5293.f17436 - f)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), c1548);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final Bitmap m1928(C1955 c1955) {
        if (c1955 instanceof C1955) {
            return c1955.f6452;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* JADX INFO: renamed from: ۥّ */
    public static String m1929(int i, int i2, String str) {
        if (i < 0) {
            return C5063.m8650("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return C5063.m8650("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final boolean m1930(C2793 c2793, float f, float f2) {
        float f3 = c2793.f9343;
        if (f > c2793.f9341 || f3 > f) {
            return false;
        }
        return f2 <= c2793.f9344 && c2793.f9342 <= f2;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final C1226 m1931(Context context) {
        C0373 c0373 = new C0373(25);
        context.getApplicationContext();
        return new C1226(c0373, new C4662(Build.VERSION.SDK_INT >= 31 ? C0525.f1862.m1172(context) : 0));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0078 A[RETURN] */
    /* JADX INFO: renamed from: ۥٕ */
    public static int m1932(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\n' || cCharAt == '<') {
                    break;
                }
                if (cCharAt == '>') {
                    return i + 1;
                }
                if (cCharAt == '\\') {
                    int i2 = i + 1;
                    if (AbstractC4554.m7918(i2, charSequence)) {
                        i = i2;
                    }
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 == 0 || cCharAt2 == ' ') {
                if (i4 != i) {
                    return i4;
                }
                return -1;
            }
            if (cCharAt2 == '\\') {
                int i5 = i4 + 1;
                if (AbstractC4554.m7918(i5, charSequence)) {
                    i4 = i5;
                }
            } else if (cCharAt2 == '(') {
                i3++;
                if (i3 > 32) {
                    return -1;
                }
            } else if (cCharAt2 != ')') {
                if (Character.isISOControl(cCharAt2)) {
                    if (i4 != i) {
                        return i4;
                    }
                    return -1;
                }
            } else {
                if (i3 == 0) {
                    return i4;
                }
                i3--;
            }
            i4++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static void m1933() {
        synchronized (f3379) {
            throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static String m1934(Context context, String str) {
        AbstractC0487.m1047(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = AbstractC4009.m7185(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static final int m1935(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static boolean m1936(Thread thread) {
        Thread thread2 = f3366;
        if (thread2 == null) {
            thread2 = Looper.getMainLooper().getThread();
            f3366 = thread2;
        }
        return thread == thread2;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static AbstractC0032 m1937(Context context, Callable callable, Executor executor) {
        C3743 c3743 = new C3743(3, callable);
        if (m1942(context)) {
            RunnableFutureC1595 runnableFutureC1595 = new RunnableFutureC1595();
            runnableFutureC1595.f5353 = new RunnableC3314(runnableFutureC1595, c3743);
            executor.execute(runnableFutureC1595);
            return runnableFutureC1595;
        }
        C1223 c1223 = new C1223();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C4705 c4705 = new C4705(atomicBoolean, context, c1223, c3743, executor);
        context.registerReceiver(c4705, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!m1942(context) || !atomicBoolean.compareAndSet(false, true)) {
            c1223.mo3760(new RunnableC1948(c1223, atomicBoolean, context, c4705, 6, false), EnumC0486.f1767);
            return c1223;
        }
        try {
            context.unregisterReceiver(c4705);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        RunnableFutureC1595 runnableFutureC1596 = new RunnableFutureC1595();
        runnableFutureC1596.f5353 = new RunnableC3314(runnableFutureC1596, c3743);
        executor.execute(runnableFutureC1596);
        c1223.m3766(runnableFutureC1596);
        return c1223;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final float m1938(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = AbstractC4204.f13963;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? AbstractC3495.f11597[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m1939(int i, int i2, final C1542 c1542, C5362 c5362, final int i3) {
        final int i4;
        final int i5;
        C5362 c5363;
        c5362.m8979(-144036742);
        new C4441(new long[]{9138659609144926348L, 4022451011147659104L, -4839851615908471243L, 1803843131189440598L, -733194815288880845L, -3768121875487912107L, 8047452074306753014L, 3384145719678563980L, -597287652333303249L, -1233763166109050689L, 8582920329623732834L, -1806474892238090357L}).toString();
        int i6 = 16;
        int i7 = (c5362.m8988(i) ? 4 : 2) | i3 | (c5362.m8988(i2) ? 32 : 16) | (c5362.m8977(c1542) ? 256 : 128);
        if (c5362.m9011(i7 & 1, (i7 & 147) != 146)) {
            App app = App.f407;
            C1443 c1443 = AbstractC2776.m5217().f409;
            Object obj = c1542.f5218;
            String str = c1542.f5219;
            boolean z = C1443.f4940;
            boolean zBooleanValue = ((Boolean) c1443.m3068(obj, str)).booleanValue();
            new C4441(new long[]{7398682844354271524L, -3130174530343494497L, -8115275815899676966L, 6231818288496958662L, -7574315063570674134L, -3754557867837899936L}).toString();
            boolean zM8977 = c5362.m8977(c1542);
            Object objM8999 = c5362.m8999();
            if (zM8977 || objM8999 == C2850.f9517) {
                objM8999 = new C4884(i6, c1542);
                c5362.m8987(objM8999);
            }
            i4 = i;
            i5 = i2;
            c5363 = c5362;
            m1925(i4, i5, zBooleanValue, null, (InterfaceC4745) objM8999, c5363, i7 & 126);
        } else {
            i4 = i;
            i5 = i2;
            c5363 = c5362;
            c5363.m8982();
        }
        C5863 c5863M8965 = c5363.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(i4, i5, c1542, i3) { // from class: ۥُۛٔ

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ C1542 f3764;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ int f3765;

                /* JADX INFO: renamed from: ۦۨ */
                public final /* synthetic */ int f3766;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM6835 = AbstractC3831.m6835(1);
                    AbstractC0949.m1939(this.f3766, this.f3765, this.f3764, (C5362) obj2, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static int m1940(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (AbstractC4554.m7918(i2, charSequence)) {
                        i = i2;
                    }
                    break;
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m1941(boolean z) {
        if (z) {
            return;
        }
        C0178.m393();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004e A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:31:0x004e, B:32:0x0050, B:21:0x0029, B:23:0x002f, B:27:0x003c, B:29:0x004a), top: B:38:0x0009, inners: #0 }] */
    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m1942(Context context) {
        if (f3367) {
            return true;
        }
        synchronized (AbstractC0949.class) {
            try {
                if (f3367) {
                    return true;
                }
                int i = 1;
                while (true) {
                    boolean z = false;
                    if (i <= 2) {
                        UserManager userManager = f3369;
                        if (userManager == null) {
                            userManager = (UserManager) context.getSystemService(UserManager.class);
                            f3369 = userManager;
                        }
                        if (userManager == null) {
                            z = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z = true;
                                }
                            } catch (NullPointerException e) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                f3369 = null;
                                i++;
                            }
                        }
                        if (z) {
                            f3367 = true;
                        }
                        return z;
                    }
                    if (z) {
                        f3369 = null;
                    }
                    if (z) {
                        f3367 = true;
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m1943(InterfaceC0705 interfaceC0705, AbstractC2266 abstractC2266, C0857 c0857, C5362 c5362, int i) {
        int i2;
        C0857 c0858 = AbstractC0993.f3547;
        c5362.m8979(-714464401);
        if ((i & 6) == 0) {
            i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8963(abstractC2266) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c5362.m8977(c0858) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c5362.m8977(c0857) ? 2048 : 1024;
        }
        if (c5362.m9011(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                Object c4852 = new C4852(null, C0373.f1364);
                c5362.m8987(c4852);
                objM8999 = c4852;
            }
            C4817 c4817M1962 = m1962(c0858, c5362, (i2 >> 6) & 14);
            C4773.m8137(abstractC2266.mo4313(c4817M1962), AbstractC3925.m7034(274270255, new C2835(interfaceC0705, (InterfaceC4367) objM8999, c0857, c4817M1962), c5362), c5362, 56);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0021(i, 2, interfaceC0705, abstractC2266, c0857);
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static Handler m1944() {
        if (f3374 == null) {
            synchronized (f3361) {
                try {
                    if (f3374 == null) {
                        f3374 = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3374;
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final void m1945(Spannable spannable, long j, InterfaceC2880 interfaceC2880, int i, int i2) {
        long jM8439 = C5023.m8439(j);
        if (C3970.m7128(jM8439, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC2776.m5235(interfaceC2880.mo744(j)), false), i, i2, 33);
        } else if (C3970.m7128(jM8439, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C5023.m8438(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static void m1946(C5745 c5745, C0441 c0441, C3828 c3828, InterfaceC2015 interfaceC2015, C2829 c2829, boolean z, InterfaceC4120 interfaceC4120) {
        C2793 c2793M6826;
        if (z) {
            int iMo4319 = interfaceC4120.mo4319(C3346.m6108(c5745.f18943));
            String str = AbstractC1287.f4393;
            if (iMo4319 < c3828.f12697.f8430.f4307.length()) {
                c2793M6826 = c3828.m6826(iMo4319);
            } else {
                c2793M6826 = iMo4319 != 0 ? c3828.m6826(iMo4319 - 1) : new C2793(0.0f, 0.0f, 1.0f, (int) (AbstractC1287.m2716(c0441.f1625, c0441.f1628, c0441.f1623, AbstractC1287.f4393, 1) & 4294967295L));
            }
            float f = c2793M6826.f9342;
            float f2 = c2793M6826.f9343;
            long jMo2808 = interfaceC2015.mo2808((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            C2793 c2793M9368 = AbstractC5568.m9368((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo2808 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo2808 >> 32)))) << 32), (((long) Float.floatToRawIntBits(c2793M6826.f9341 - f2)) << 32) | (((long) Float.floatToRawIntBits(c2793M6826.f9344 - f)) & 4294967295L));
            if (AbstractC3831.m6874((C2829) c2829.f9447.f5284.get(), c2829)) {
                c2829.f9446.mo3449(c2793M9368);
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static float m1947(EdgeEffect edgeEffect, float f, float f2, InterfaceC2880 interfaceC2880) {
        float f3 = AbstractC4218.f13997;
        double dMo746 = interfaceC2880.mo746() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) AbstractC4218.f13997) * dMo746;
        float fExp = (float) (Math.exp((AbstractC4218.f13996 / AbstractC4218.f13995) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? AbstractC0797.m1707(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iM5235 = AbstractC2776.m5235(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iM5235);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM5235);
        }
        return f;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static String m1948(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final void m1949(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC4225.m7470(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final void m1950(Spannable spannable, C5668 c5668, int i, int i2) {
        if (c5668 != null) {
            ArrayList arrayList = new ArrayList(AbstractC5573.m9402(c5668, 10));
            Iterator it = c5668.f18646.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0620) it.next()).f2309);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    /* JADX INFO: renamed from: ۦؙ */
    public static int m1951(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (AbstractC4554.m7918(i2, charSequence)) {
                    i = i2;
                } else {
                    if (cCharAt == c) {
                        return i;
                    }
                    if (c == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c) {
                    return i;
                }
                if (c == ')') {
                    continue;
                }
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static void m1952(InterfaceFutureC4378 interfaceFutureC4378, String str, Object obj) {
        if (interfaceFutureC4378 != null) {
            return;
        }
        C0178.m387(C5063.m8650(str, obj));
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static void m1953(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0178.m387(str);
    }

    /* JADX INFO: renamed from: ۦُ */
    public static final Bitmap.Config m1954(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: ۦِ */
    public static void m1955(int i, int i2) {
        String strM8650;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM8650 = C5063.m8650("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                strM8650 = C5063.m8650("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM8650);
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static final Object m1956(InterfaceC1827 interfaceC1827) {
        Object objMo570 = interfaceC1827.mo570();
        C3363 c3363 = objMo570 instanceof C3363 ? (C3363) objMo570 : null;
        if (c3363 != null) {
            return c3363.f11239;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static final C5295 m1957(C5364 c5364) {
        return new C5295(c5364.f17695, c5364.f17694, c5364.f17693, c5364.f17696);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static final int m1958(C5362 c5362) {
        c5362.getClass();
        return Long.hashCode(c5362.f17657);
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static final float m1959(long j, float f, InterfaceC2880 interfaceC2880) {
        float fM8438;
        long jM8439 = C5023.m8439(j);
        if (C3970.m7128(jM8439, 4294967296L)) {
            if (interfaceC2880.mo754() <= 1.05d) {
                return interfaceC2880.mo744(j);
            }
            fM8438 = C5023.m8438(j) / C5023.m8438(interfaceC2880.mo742(f));
        } else {
            if (!C3970.m7128(jM8439, 8589934592L)) {
                return Float.NaN;
            }
            fM8438 = C5023.m8438(j);
        }
        return fM8438 * f;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static void m1960(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        C1078.m2272(C5063.m8650(str, obj));
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static boolean m1961(String str) {
        boolean z = false;
        for (String str2 : AbstractC2776.m5223()) {
            String str3 = str2 + str;
            if (new File(str2, str).exists()) {
                String strConcat = str3.concat(" binary detected!");
                if (AbstractC5537.f18287 > 4) {
                    Log.v("RootBeer", AbstractC5537.m9272().concat(strConcat));
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final C4817 m1962(C0857 c0857, C5362 c5362, int i) {
        int i2 = 4;
        boolean z = (((i & 14) ^ 6) > 4 && c5362.m8963(c0857)) || (i & 6) == 4;
        Object objM8999 = c5362.m8999();
        Object obj = C2850.f9517;
        if (z || objM8999 == obj) {
            objM8999 = new C4817(c0857);
            c5362.m8987(objM8999);
        }
        C4817 c4817 = (C4817) objM8999;
        boolean zM8963 = c5362.m8963(c4817);
        Object objM89910 = c5362.m8999();
        if (zM8963 || objM89910 == obj) {
            objM89910 = new C0091(i2, c4817);
            c5362.m8987(objM89910);
        }
        AbstractC3925.m7028(c4817, (InterfaceC4745) objM89910, c5362);
        return c4817;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static void m1963(int i, int i2) {
        if (i < 0 || i > i2) {
            C1078.m2279(m1929(i, i2, "index"));
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final float m1964(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = AbstractC4204.f13963;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : AbstractC3495.f11597[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final C4462 m1965(String str) {
        AbstractC2133.m4156(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return new C4462(j);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static void m1966(String str, boolean z) {
        if (z) {
            return;
        }
        C1078.m2276(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۦۣ */
    public static final Object m1967(InterfaceC3534 interfaceC3534, Object obj, Object obj2, InterfaceC5731 interfaceC5731, InterfaceC0443 interfaceC0443) throws Throwable {
        C2151 c2151;
        Object objM5152;
        Object objMo219;
        if (interfaceC0443 instanceof C2151) {
            c2151 = (C2151) interfaceC0443;
            int i = c2151.f7066;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2151.f7066 = i - Integer.MIN_VALUE;
            } else {
                c2151 = new C2151(interfaceC0443);
            }
        } else {
            c2151 = new C2151(interfaceC0443);
        }
        Object obj3 = c2151.f7065;
        int i2 = c2151.f7066;
        if (i2 != 0) {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = c2151.f7064;
            InterfaceC3534 interfaceC3535 = c2151.f7062;
            try {
                AbstractC0186.m409(obj3);
                objM5152 = obj4;
                interfaceC3534 = interfaceC3535;
                AbstractC2765.m5121(interfaceC3534, objM5152);
                return obj3;
            } catch (Throwable th) {
                objM5152 = obj4;
                interfaceC3534 = interfaceC3535;
                th = th;
                AbstractC2765.m5121(interfaceC3534, objM5152);
                throw th;
            }
        }
        AbstractC0186.m409(obj3);
        objM5152 = AbstractC2765.m5152(interfaceC3534, obj2);
        try {
            c2151.f7063 = obj;
            c2151.f7062 = interfaceC3534;
            c2151.f7064 = objM5152;
            c2151.f7066 = 1;
            C5110 c5110 = new C5110(c2151, interfaceC3534);
            if (interfaceC5731 == null) {
                InterfaceC3534 interfaceC3534Mo334 = c5110.mo334();
                Object c2967 = interfaceC3534Mo334 == C4794.f15814 ? new C2967(c5110) : new C1315(c5110, interfaceC3534Mo334);
                AbstractC3801.m6782(2, interfaceC5731);
                objMo219 = interfaceC5731.mo219(obj, c2967);
            } else {
                AbstractC3801.m6782(2, interfaceC5731);
                objMo219 = interfaceC5731.mo219(obj, c5110);
            }
            obj3 = objMo219;
            Object obj5 = EnumC2282.f7590;
            if (obj3 == obj5) {
                return obj5;
            }
            AbstractC2765.m5121(interfaceC3534, objM5152);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            AbstractC2765.m5121(interfaceC3534, objM5152);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static void m1968(int i, int i2, int i3) {
        String strM1929;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM1929 = m1929(i, i3, "start index");
            } else {
                strM1929 = (i2 < 0 || i2 > i3) ? m1929(i2, i3, "end index") : C5063.m8650("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM1929);
        }
    }
}
