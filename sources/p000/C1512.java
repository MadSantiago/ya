package p000;

import android.adservices.measurement.MeasurementManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: ۥٗؒٔۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1512 extends AbstractC0243 {

    /* JADX INFO: renamed from: ۥۖ */
    public static final String[] f5129 = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: ۦٕ */
    public static final String[] f5130 = {"_err"};

    /* JADX INFO: renamed from: ۥَ */
    public int f5131;

    /* JADX INFO: renamed from: ۥْ */
    public SecureRandom f5132;

    /* JADX INFO: renamed from: ۥٓ */
    public final AtomicLong f5133;

    /* JADX INFO: renamed from: ۥٖ */
    public C5424 f5134;

    /* JADX INFO: renamed from: ۦٗ */
    public Boolean f5135;

    /* JADX INFO: renamed from: ۦۛ */
    public Integer f5136;

    public C1512(C5371 c5371) {
        super(c5371);
        this.f5136 = null;
        this.f5133 = new AtomicLong(0L);
    }

    /* JADX INFO: renamed from: ۥؕ */
    public static boolean m3186(Context context) {
        ActivityInfo receiverInfo;
        AbstractC0487.m1047(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: ۥٌ */
    public static boolean m3187(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m3188(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: renamed from: ۥۤ */
    public static boolean m3189(String str, String[] strArr) {
        AbstractC0487.m1047(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public static byte[] m3190(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥۦ */
    public static void m3191(InterfaceC5264 interfaceC5264, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m3201(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        interfaceC5264.mo4475(str, "_err", bundle);
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static final boolean m3192(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    /* JADX INFO: renamed from: ۦؓ */
    public static void m3193(C0932 c0932, Bundle bundle, boolean z) {
        if (bundle != null && c0932 != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = c0932.f3320;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c0932.f3319;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c0932.f3316);
                return;
            }
            z = false;
        }
        if (bundle != null && c0932 == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static MessageDigest m3194() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦؘ */
    public static boolean m3195(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: renamed from: ۦَ */
    public static boolean m3196(String str) {
        AbstractC0487.m1090(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: renamed from: ۦُ */
    public static long m3197(byte[] bArr) {
        AbstractC0487.m1047(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i = 0;
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static String m3198(int i, String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦٖ */
    public static boolean m3199(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: ۦٟ */
    public static ArrayList m3200(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1513 c1513 = (C1513) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c1513.f5147);
            bundle.putString("origin", c1513.f5146);
            bundle.putLong("creation_timestamp", c1513.f5139);
            bundle.putString("name", c1513.f5138.f5025);
            Object objM3090 = c1513.f5138.m3090();
            AbstractC0487.m1047(objM3090);
            AbstractC1434.m3060(bundle, objM3090);
            bundle.putBoolean("active", c1513.f5137);
            String str = c1513.f5140;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C2679 c2679 = c1513.f5144;
            if (c2679 != null) {
                bundle.putString("timed_out_event_name", c2679.f8889);
                C5645 c5645 = c2679.f8888;
                if (c5645 != null) {
                    bundle.putBundle("timed_out_event_params", c5645.m9478());
                }
            }
            bundle.putLong("trigger_timeout", c1513.f5145);
            C2679 c26710 = c1513.f5142;
            if (c26710 != null) {
                bundle.putString("triggered_event_name", c26710.f8889);
                C5645 c5646 = c26710.f8888;
                if (c5646 != null) {
                    bundle.putBundle("triggered_event_params", c5646.m9478());
                }
            }
            bundle.putLong("triggered_timestamp", c1513.f5138.f5021);
            bundle.putLong("time_to_live", c1513.f5143);
            C2679 c26711 = c1513.f5141;
            if (c26711 != null) {
                bundle.putString("expired_event_name", c26711.f8889);
                C5645 c5647 = c26711.f8888;
                if (c5647 != null) {
                    bundle.putBundle("expired_event_params", c5647.m9478());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public static final boolean m3201(int i, Bundle bundle) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final Bundle m3202(String str, Bundle bundle, List list, boolean z) {
        int iM3233;
        boolean zM3189 = m3189(str, AbstractC1605.f5387);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C5371 c5371 = (C5371) this.f18660;
        C0515 c0515 = c5371.f17715;
        C4004 c4004 = c5371.f17731;
        C1512 c1512 = ((C5371) c0515.f18660).f17721;
        C5371.m9021(c1512);
        int i = c1512.m3227(201500000) ? 100 : 25;
        int i2 = 0;
        boolean z2 = false;
        for (String str2 : new TreeSet(bundle.keySet())) {
            if (list == 0 || !list.contains(str2)) {
                iM3233 = !z ? m3233(str2) : 0;
                if (iM3233 == 0) {
                    iM3233 = m3222(str2);
                }
            } else {
                iM3233 = 0;
            }
            if (iM3233 != 0) {
                m3210(bundle2, iM3233, str2, iM3233 == 3 ? str2 : null);
                bundle2.remove(str2);
            } else {
                int iM3213 = m3213(str, str2, bundle.get(str2), bundle2, list, z, zM3189);
                if (iM3213 == 17) {
                    m3210(bundle2, 17, str2, Boolean.FALSE);
                } else if (iM3213 != 0 && !"_ev".equals(str2)) {
                    m3210(bundle2, iM3213, iM3213 == 21 ? str : str2, bundle.get(str2));
                    bundle2.remove(str2);
                }
                if (m3196(str2)) {
                    i2++;
                    if (i2 > i) {
                        if (!z2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                            sb.append("Event can't contain more than ");
                            sb.append(i);
                            sb.append(" params");
                            String string = sb.toString();
                            C3610 c3610 = c5371.f17717;
                            C5371.m9020(c3610);
                            c3610.f12026.m9434(c4004.m7146(str), c4004.m7143(bundle), string);
                        }
                        m3201(5, bundle2);
                        bundle2.remove(str2);
                        z2 = true;
                    }
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: ۥؔ */
    public final C5424 m3203() {
        C2911 c2911;
        C5424 c5424 = this.f5134;
        if (c5424 != null) {
            return c5424;
        }
        Context context = ((C5371) this.f18660).f17739;
        StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
        int i = Build.VERSION.SDK_INT;
        C0736 c0736 = C0736.f2678;
        sb.append(i >= 33 ? c0736.m1624() : 0);
        Log.d("MeasurementManager", sb.toString());
        if ((i >= 33 ? c0736.m1624() : 0) >= 5) {
            c2911 = new C2911(AbstractC1129.m2373(context.getSystemService(AbstractC1129.m2361())));
        } else {
            C3276 c3276 = C3276.f10988;
            if (((i == 31 || i == 32) ? c3276.m6038() : 0) >= 9) {
                try {
                    c2911 = new C2911(MeasurementManager.get(context));
                } catch (NoClassDefFoundError unused) {
                    StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                    int i2 = Build.VERSION.SDK_INT;
                    sb2.append((i2 == 31 || i2 == 32) ? c3276.m6038() : 0);
                    Log.d("MeasurementManager", sb2.toString());
                    c2911 = null;
                }
            } else {
                c2911 = null;
            }
        }
        C5424 c5425 = c2911 != null ? new C5424(c2911) : null;
        this.f5134 = c5425;
        return c5425;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final Object m3204(Object obj, String str) {
        C5371 c5371 = (C5371) this.f18660;
        int iMax = 500;
        if ("_ev".equals(str)) {
            c5371.f17715.getClass();
            return m3212(Math.max(500, 256), obj, true, true);
        }
        if (m3188(str)) {
            c5371.f17715.getClass();
            iMax = Math.max(500, 256);
        } else {
            c5371.f17715.getClass();
        }
        return m3212(iMax, obj, false, true);
    }

    /* JADX INFO: renamed from: ۥؙ */
    public final Bundle m3205(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objM3204 = m3204(bundle.get(str), str);
                if (objM3204 == null) {
                    C5371 c5371 = (C5371) this.f18660;
                    C3610 c3610 = c5371.f17717;
                    C5371.m9020(c3610);
                    c3610.f12021.m9430(c5371.f17731.m7145(str), "Param value can't be null");
                } else {
                    m3231(bundle2, str, objM3204);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: ۥؚ */
    public final boolean m3206(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((C5371) this.f18660).f17715.m1165("debug.firebase.analytics.app").equals(str);
    }

    /* JADX INFO: renamed from: ۥً */
    public final void m3207(Parcelable[] parcelableArr, int i) {
        AbstractC0487.m1047(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i2 = 0;
            boolean z = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (m3196(str) && !m3189(str, AbstractC4009.f13370) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        C5371 c5371 = (C5371) this.f18660;
                        C3610 c3610 = c5371.f17717;
                        C4004 c4004 = c5371.f17731;
                        C5371.m9020(c3610);
                        C5590 c5590 = c3610.f12026;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        c5590.m9434(c4004.m7145(str), c4004.m7143(bundle), sb.toString());
                    }
                    m3201(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥٍ */
    public final String m3208() {
        byte[] bArr = new byte[16];
        m3244().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX INFO: renamed from: ۥِ */
    public final void m3209(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    @Override // p000.AbstractC0243
    /* JADX INFO: renamed from: ۥٓ */
    public final boolean mo504() {
        return true;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final void m3210(Bundle bundle, int i, String str, Object obj) {
        if (m3201(i, bundle)) {
            C0515 c0515 = ((C5371) this.f18660).f17715;
            bundle.putString("_ev", m3198(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥٗ */
    public final boolean m3211(String str, String str2) {
        C5371 c5371 = (C5371) this.f18660;
        if (str2 == null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12026.m9430(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12026.m9430(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                C3610 c3612 = c5371.f17717;
                C5371.m9020(c3612);
                c3612.f12026.m9434(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                C3610 c3613 = c5371.f17717;
                C5371.m9020(c3613);
                c3613.f12026.m9434(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final Object m3212(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return m3198(i, obj.toString(), z);
        }
        if (!z2) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleM3205 = m3205((Bundle) parcelable);
                if (!bundleM3205.isEmpty()) {
                    arrayList.add(bundleM3205);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX INFO: renamed from: ۥٙ */
    public final int m3213(String str, String str2, Object obj, Bundle bundle, List list, boolean z, boolean z2) {
        int i;
        int size;
        C5371 c5371 = (C5371) this.f18660;
        mo6517();
        int i2 = 0;
        if (!m3195(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!m3189(str2, AbstractC4009.f13366)) {
                return 20;
            }
            C5695 c5695M9028 = c5371.m9028();
            c5695M9028.mo6517();
            c5695M9028.m7643();
            if (c5695M9028.m9518()) {
                C1512 c1512 = ((C5371) c5695M9028.f18660).f17721;
                C5371.m9021(c1512);
                if (c1512.m3242() < 200900) {
                    return 25;
                }
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12021.m9431("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i = 17;
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
            } else {
                i = 0;
            }
        }
        int iMax = 500;
        if (m3188(str) || m3188(str2)) {
            c5371.f17715.getClass();
            iMax = Math.max(500, 256);
        } else {
            c5371.f17715.getClass();
        }
        if (!m3235("param", str2, iMax, obj)) {
            if (!z2) {
                return 4;
            }
            if (obj instanceof Bundle) {
                m3240(str, str2, (Bundle) obj, list, z);
                return i;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i2 < length) {
                    Parcelable parcelable = parcelableArr2[i2];
                    if (!(parcelable instanceof Bundle)) {
                        C3610 c3611 = c5371.f17717;
                        C5371.m9020(c3611);
                        c3611.f12021.m9434(parcelable.getClass(), str2, "All Parcelable[] elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    m3240(str, str2, (Bundle) parcelable, list, z);
                    i2++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    if (!(obj2 instanceof Bundle)) {
                        C3610 c3612 = c5371.f17717;
                        C5371.m9020(c3612);
                        c3612.f12021.m9434(obj2 != null ? obj2.getClass() : "null", str2, "All ArrayList elements must be of type Bundle. Value type, name");
                        return 4;
                    }
                    m3240(str, str2, (Bundle) obj2, list, z);
                    i2++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥٚ */
    public final long m3214() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f5133;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f5133;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((C5371) this.f18660).f17719.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i = this.f5131 + 1;
            this.f5131 = i;
            j = jNextLong + ((long) i);
        }
        return j;
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final int m3215(String str) {
        C5371 c5371 = (C5371) this.f18660;
        if ("_ldl".equals(str)) {
            C0515 c0515 = c5371.f17715;
            return 2048;
        }
        if ("_id".equals(str)) {
            C0515 c0516 = c5371.f17715;
            return 256;
        }
        if ("_lgclid".equals(str)) {
            C0515 c0517 = c5371.f17715;
            return 100;
        }
        C0515 c0518 = c5371.f17715;
        return 36;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final boolean m3216(String str) {
        mo6517();
        C5371 c5371 = (C5371) this.f18660;
        if (C3866.m6899(c5371.f17739).f972.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        C3610 c3610 = c5371.f17717;
        C5371.m9020(c3610);
        c3610.f12015.m9430(str, "Permission not granted");
        return false;
    }

    /* JADX INFO: renamed from: ۥٞ */
    public final void m3217(InterfaceC3838 interfaceC3838, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC3838.mo1888(bundle);
        } catch (RemoteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(e, "Error returning bundle list to wrapper");
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean m3218(String str) {
        C5371 c5371 = (C5371) this.f18660;
        if (TextUtils.isEmpty(str)) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12026.m9432("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        AbstractC0487.m1047(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        C3610 c3611 = c5371.f17717;
        C5371.m9020(c3611);
        c3611.f12026.m9430(C3610.m6440(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    /* JADX INFO: renamed from: ۥۘ */
    public final void m3219(String str, InterfaceC3838 interfaceC3838) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC3838.mo1888(bundle);
        } catch (RemoteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(e, "Error returning string value to wrapper");
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final int m3220(Object obj, String str) {
        return "_ldl".equals(str) ? m3235("user property referrer", str, m3215(str), obj) : m3235("user property", str, m3215(str), obj) ? 0 : 7;
    }

    /* JADX INFO: renamed from: ۥۚ */
    public final boolean m3221(String str, String str2) {
        C5371 c5371 = (C5371) this.f18660;
        if (str2 == null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12026.m9430(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12026.m9430(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            C3610 c3612 = c5371.f17717;
            C5371.m9020(c3612);
            c3612.f12026.m9434(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                C3610 c3613 = c5371.f17717;
                C5371.m9020(c3613);
                c3613.f12026.m9434(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۛ */
    public final int m3222(String str) {
        if (!m3211("event param", str)) {
            return 3;
        }
        if (!m3234("event param", null, null, str)) {
            return 14;
        }
        C0515 c0515 = ((C5371) this.f18660).f17715;
        return !m3245(40, "event param", str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: ۥ۠ */
    public final boolean m3223(String str) {
        return ((C5371) this.f18660).f17715.m1162(null, AbstractC4936.f19563) ? m3189(str, AbstractC1605.f5400) : m3189(str, AbstractC1605.f5398);
    }

    /* JADX INFO: renamed from: ۥۡ */
    public final C2679 m3224(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (m3229(str) != 0) {
            C5371 c5371 = (C5371) this.f18660;
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(c5371.f17731.m7142(str), "Invalid conditional property event name");
            C0178.m393();
            return null;
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleM3202 = m3202(str, bundle2, Collections.singletonList("_o"), true);
        if (z) {
            bundleM3202 = m3205(bundleM3202);
        }
        AbstractC0487.m1047(bundleM3202);
        return new C2679(str, new C5645(bundleM3202), str2, j, j2);
    }

    /* JADX INFO: renamed from: ۥۢ */
    public final void m3225(InterfaceC3838 interfaceC3838, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC3838.mo1888(bundle);
        } catch (RemoteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(e, "Error returning int value to wrapper");
        }
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final void m3226(C2390 c2390, int i) {
        Bundle bundle = c2390.f7920;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (m3196(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String string = sb.toString();
                    C5371 c5371 = (C5371) this.f18660;
                    C3610 c3610 = c5371.f17717;
                    C4004 c4004 = c5371.f17731;
                    C5371.m9020(c3610);
                    c3610.f12026.m9434(c4004.m7146(c2390.f7922), c4004.m7143(bundle), string);
                    m3201(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final boolean m3227(int i) {
        Boolean bool = ((C5371) this.f18660).m9028().f18731;
        if (m3242() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۦ */
    public final void m3228(InterfaceC3838 interfaceC3838, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC3838.mo1888(bundle);
        } catch (RemoteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(e, "Error returning byte array to wrapper");
        }
    }

    /* JADX INFO: renamed from: ۦؐ */
    public final int m3229(String str) {
        if (!m3211("event", str)) {
            return 2;
        }
        if (m3234("event", AbstractC1605.f5396, ((C5371) this.f18660).f17715.m1162(null, AbstractC4936.f19563) ? AbstractC1605.f5393 : AbstractC1605.f5392, str)) {
            return !m3245(40, "event", str) ? 2 : 0;
        }
        return 13;
    }

    /* JADX INFO: renamed from: ۦؔ */
    public final void m3230(InterfaceC3838 interfaceC3838, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC3838.mo1888(bundle);
        } catch (RemoteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(e, "Error returning long value to wrapper");
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final void m3231(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C5371 c5371 = (C5371) this.f18660;
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12021.m9434(c5371.f17731.m7145(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final Object m3232(Object obj, String str) {
        return "_ldl".equals(str) ? m3212(m3215(str), obj, true, false) : m3212(m3215(str), obj, false, false);
    }

    /* JADX INFO: renamed from: ۦّ */
    public final int m3233(String str) {
        if (!m3221("event param", str)) {
            return 3;
        }
        if (!m3234("event param", null, null, str)) {
            return 14;
        }
        C0515 c0515 = ((C5371) this.f18660).f17715;
        return !m3245(40, "event param", str) ? 3 : 0;
    }

    /* JADX INFO: renamed from: ۦٔ */
    public final boolean m3234(String str, String[] strArr, String[] strArr2, String str2) {
        C5371 c5371 = (C5371) this.f18660;
        if (str2 == null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12026.m9430(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(f5129[i])) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12026.m9434(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !m3189(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && m3189(str2, strArr2)) {
            return true;
        }
        C3610 c3612 = c5371.f17717;
        C5371.m9020(c3612);
        c3612.f12026.m9434(str, str2, "Name is reserved. Type, name");
        return false;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final boolean m3235(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) <= i) {
            return true;
        }
        C3610 c3610 = ((C5371) this.f18660).f17717;
        C5371.m9020(c3610);
        c3610.f12021.m9431("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        return false;
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m3236(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                C1512 c1512 = ((C5371) this.f18660).f17721;
                C5371.m9021(c1512);
                c1512.m3231(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: renamed from: ۦٝ */
    public final void m3237(InterfaceC3838 interfaceC3838, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC3838.mo1888(bundle);
        } catch (RemoteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(e, "Error returning boolean value to wrapper");
        }
    }

    /* JADX INFO: renamed from: ۦٞ */
    public final void m3238(InterfaceC3838 interfaceC3838, Bundle bundle) {
        try {
            interfaceC3838.mo1888(bundle);
        } catch (RemoteException e) {
            C3610 c3610 = ((C5371) this.f18660).f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9430(e, "Error returning bundle value to wrapper");
        }
    }

    /* JADX INFO: renamed from: ۦۖ */
    public final int m3239(String str) {
        if (!m3211("user property", str)) {
            return 6;
        }
        if (!m3234("user property", AbstractC1434.f4918, null, str)) {
            return 15;
        }
        C0515 c0515 = ((C5371) this.f18660).f17715;
        return !m3245(24, "user property", str) ? 6 : 0;
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m3240(String str, String str2, Bundle bundle, List list, boolean z) {
        int iM3233;
        int iM3213;
        list = list;
        C5371 c5371 = (C5371) this.f18660;
        C0515 c0515 = c5371.f17715;
        C3610 c3610 = c5371.f17717;
        C4004 c4004 = c5371.f17731;
        C1512 c1512 = ((C5371) c0515.f18660).f17721;
        C5371.m9021(c1512);
        int i = true != c1512.m3227(231100000) ? 0 : 35;
        int i2 = 0;
        boolean z2 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iM3233 = !z ? m3233(str3) : 0;
                if (iM3233 == 0) {
                    iM3233 = m3222(str3);
                }
            } else {
                iM3233 = 0;
            }
            if (iM3233 != 0) {
                m3210(bundle, iM3233, str3, iM3233 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (m3195(bundle.get(str3))) {
                    C5371.m9020(c3610);
                    c3610.f12021.m9431("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iM3213 = 22;
                } else {
                    iM3213 = m3213(str, str3, bundle.get(str3), bundle, list, z, false);
                }
                if (iM3213 != 0 && !"_ev".equals(str3)) {
                    m3210(bundle, iM3213, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (m3196(str3) && !m3189(str3, AbstractC4009.f13370)) {
                    i2++;
                    if (!m3227(231100000)) {
                        C5371.m9020(c3610);
                        c3610.f12026.m9434(c4004.m7146(str), c4004.m7143(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        m3201(23, bundle);
                        bundle.remove(str3);
                    } else if (i2 > i) {
                        if (!z2) {
                            C5371.m9020(c3610);
                            C5590 c5590 = c3610.f12026;
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                            sb.append("Item can't contain more than ");
                            sb.append(i);
                            sb.append(" item-scoped custom params");
                            c5590.m9434(c4004.m7146(str), c4004.m7143(bundle), sb.toString());
                        }
                        m3201(28, bundle);
                        bundle.remove(str3);
                        z2 = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۜ */
    public final long m3241() {
        long j;
        Object e;
        Integer num;
        mo6517();
        C5371 c5371 = (C5371) this.f18660;
        C1968 c1968M9029 = c5371.m9029();
        C3610 c3610 = c5371.f17717;
        Integer num2 = null;
        if (!m3192((String) AbstractC4936.f16320.m4592(null), c1968M9029.m3854())) {
            return 0L;
        }
        int i = Build.VERSION.SDK_INT;
        boolean zBooleanValue = false;
        if (i < 30) {
            j = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j = 8;
        } else {
            j = ((i < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000)) < ((Integer) AbstractC4936.f16337.m4592(null)).intValue() ? 16L : 0L;
        }
        if (!m3216("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j |= 2;
        }
        if (j == 0) {
            if (this.f5135 != null) {
                zBooleanValue = this.f5135.booleanValue();
            } else {
                C5424 c5424M3203 = m3203();
                if (c5424M3203 != null) {
                    try {
                        num = (Integer) c5424M3203.m9097().get(10000L, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                num2 = num;
                                C5371.m9020(c3610);
                                c3610.f12022.m9430(e, "Measurement manager api exception");
                                this.f5135 = Boolean.FALSE;
                                num = num2;
                            } catch (CancellationException e3) {
                                e = e3;
                                num2 = num;
                                C5371.m9020(c3610);
                                c3610.f12022.m9430(e, "Measurement manager api exception");
                                this.f5135 = Boolean.FALSE;
                                num = num2;
                            } catch (ExecutionException e4) {
                                e = e4;
                                num2 = num;
                                C5371.m9020(c3610);
                                c3610.f12022.m9430(e, "Measurement manager api exception");
                                this.f5135 = Boolean.FALSE;
                                num = num2;
                            } catch (TimeoutException e5) {
                                e = e5;
                                num2 = num;
                                C5371.m9020(c3610);
                                c3610.f12022.m9430(e, "Measurement manager api exception");
                                this.f5135 = Boolean.FALSE;
                                num = num2;
                            }
                        }
                        this.f5135 = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e6) {
                        e = e6;
                    }
                    C5371.m9020(c3610);
                    c3610.f12023.m9430(num, "Measurement manager api status result");
                    zBooleanValue = this.f5135.booleanValue();
                }
            }
            if (!zBooleanValue) {
                j = 64;
            }
        }
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public final int m3242() {
        Integer numValueOf = this.f5136;
        if (numValueOf == null) {
            C5371 c5371 = (C5371) this.f18660;
            C0600 c0600 = C0600.f2225;
            Context context = c5371.f17739;
            c0600.getClass();
            int i = AbstractC2292.f7616;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            numValueOf = Integer.valueOf(i2 / 1000);
            this.f5136 = numValueOf;
        }
        return numValueOf.intValue();
    }

    /* JADX INFO: renamed from: ۦۢ */
    public final Bundle m3243(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        C5371 c5371 = (C5371) this.f18660;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter2 = uri.getQueryParameter("utm_campaign");
                    queryParameter3 = uri.getQueryParameter("utm_source");
                    queryParameter4 = uri.getQueryParameter("utm_medium");
                    queryParameter5 = uri.getQueryParameter("gclid");
                    queryParameter6 = uri.getQueryParameter("gbraid");
                    queryParameter7 = uri.getQueryParameter("utm_id");
                    queryParameter8 = uri.getQueryParameter("dclid");
                    queryParameter9 = uri.getQueryParameter("srsltid");
                    queryParameter = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (!TextUtils.isEmpty(queryParameter2) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5) || !TextUtils.isEmpty(queryParameter6) || !TextUtils.isEmpty(queryParameter7) || !TextUtils.isEmpty(queryParameter8) || !TextUtils.isEmpty(queryParameter9) || !TextUtils.isEmpty(queryParameter)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("campaign", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("source", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("medium", queryParameter4);
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("gclid", queryParameter5);
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("gbraid", queryParameter6);
                    }
                    String queryParameter10 = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter10)) {
                        bundle.putString("gad_source", queryParameter10);
                    }
                    String queryParameter11 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter11)) {
                        bundle.putString("term", queryParameter11);
                    }
                    String queryParameter12 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter12)) {
                        bundle.putString("content", queryParameter12);
                    }
                    String queryParameter13 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter13)) {
                        bundle.putString("aclid", queryParameter13);
                    }
                    String queryParameter14 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter14)) {
                        bundle.putString("cp1", queryParameter14);
                    }
                    String queryParameter15 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter15)) {
                        bundle.putString("anid", queryParameter15);
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("campaign_id", queryParameter7);
                    }
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("dclid", queryParameter8);
                    }
                    String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter16)) {
                        bundle.putString("source_platform", queryParameter16);
                    }
                    String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter17)) {
                        bundle.putString("creative_format", queryParameter17);
                    }
                    String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter18)) {
                        bundle.putString("marketing_tactic", queryParameter18);
                    }
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("srsltid", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("sfmc_id", queryParameter);
                    }
                    for (String str : uri.getQueryParameterNames()) {
                        if (str.startsWith("gad_")) {
                            String queryParameter19 = uri.getQueryParameter(str);
                            if (!TextUtils.isEmpty(queryParameter19)) {
                                bundle.putString(str, queryParameter19);
                            }
                        }
                    }
                    if (c5371.f17715.m1162(null, AbstractC4936.f19561)) {
                        String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        c5371.f17715.getClass();
                        int iMax = Math.max(500, 256);
                        if (string.length() > iMax) {
                            string = m3198(iMax - 3, string, true);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            bundle.putString("deep_link_url", string);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                C3610 c3610 = c5371.f17717;
                C5371.m9020(c3610);
                c3610.f12022.m9430(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۤ */
    public final SecureRandom m3244() {
        mo6517();
        SecureRandom secureRandom = this.f5132;
        if (secureRandom != null) {
            return secureRandom;
        }
        SecureRandom secureRandom2 = new SecureRandom();
        this.f5132 = secureRandom2;
        return secureRandom2;
    }

    /* JADX INFO: renamed from: ۦۦ */
    public final boolean m3245(int i, String str, String str2) {
        C5371 c5371 = (C5371) this.f18660;
        if (str2 == null) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12026.m9430(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        C3610 c3611 = c5371.f17717;
        C5371.m9020(c3611);
        c3611.f12026.m9431("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    /* JADX INFO: renamed from: ۦۧ */
    public final boolean m3246(Context context, String str) {
        Signature[] signatureArr;
        C5371 c5371 = (C5371) this.f18660;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoM564 = C3866.m6899(context).m564(64, str);
            if (packageInfoM564 == null || (signatureArr = packageInfoM564.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            C3610 c3610 = c5371.f17717;
            C5371.m9020(c3610);
            c3610.f12020.m9430(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12020.m9430(e2, "Error obtaining certificate");
            return true;
        }
    }
}
