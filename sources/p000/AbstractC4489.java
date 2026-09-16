package p000;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۦٙؔۘٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4489 {

    /* JADX INFO: renamed from: ۥؓ */
    public static final C2346 f14844;

    /* JADX INFO: renamed from: ۥؖ */
    public static C4682 f14845;

    /* JADX INFO: renamed from: ۥً */
    public static final C2346 f14846;

    /* JADX INFO: renamed from: ۥٕ */
    public static final C2346 f14850;

    /* JADX INFO: renamed from: ۥٙ */
    public static final C4682 f14852;

    /* JADX INFO: renamed from: ۥۦ */
    public static C2004 f14855;

    /* JADX INFO: renamed from: ۥۧ */
    public static final C2346 f14856;

    /* JADX INFO: renamed from: ۦؖ */
    public static C0979 f14857;

    /* JADX INFO: renamed from: ۦؗ */
    public static boolean f14858;

    /* JADX INFO: renamed from: ۦؙ */
    public static C1955 f14859;

    /* JADX INFO: renamed from: ۦٚ */
    public static final C2346 f14862;

    /* JADX INFO: renamed from: ۦۨ */
    public static final C0857 f14865 = new C0857(-691939061, new C2654(6), false);

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C0857 f14864 = new C0857(-1401792536, new C2654(7), false);

    /* JADX INFO: renamed from: ۥْ */
    public static final C0857 f14848 = new C0857(1110515666, new C2654(8), false);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C0857 f14849 = new C0857(1944140425, new C2654(9), false);

    /* JADX INFO: renamed from: ۥَ */
    public static final C0857 f14847 = new C0857(-348617214, new C2654(10), false);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C0857 f14851 = new C0857(1600487033, new C2654(11), false);

    /* JADX INFO: renamed from: ۦٗ */
    public static final C0857 f14861 = new C0857(-792511556, new C0064(28), false);

    /* JADX INFO: renamed from: ۦۛ */
    public static final C0857 f14863 = new C0857(1747838655, new C2654(12), false);

    /* JADX INFO: renamed from: ۥۖ */
    public static final C0857 f14853 = new C0857(1834782966, new C2654(13), false);

    /* JADX INFO: renamed from: ۦٕ */
    public static final C1068 f14860 = new C1068(5);

    /* JADX INFO: renamed from: ۥۙ */
    public static final Object f14854 = new Object();

    static {
        Method method = null;
        f14852 = new C4682(method, method, method);
        int i = 7;
        f14844 = new C2346(i, new C4769(29), new C4215(2));
        f14856 = new C2346(i, new C5338(0), new C4215(3));
        f14846 = new C2346(i, new C5338(1), new C4215(4));
        f14862 = new C2346(i, new C5338(2), new C4215(5));
        f14850 = new C2346(i, new C5338(3), new C4215(6));
    }

    /* JADX INFO: renamed from: ۥؓ */
    public static final void m7770(AbstractActivityC2747 abstractActivityC2747, String str) {
        String string = new C4441(new long[]{-1571694053041670829L, -875558201425666664L, -2510210685051495512L, 8461522393537532242L, 6796570048379645803L}).toString();
        Uri uri = Uri.parse(str);
        new C4441(new long[]{3400020530892030750L, -764830374420096631L, 5398847007125120808L}).toString();
        abstractActivityC2747.startActivity(Intent.createChooser(new Intent(string, uri), null));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX INFO: renamed from: ۥؔ */
    public static final C4235 m7771(C1249 c1249) {
        List list = c1249.f4305;
        C2340 c2340 = C2340.f7777;
        List list2 = list == null ? c2340 : list;
        CharSequence charSequence = c1249.f4307;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            C4228 c4228 = new C4228(23, false);
            c4228.f14025 = Parcel.obtain();
            if (list == null) {
                list = c2340;
            }
            int size = list.size();
            int i = 0;
            while (i < size) {
                C2331 c2331 = (C2331) list.get(i);
                C0553 c0553 = (C0553) c2331.f7719;
                int i2 = c2331.f7718;
                int i3 = c2331.f7717;
                ((Parcel) c4228.f14025).recycle();
                c4228.f14025 = Parcel.obtain();
                InterfaceC5561 interfaceC5561 = c0553.f1989;
                long j = c0553.f1991;
                long j2 = c0553.f1988;
                long j3 = c0553.f1987;
                List list3 = list;
                int i4 = size;
                long jMo3548 = interfaceC5561.mo3548();
                SpannableString spannableString2 = spannableString;
                int i5 = i;
                long j4 = C1327.f4591;
                if (!C4462.m7744(jMo3548, j4)) {
                    c4228.m7501((byte) 1);
                    ((Parcel) c4228.f14025).writeLong(c0553.f1989.mo3548());
                }
                long j5 = C5023.f16620;
                byte b = 2;
                if (!C5023.m8440(j3, j5)) {
                    c4228.m7501((byte) 2);
                    c4228.m7495(j3);
                }
                C1626 c1626 = c0553.f1984;
                if (c1626 != null) {
                    c4228.m7501((byte) 3);
                    ((Parcel) c4228.f14025).writeInt(c1626.f5444);
                }
                C5827 c5827 = c0553.f1990;
                if (c5827 != null) {
                    int i6 = c5827.f19197;
                    c4228.m7501((byte) 4);
                    c4228.m7501((i6 != 0 && i6 == 1) ? (byte) 1 : (byte) 0);
                }
                C2848 c2848 = c0553.f1985;
                if (c2848 != null) {
                    int i7 = c2848.f9512;
                    c4228.m7501((byte) 5);
                    if (i7 == 0) {
                        b = 0;
                    } else if (i7 == 65535) {
                        b = 1;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            b = 3;
                        } else {
                            b = 0;
                        }
                    }
                    c4228.m7501(b);
                }
                String str = c0553.f1996;
                if (str != null) {
                    c4228.m7501((byte) 6);
                    ((Parcel) c4228.f14025).writeString(str);
                }
                if (!C5023.m8440(j2, j5)) {
                    c4228.m7501((byte) 7);
                    c4228.m7495(j2);
                }
                C3917 c3917 = c0553.f1994;
                if (c3917 != null) {
                    float f = c3917.f13058;
                    c4228.m7501((byte) 8);
                    c4228.m7494(f);
                }
                C5647 c5647 = c0553.f1993;
                if (c5647 != null) {
                    c4228.m7501((byte) 9);
                    c4228.m7494(c5647.f18600);
                    c4228.m7494(c5647.f18599);
                }
                if (!C4462.m7744(j, j4)) {
                    c4228.m7501((byte) 10);
                    ((Parcel) c4228.f14025).writeLong(j);
                }
                C1690 c1690 = c0553.f1992;
                if (c1690 != null) {
                    c4228.m7501((byte) 11);
                    ((Parcel) c4228.f14025).writeInt(c1690.f5637);
                }
                C5906 c5906 = c0553.f1997;
                if (c5906 != null) {
                    c4228.m7501((byte) 12);
                    ((Parcel) c4228.f14025).writeLong(c5906.f19489);
                    long j6 = c5906.f19488;
                    c4228.m7494(Float.intBitsToFloat((int) (j6 >> 32)));
                    c4228.m7494(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                    c4228.m7494(c5906.f19487);
                }
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) c4228.f14025).marshall(), 0)), i2, i3, 33);
                i = i5 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i4;
            }
            charSequence = spannableString;
        }
        return new C4235(ClipData.newPlainText("plain text", charSequence));
    }

    /* JADX INFO: renamed from: ۥؖ */
    public static final boolean m7772(Context context) {
        Object systemService = context.getSystemService(new C4441(new long[]{5679496721989646767L, 5155882213390450720L, 3979605770424756902L}).toString());
        new C4441(new long[]{-4470061217018761247L, -8774085442714493167L, 4198680792606870390L, 8092759085771843019L, 7120907444161188269L, 3412777399997847756L, 2710363653538458804L, -6503312470196740316L, -1070240939466357086L, 1355990904597522380L}).toString();
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        boolean z = false;
        if (networkCapabilities != null && !networkCapabilities.hasCapability(16)) {
            z = true;
        }
        return !z;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static final void m7773(int i, C5362 c5362) {
        c5362.m8979(819054637);
        int i2 = 8;
        new C4441(new long[]{951345791768121533L, 3005100672011057857L, -8403915942976357939L, 3536022463715584088L, 1848160561457029451L, -5841099241408994099L, 4033136237298139019L, -1121774490152386431L}).toString();
        if (c5362.m9011(i & 1, i != 0)) {
            AbstractC4009.m7154(AbstractC5568.m9381(C4217.f13994, 0.0f, 16.0f, 0.0f, 0.0f, 13), 1.0f, C1327.f4592, c5362, 438, 0);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4876(i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public static void m7774(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iM7800 = m7800(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥؚ */
    public static void m7775(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iM7800 = m7800(parcel, i);
        parcel.writeString(str);
        m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥً */
    public static final C2440 m7776(C4162 c4162) throws IOException {
        Long lValueOf;
        long j;
        long j2;
        int iM7363 = c4162.m7363();
        if (iM7363 != 33639248) {
            throw new IOException("bad zip: expected " + m7781(33639248) + " but was " + m7781(iM7363));
        }
        c4162.skip(4L);
        short sM7359 = c4162.m7359();
        int i = sM7359 & 65535;
        if ((sM7359 & 1) != 0) {
            C5028.m8448("unsupported zip: general purpose bit flag=".concat(m7781(i)));
            return null;
        }
        int iM7359 = c4162.m7359() & 65535;
        short sM73510 = c4162.m7359();
        int i2 = sM73510 & 65535;
        short sM73511 = c4162.m7359();
        int i3 = sM73511 & 65535;
        if (i2 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i3 >> 9) & 127) + 1980, ((i3 >> 5) & 15) - 1, sM73511 & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (sM73510 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        c4162.m7363();
        C1314 c1314 = new C1314();
        c1314.f4535 = ((long) c4162.m7363()) & 4294967295L;
        C1314 c1315 = new C1314();
        c1315.f4535 = ((long) c4162.m7363()) & 4294967295L;
        int iM73510 = c4162.m7359() & 65535;
        int iM73511 = c4162.m7359() & 65535;
        int iM73512 = c4162.m7359() & 65535;
        c4162.skip(8L);
        C1314 c1316 = new C1314();
        c1316.f4535 = ((long) c4162.m7363()) & 4294967295L;
        String strM7360 = c4162.m7360(iM73510);
        if (AbstractC0684.m1528(strM7360, (char) 0)) {
            C5028.m8448("bad zip: filename contains 0x00");
            return null;
        }
        if (c1315.f4535 == 4294967295L) {
            j2 = 8;
            j = 8;
        } else {
            j = 8;
            j2 = 0;
        }
        if (c1314.f4535 == 4294967295L) {
            j2 += j;
        }
        if (c1316.f4535 == 4294967295L) {
            j2 += j;
        }
        C5662 c5662 = new C5662();
        long j3 = j2;
        m7813(c4162, iM73511, new C2549(c5662, j3, c1315, c4162, c1314, c1316));
        if (j3 > 0 && !c5662.f18631) {
            C5028.m8448("bad zip: zip64 extra required but absent");
            return null;
        }
        c4162.m7360(iM73512);
        String str = C5051.f16766;
        return new C2440(C4992.m8381("/").m8573(strM7360), strM7360.endsWith("/"), c1314.f4535, c1315.f4535, iM7359, lValueOf, c1316.f4535);
    }

    /* JADX INFO: renamed from: ۥَ */
    public static final String m7777(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: ۥُ */
    public static final void m7778(C5269 c5269, C5362 c5362, int i) {
        C5269 c52610;
        C5269 c52611;
        c5362.m8979(572223006);
        new C4441(new long[]{3122591000309858132L, 7859934970108485239L, -3647486749114652676L, -3301531872839137604L, 1848590224975727116L, -4998384761416986038L, -915629657729643715L, -2287786617475546345L, 8571260691294053022L, -910310187594233150L, -1839330205797735567L, -6979296279150638880L, -2708095586860568913L, -7522508859249516658L, 7769371265137346692L, 267304503505603875L}).toString();
        int i2 = i | 2;
        int i3 = 2;
        int i4 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 3) != 2)) {
            c5362.m8971();
            new C4441(new long[]{-1196415899263709553L, -5970206880452580035L, 8653236073156985476L}).toString();
            if ((i & 1) == 0 || c5362.m8969()) {
                new C4441(new long[]{-4607786600410097864L, 1245303409248789260L, 231197138986908750L, 345103209888494053L, -6673281152540778836L, 5115168040920315857L, -6326142958298626446L, -5187776100138658849L, 7933119799714574642L, -6234862670574471482L, -264754284997156171L, 7403488486674638023L, 4201432888306217243L, 1047443889598155542L, 1884115179071390093L, -4622203602521870159L}).toString();
                InterfaceC4680 interfaceC4680M4043 = AbstractC2095.m4043(c5362);
                if (interfaceC4680M4043 == null) {
                    throw new IllegalStateException(new C4441(new long[]{2583284707749732931L, -4115005717297045667L, -1519643861116034874L, 346257960795980028L, 8336044392172604388L, 706768609511288196L, -8737843361106707380L, 2908629227896464878L, 939363679235985193L}).toString().toString());
                }
                c52611 = (C5269) C5063.m8631(AbstractC5041.m8557(C5269.class), interfaceC4680M4043.mo651(), AbstractC1434.m3036(interfaceC4680M4043), AbstractC3804.m6801(c5362));
            } else {
                c5362.m8982();
                c52611 = c5269;
            }
            c5362.m8964();
            AbstractC2765.m5138(null, c5362, 0);
            List listM4188 = AbstractC2164.m4188(C0309.f1156, C0455.f1649);
            new C4441(new long[]{-4030094936646041123L, 4394643850110045560L, -7045511738596467245L, -946526968039282308L, -6856723084986992435L, 6113226248368578782L}).toString();
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                objM8999 = new C3940(i4, listM4188);
                c5362.m8987(objM8999);
            }
            InterfaceC4448 interfaceC4448 = (InterfaceC4448) objM8999;
            C3843 c3843 = AbstractC0630.f2331;
            Object[] objArr = new Object[0];
            C2346 c2346 = C2384.f7900;
            boolean zM8988 = c5362.m8988(0) | c5362.m8956(0.0f);
            Object objM89910 = c5362.m8999();
            if (zM8988 || objM89910 == c4036) {
                objM89910 = new C4719(4, interfaceC4448);
                c5362.m8987(objM89910);
            }
            C2384 c2384 = (C2384) AbstractC5378.m9036(objArr, c2346, (InterfaceC4448) objM89910, c5362, 0);
            c2384.f7901.setValue(interfaceC4448);
            AbstractC3831.m6857(null, C5063.f16809, null, null, AbstractC3925.m7034(-1780609929, new C3980(c52611), c5362), 0, 0L, 0L, null, AbstractC3925.m7034(-37531985, new C4513(i3, listM4188, c2384), c5362), c5362, 805330992, 493);
            c52610 = c52611;
        } else {
            c5362.m8982();
            c52610 = c5269;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3980(c52610, i, 2);
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static final void m7779(final boolean z, final InterfaceC4448 interfaceC4448, InterfaceC0705 interfaceC0705, boolean z2, C5143 c5143, C5362 c5362, final int i) {
        final InterfaceC0705 interfaceC0706;
        final boolean z3;
        final C5143 c5144;
        C5143 c5145;
        InterfaceC0705 interfaceC0707;
        boolean z4;
        long j;
        boolean z5;
        Object objM5175;
        boolean z6;
        InterfaceC0705 interfaceC0705M6866;
        int i2;
        c5362.m8979(408580840);
        int i3 = i | (c5362.m9006(z) ? 4 : 2) | (c5362.m8977(interfaceC4448) ? 32 : 16) | 208256;
        if (c5362.m9011(i3 & 1, (74899 & i3) != 74898)) {
            c5362.m8971();
            int i4 = i & 1;
            InterfaceC0705 interfaceC0708 = C4217.f13994;
            if (i4 == 0 || c5362.m8969()) {
                C2917 c2917 = (C2917) c5362.m8997(AbstractC0118.f470);
                C5143 c5146 = c2917.f9746;
                if (c5146 == null) {
                    c5145 = new C5143(AbstractC0118.m212(c2917, 26), AbstractC0118.m212(c2917, 19), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14), C1327.m2826(AbstractC0118.m212(c2917, 18), 0.38f, 14));
                    c2917.f9746 = c5145;
                } else {
                    c5145 = c5146;
                }
                interfaceC0707 = interfaceC0708;
                z4 = true;
            } else {
                c5362.m8982();
                interfaceC0707 = interfaceC0705;
                z4 = z2;
                c5145 = c5143;
            }
            c5362.m8964();
            InterfaceC5372 interfaceC5372M2409 = AbstractC1152.m2409(z ? 6.0f : 0.0f, AbstractC2552.m4817(2, c5362), c5362);
            c5145.getClass();
            if (z4 && z) {
                j = c5145.f17035;
            } else if (!z4 || z) {
                j = (z4 || !z) ? c5145.f17036 : c5145.f17033;
            } else {
                j = c5145.f17034;
            }
            if (z4) {
                c5362.m8957(1194696477);
                objM5175 = AbstractC2214.m4275(j, AbstractC2552.m4817(4, c5362), null, c5362, 0, 12);
                z5 = false;
                c5362.m9009(false);
            } else {
                z5 = false;
                c5362.m8957(1194874138);
                objM5175 = AbstractC2774.m5175(new C1327(j), c5362);
                c5362.m9009(false);
            }
            Object obj = objM5175;
            if (interfaceC4448 != null) {
                z6 = z4;
                interfaceC0705M6866 = AbstractC3831.m6866(interfaceC0708, z, AbstractC4670.m8032(20.0f, 4, 0L, z5), z6, new C2155(3), interfaceC4448);
            } else {
                z6 = z4;
                interfaceC0705M6866 = interfaceC0708;
            }
            if (interfaceC4448 != null) {
                C2779 c2779 = AbstractC4331.f14306;
                interfaceC0708 = C0573.f2046;
            }
            InterfaceC0705 interfaceC0705M7706 = AbstractC4410.m7706(AbstractC5568.m9376(AbstractC4410.m7708(interfaceC0707.mo1571(interfaceC0708).mo1571(interfaceC0705M6866)), 2.0f));
            boolean zM8963 = c5362.m8963(obj) | c5362.m8963(interfaceC5372M2409);
            Object objM8999 = c5362.m8999();
            if (zM8963 || objM8999 == C2850.f9517) {
                i2 = 0;
                objM8999 = new C1708(i2, obj, interfaceC5372M2409);
                c5362.m8987(objM8999);
            } else {
                i2 = 0;
            }
            AbstractC4009.m7165(interfaceC0705M7706, (InterfaceC4745) objM8999, c5362, i2);
            z3 = z6;
            interfaceC0706 = interfaceC0707;
            c5144 = c5145;
        } else {
            c5362.m8982();
            interfaceC0706 = interfaceC0705;
            z3 = z2;
            c5144 = c5143;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(z, interfaceC4448, interfaceC0706, z3, c5144, i) { // from class: ۥۜؖۦؓ

                /* JADX INFO: renamed from: ۥَ */
                public final /* synthetic */ C5143 f7982;

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ InterfaceC0705 f7983;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ boolean f7984;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC4448 f7985;

                /* JADX INFO: renamed from: ۦۨ */
                public final /* synthetic */ boolean f7986;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM6835 = AbstractC3831.m6835(1);
                    AbstractC4489.m7779(this.f7986, this.f7985, this.f7983, this.f7984, this.f7982, (C5362) obj2, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۥْ */
    public static final C3131 m7780(InterfaceC0103 interfaceC0103) {
        if (interfaceC0103 instanceof C2543) {
            return ((C2543) interfaceC0103).f8492;
        }
        if (interfaceC0103 instanceof C1101) {
            return m7780(((C1101) interfaceC0103).f3872);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static final String m7781(int i) {
        AbstractC2133.m4156(16);
        return "0x".concat(Integer.toString(i, 16));
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static final C1377 m7782(C4162 c4162, C1377 c1377) throws IOException {
        C5450 c5450 = new C5450();
        c5450.f17965 = c1377 != null ? (Long) c1377.f4719 : null;
        C5450 c5451 = new C5450();
        C5450 c5452 = new C5450();
        int iM7363 = c4162.m7363();
        if (iM7363 != 67324752) {
            throw new IOException("bad zip: expected " + m7781(67324752) + " but was " + m7781(iM7363));
        }
        c4162.skip(2L);
        short sM7359 = c4162.m7359();
        int i = sM7359 & 65535;
        if ((sM7359 & 1) != 0) {
            C5028.m8448("unsupported zip: general purpose bit flag=".concat(m7781(i)));
            return null;
        }
        c4162.skip(18L);
        long jM7359 = ((long) c4162.m7359()) & 65535;
        int iM7359 = c4162.m7359() & 65535;
        c4162.skip(jM7359);
        if (c1377 == null) {
            c4162.skip(iM7359);
            return null;
        }
        m7813(c4162, iM7359, new C1357(c4162, c5450, c5451, c5452));
        return new C1377(c1377.f4714, c1377.f4711, null, (Long) c1377.f4712, (Long) c5452.f17965, (Long) c5450.f17965, (Long) c5451.f17965);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static final InterfaceC4734 m7783(InterfaceC4734 interfaceC4734) {
        return interfaceC4734.mo193().mo187() ? interfaceC4734 : new C0921(interfaceC4734);
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public static void m7784(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iM7800 = m7800(parcel, i);
        parcel.writeBundle(bundle);
        m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥٙ */
    public static boolean m7785(String str) {
        HashMap map = AbstractC0299.f1089;
        IBinder iBinder = (IBinder) map.get("activity");
        IBinder iBinder2 = null;
        if (iBinder == null) {
            try {
                iBinder = (IBinder) AbstractC0299.f1088.invoke(null, "activity");
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("SystemServiceHelper", Log.getStackTraceString(e));
            }
            map.put("activity", iBinder);
        }
        if (iBinder != null) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("android.app.IActivityManager");
                parcelObtain.writeInt(2);
                iBinder.transact(1599296841, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                IBinder strongBinder = parcelObtain2.readStrongBinder();
                if (strongBinder != null) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    iBinder2 = strongBinder;
                } else {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    throw th2;
                }
            }
        }
        if (iBinder2 == null) {
            f14858 = false;
            return false;
        }
        AbstractC3310.m6085(iBinder2, str);
        f14858 = true;
        return true;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public static void m7786(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM7800 = m7800(parcel, i);
        parcel.writeByteArray(bArr);
        m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥٝ */
    public static void m7787(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iM7800 = m7800(parcel, i);
        parcel.writeIntArray(iArr);
        m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static final long m7788(int i) {
        return m7799(i, 4294967296L);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final void m7789(InterfaceC4745 interfaceC4745, InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4746, C5362 c5362, int i) {
        int i2;
        InterfaceC4507 interfaceC4507;
        int i3;
        Object obj = C1931.f6360;
        c5362.m8979(-180024211);
        if ((i & 6) == 0) {
            i2 = (c5362.m8977(interfaceC4745) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c5362.m8963(interfaceC0705) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= c5362.m8977(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= c5362.m8977(interfaceC4746) ? 16384 : 8192;
        }
        if (c5362.m9011(i4 & 1, (i4 & 9363) != 9362)) {
            int iHashCode = Long.hashCode(c5362.f17657);
            InterfaceC0705 interfaceC0705M2161 = AbstractC0993.m2161(c5362, interfaceC0705.mo1571(C2628.f8736).mo1571(C3932.f13122).mo1571(C3771.f12542).mo1571(C2961.f9926));
            InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(AbstractC2853.f9544);
            EnumC2459 enumC2459 = (EnumC2459) c5362.m8997(AbstractC2853.f9555);
            C2103 c2103M8994 = c5362.m8994();
            InterfaceC4507 interfaceC4508 = (InterfaceC4507) c5362.m8997(AbstractC1744.f5787);
            InterfaceC3983 interfaceC3983 = (InterfaceC3983) c5362.m8997(AbstractC0802.f2868);
            c5362.m8957(1314774735);
            int i5 = i4 & 14;
            int iHashCode2 = Long.hashCode(c5362.f17657);
            Context context = (Context) c5362.m8997(AbstractC4354.f14355);
            C3102 c3102M1926 = AbstractC0949.m1926(c5362);
            InterfaceC0814 interfaceC0814 = (InterfaceC0814) c5362.m8997(AbstractC3198.f10737);
            View view = (View) c5362.m8997(AbstractC4354.f14354);
            boolean zM8977 = c5362.m8977(context) | ((((i5 & 14) ^ 6) > 4 && c5362.m8963(interfaceC4745)) || (i5 & 6) == 4) | c5362.m8977(c3102M1926) | c5362.m8977(interfaceC0814) | c5362.m8988(iHashCode2) | c5362.m8977(view);
            Object objM8999 = c5362.m8999();
            if (zM8977 || objM8999 == C2850.f9517) {
                interfaceC4507 = interfaceC4508;
                i3 = iHashCode;
                Object c1627 = new C1627(context, interfaceC4745, c3102M1926, interfaceC0814, iHashCode2, view);
                c5362.m8987(c1627);
                objM8999 = c1627;
            } else {
                i3 = iHashCode;
                interfaceC4507 = interfaceC4508;
            }
            InterfaceC4448 interfaceC4448 = (InterfaceC4448) objM8999;
            c5362.m8989(125, 1, null, null);
            c5362.f17651 = true;
            if (c5362.f17668) {
                c5362.m9005(interfaceC4448);
            } else {
                c5362.m8972();
            }
            InterfaceC4576.f15106.getClass();
            AbstractC0993.m2127(C0849.f3047, c5362, c2103M8994);
            AbstractC0993.m2127(C3136.f10568, c5362, interfaceC0705M2161);
            AbstractC0993.m2127(C3136.f10572, c5362, interfaceC2880);
            AbstractC0993.m2127(C3136.f10589, c5362, interfaceC4507);
            AbstractC0993.m2127(C3136.f10591, c5362, interfaceC3983);
            AbstractC0993.m2127(C3136.f10577, c5362, enumC2459);
            AbstractC0993.m2127(C0849.f3053, c5362, Integer.valueOf(i3));
            AbstractC0993.m2127(C3136.f10569, c5362, interfaceC4746);
            AbstractC0993.m2127(C3136.f10570, c5362, obj);
            c5362.m9009(true);
            c5362.m9009(false);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C4245(interfaceC4745, interfaceC0705, interfaceC4746, i, 0);
        }
    }

    /* JADX INFO: renamed from: ۥۘ */
    public static void m7790(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: ۥۙ */
    public static final void m7791(C0126 c0126, int i, Object obj) {
        int iM265 = c0126.m265(i);
        Object[] objArr = c0126.f482;
        Object obj2 = objArr[iM265];
        objArr[iM265] = C2850.f9517;
        if (obj == obj2) {
            return;
        }
        AbstractC5508.m9201("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static final void m7792(List list, C2384 c2384, C5362 c5362, int i) {
        c5362.m8979(700130836);
        new C4441(new long[]{-2475520316492081755L, 830815763456489374L, -5757893040611185780L, 8850252137722956798L, 101882270227641028L, 7586739421380869351L, -7490133037516835094L, 5202815567776838650L, 6666788177940550013L, 695686282364106485L, 4174379059436610930L}).toString();
        int i2 = (c5362.m8963(c2384) ? 32 : 16) | i;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            AbstractC2133.m4139(c2384, null, null, null, list.size(), C1298.f4433, null, false, null, null, null, AbstractC3925.m7034(1796246131, new C2081(3, list), c5362), c5362, ((i2 >> 3) & 14) | 1572864);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0970(list, c2384, i, 0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m7793(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iM7800 = m7800(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥۡ */
    public static void m7794(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iM7800 = m7800(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m7795(InterfaceC4745 interfaceC4745, InterfaceC0705 interfaceC0705, InterfaceC4745 interfaceC4746, C5362 c5362, int i) {
        c5362.m8979(-1783766393);
        int i2 = (c5362.m8977(interfaceC4745) ? 4 : 2) | i | (c5362.m8963(interfaceC0705) ? 32 : 16) | (c5362.m8977(interfaceC4746) ? 256 : 128);
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            m7789(interfaceC4745, interfaceC0705, interfaceC4746, c5362, ((i2 << 6) & 57344) | (i2 & 14) | 3072 | (i2 & 112));
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3560(interfaceC4745, interfaceC0705, interfaceC4746, i);
        }
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static void m7796(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iM7800 = m7800(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static void m7797(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static final C4855 m7798(C0605 c0605) {
        C4855 c4855 = c0605.f2240;
        if (c4855 != null) {
            return c4855;
        }
        throw AbstractC3761.m6633("Required value was null.");
    }

    /* JADX INFO: renamed from: ۥۧ */
    public static final long m7799(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        C3970[] c3970Arr = C5023.f16621;
        return jFloatToRawIntBits;
    }

    /* JADX INFO: renamed from: ۥۨ */
    public static int m7800(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static final void m7801(C5269 c5269, C5362 c5362, int i) {
        c5362.m8979(1104069126);
        new C4441(new long[]{6253060378883479217L, 6238722518548492157L, 4781698329538421851L, -8569856622672234701L, -2551922430735534628L, 6672326416816471766L, -3628402757903347817L}).toString();
        int i2 = 2;
        int i3 = (c5362.m8977(c5269) ? 4 : 2) | i;
        int i4 = 0;
        if (!c5362.m9011(i3 & 1, (i3 & 3) != 2)) {
            c5362.m8982();
        } else if (AbstractC0502.f1818 || AbstractC0502.f1815 == null) {
            c5362.m8957(464730236);
            c5362.m9009(false);
        } else {
            c5362.m8957(463894166);
            new C4441(new long[]{6512433068822030546L, -3741139760833602594L, -5463993140567504234L, -6413378885271847520L, -7034483813196008806L, 7869097335812809757L, -496123028017255871L, 1312220792405766393L, 4674149947015168197L, -7944041219890075035L}).toString();
            InterfaceC4367 interfaceC4367M6750 = AbstractC3801.m6750(c5269.f17362, c5362);
            C4216 c4216 = AbstractC2853.f9544;
            new C4441(new long[]{6831416433440547787L, -5375148445313087851L, -6007806186287796116L, 5234584535850242513L, -3287330252137192268L, 5672721500796047380L, 4116890880767035715L}).toString();
            InterfaceC2880 interfaceC2880 = (InterfaceC2880) c5362.m8997(c4216);
            boolean z = ((C5890) interfaceC4367M6750.getValue()).f19427 && !((C5890) interfaceC4367M6750.getValue()).f19426.isEmpty() && (((C5259) C5063.f16800.f6933) != null || ((InterfaceC1897) AbstractC5781.f19049.f6933) != null);
            C1808 c1808M1644 = AbstractC0757.m1644();
            new C4441(new long[]{3033886016799626141L, 1044690304550044603L, 3569733271153189039L, 2414796558225462283L, 6755247980793274825L, 4848072686975305302L}).toString();
            boolean zM8963 = c5362.m8963(interfaceC2880);
            Object objM8999 = c5362.m8999();
            C4036 c4036 = C2850.f9517;
            if (zM8963 || objM8999 == c4036) {
                objM8999 = new C0091(17, interfaceC2880);
                c5362.m8987(objM8999);
            }
            Map map = AbstractC4168.f13869;
            C1808 c1808M3590 = c1808M1644.m3590(new C1808(new C3650((C3075) null, new C2565(new C1749((InterfaceC4745) objM8999, i2), m7811(0.0f, 400.0f, new C0873(4294967297L), 1)), (C5388) null, (LinkedHashMap) null, 125)));
            new C4441(new long[]{7145251411467921560L, -5439033530522593630L, -5121478133429822384L, -7910162537563767765L, 6699699630263439776L, -3353557352030716407L}).toString();
            Object objM89910 = c5362.m8999();
            if (objM89910 == c4036) {
                objM89910 = new C4618(18);
                c5362.m8987(objM89910);
            }
            C5275 c5275 = new C5275();
            ((InterfaceC4745) objM89910).mo211(c5275);
            AbstractC3933.m7078(z, null, c1808M3590, AbstractC0757.m1643(new C4203(c5275), 2), null, AbstractC3925.m7034(-1950891975, new C3032(3, c5269), c5362), c5362, 199680);
            c5362.m9009(false);
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3980(c5269, i, i4);
        }
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static void m7802(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM7800 = m7800(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۦؖ */
    public static final View m7803(InterfaceC3975 interfaceC3975) {
        if (!((AbstractC5381) interfaceC3975).f17791.f17786) {
            AbstractC3480.m6278("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC5359.m8951(AbstractC5537.m9270(interfaceC3975));
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static final void m7804(int i) {
        App app = App.f407;
        Toast.makeText(AbstractC1631.m3410(), AbstractC1631.m3410().getString(i), 0).show();
    }

    /* JADX INFO: renamed from: ۦؙ */
    public static final void m7805(List list, int i, int i2) {
        int iM7821 = m7821(i, list);
        if (iM7821 < 0) {
            iM7821 = -(iM7821 + 1);
        }
        while (iM7821 < list.size() && ((C3067) list.get(iM7821)).f10308 < i2) {
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static final void m7806(C3222 c3222, ArrayList arrayList, int i) {
        boolean zM5923 = c3222.m5923(i);
        int[] iArr = c3222.f10824;
        if (zM5923) {
            arrayList.add(c3222.m5930(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            m7806(c3222, arrayList, i3);
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static final boolean m7807(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: ۦُ */
    public static C1720 m7808() {
        return new C1720(0);
    }

    /* JADX INFO: renamed from: ۦِ */
    public static final LinkedHashMap m7809(ArrayList arrayList) {
        String str = C5051.f16766;
        C5051 c5051M8381 = C4992.m8381("/");
        C3869[] c3869Arr = {new C3869(c5051M8381, new C2440(c5051M8381))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC4554.m7911(1));
        AbstractC4554.m7936(linkedHashMap, c3869Arr);
        for (C2440 c2440 : AbstractC0973.m2055(arrayList, new C1206(16))) {
            if (((C2440) linkedHashMap.put(c2440.f8129, c2440)) == null) {
                while (true) {
                    C5051 c5051 = c2440.f8129;
                    C5051 c5051M8571 = c5051.m8571();
                    if (c5051M8571 == null) {
                        break;
                    }
                    C2440 c2441 = (C2440) linkedHashMap.get(c5051M8571);
                    if (c2441 != null) {
                        c2441.f8128.add(c5051);
                        break;
                    }
                    C2440 c2442 = new C2440(c5051M8571);
                    linkedHashMap.put(c5051M8571, c2442);
                    c2442.f8128.add(c5051);
                    c2440 = c2442;
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static void m7810(boolean z) {
        App app = App.f407;
        App appM3410 = AbstractC1631.m3410();
        int i = z ? 2 : 1;
        ComponentName componentName = new ComponentName(appM3410.getPackageName(), new C4441(new long[]{-8259151009330984387L, -6089769492167005105L, -220172467615611708L, -5363383732789764855L, -596676252472949627L, -303803198898923170L}).toString());
        try {
            PackageManager packageManager = appM3410.getPackageManager();
            if (packageManager != null) {
                packageManager.setComponentEnabledSetting(componentName, i, 1);
            }
        } catch (Exception e) {
            App app2 = App.f407;
            App appM5217 = AbstractC2776.m5217();
            C5714 c5714M169 = appM5217.m169();
            String string = new C4441(new long[]{2972541482607399404L, -2233465496844012508L, -1393763580189661629L, -8993296605632731966L, 3876209495765680658L, 3647608431319871942L}).toString();
            C3525 c3525 = c5714M169.f18806;
            ((ExecutorC2291) c3525.f11687.f9378).m4345(new CallableC3283(c3525, System.currentTimeMillis() - c3525.f11679, string));
            C3525 c3526 = appM5217.m169().f18806;
            Map map = Collections.EMPTY_MAP;
            ((ExecutorC2291) c3526.f11687.f9378).m4346(new RunnableC5689(c3526, e));
        }
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static C0969 m7811(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C0969(f, f2, obj);
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static SideActivity m7812() {
        SideActivity sideActivity = SideActivity.f416;
        if (sideActivity != null) {
            return sideActivity;
        }
        new C4441(new long[]{1483460307122000074L, -9070854414102313444L, 8842196556899469133L}).toString();
        return null;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public static final void m7813(C4162 c4162, int i, InterfaceC5731 interfaceC5731) throws IOException {
        C1270 c1270 = c4162.f13856;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                C5028.m8448("bad zip: truncated header in extra field");
                return;
            }
            int iM7359 = c4162.m7359() & 65535;
            long jM7359 = ((long) c4162.m7359()) & 65535;
            long j2 = j - 4;
            if (j2 < jM7359) {
                C5028.m8448("bad zip: truncated value in extra field");
                return;
            }
            c4162.mo2691(jM7359);
            long j3 = c1270.f4340;
            interfaceC5731.mo219(Integer.valueOf(iM7359), Long.valueOf(jM7359));
            long j4 = (c1270.f4340 + jM7359) - j3;
            if (j4 < 0) {
                C5028.m8448(AbstractC5078.m8670(iM7359, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    c1270.skip(j4);
                }
                j = j2 - jM7359;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static final boolean m7814(Context context) {
        return AbstractC4225.m7487(context, new C4441(new long[]{-8294185454205280028L, -1589965441078518969L, -4198316149341511701L, -7324366328479705848L, 3760337148216159594L}).toString()) == 0;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final void m7815(List list, C2384 c2384, C5362 c5362, int i) {
        c5362.m8979(1580648053);
        new C4441(new long[]{-5141846520201983302L, -777665352110928422L, -2880504385930275996L, -2649593921345067452L, 1999003739313227240L, 4638457759320946987L, -1688056675689875865L, -902608701833779236L, -1471715543817166304L, 4350570147259363300L, 4027936906209036067L, 4821478195515865045L, -1574238740793132004L}).toString();
        int i2 = (c5362.m8963(c2384) ? 32 : 16) | i;
        int i3 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 19) != 18)) {
            new C4441(new long[]{-4694117704449605899L, 7439097164280939439L, 2247102475539470573L, 4015866360915274801L, -4723257704717186611L, 3314910105475885771L, 5160435301507856450L, -6141547131793976854L, 707880013274658639L, 7441822228311405843L}).toString();
            new C4441(new long[]{-4237308436094321189L, 2117824276796957637L, -2283631264353047955L, 8880733387749575057L, -8231691446859353757L}).toString();
            Object objM8999 = c5362.m8999();
            if (objM8999 == C2850.f9517) {
                objM8999 = AbstractC3925.m7061(c5362);
                c5362.m8987(objM8999);
            }
            AbstractC2164.m4185(c2384.m1405(), null, 0L, 0L, AbstractC3925.m7034(-1603606527, new C3032(4, c2384), c5362), null, AbstractC3925.m7034(834718123, new C3659(list, c2384, (InterfaceC4643) objM8999, 2), c5362), c5362, 1597440);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C0970(list, c2384, i, i3);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static final long m7816(float f, int i, long j, boolean z) {
        int iM6556 = ((z || i == 2 || i == 4 || i == 5) && C3693.m6548(j)) ? C3693.m6556(j) : Integer.MAX_VALUE;
        if (C3693.m6557(j) != iM6556) {
            iM6556 = AbstractC4554.m7934(AbstractC1434.m3058(f), C3693.m6557(j), iM6556);
        }
        return C5063.m8609(0, iM6556, 0, C3693.m6551(j));
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static final long m7817(double d) {
        return m7799((float) d, 4294967296L);
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static final String m7818(InterfaceC0443 interfaceC0443) {
        Object c4535;
        if (interfaceC0443 instanceof C4437) {
            return ((C4437) interfaceC0443).toString();
        }
        try {
            c4535 = interfaceC0443 + '@' + m7777(interfaceC0443);
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        if (AbstractC0183.m405(c4535) != null) {
            c4535 = interfaceC0443.getClass().getName() + '@' + m7777(interfaceC0443);
        }
        return (String) c4535;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static final AbstractC2132 m7819(Executor executor) {
        return new C5254(executor);
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static C0380 m7820(int i, InterfaceC3015 interfaceC3015, int i2) {
        if ((i2 & 1) != 0) {
            i = 300;
        }
        if ((i2 & 4) != 0) {
            interfaceC3015 = AbstractC1074.f3761;
        }
        return new C0380(i, interfaceC3015);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static final int m7821(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iM6879 = AbstractC3831.m6879(((C3067) list.get(i3)).f10308, i);
            if (iM6879 < 0) {
                i2 = i3 + 1;
            } else {
                if (iM6879 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: ۥِ */
    public abstract Object mo1145(int i);

    /* JADX INFO: renamed from: ۦؔ */
    public abstract Object mo1148(C2632 c2632);

    /* JADX INFO: renamed from: ۦٛ */
    public abstract void mo963(C1781 c1781, Object obj);

    /* JADX INFO: renamed from: ۦ۠ */
    public abstract C2632 mo1149(int i);

    /* JADX INFO: renamed from: ۦۧ */
    public abstract int mo1150();
}
