package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: ۦۦُٖؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5782 implements InterfaceC3586 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Context f19051;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC5375 f19052;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC5375 f19053;

    /* JADX INFO: renamed from: ۥۗ */
    public final ConnectivityManager f19054;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5086 f19055;

    /* JADX INFO: renamed from: ۦؑ */
    public final URL f19056;

    public C5782(Context context, InterfaceC5375 interfaceC5375, InterfaceC5375 interfaceC5376) {
        C0639 c0639 = new C0639();
        C3563 c3563 = C3563.f11799;
        c0639.m1457(AbstractC5220.class, c3563);
        c0639.m1457(C1134.class, c3563);
        C1163 c1163 = C1163.f4037;
        c0639.m1457(AbstractC4622.class, c1163);
        c0639.m1457(C3653.class, c1163);
        C1475 c1475 = C1475.f5019;
        c0639.m1457(AbstractC1289.class, c1475);
        c0639.m1457(C2134.class, c1475);
        C1881 c1881 = C1881.f6242;
        c0639.m1457(AbstractC0410.class, c1881);
        c0639.m1457(C1081.class, c1881);
        C4675 c4675 = C4675.f15404;
        c0639.m1457(AbstractC4273.class, c4675);
        c0639.m1457(C4583.class, c4675);
        C0875 c0875 = C0875.f3204;
        c0639.m1457(AbstractC4258.class, c0875);
        c0639.m1457(C1688.class, c0875);
        C1482 c1482 = C1482.f5035;
        c0639.m1457(AbstractC1010.class, c1482);
        c0639.m1457(C3760.class, c1482);
        C5540 c5540 = C5540.f18292;
        c0639.m1457(AbstractC5769.class, c5540);
        c0639.m1457(C0663.class, c5540);
        C2878 c2878 = C2878.f9605;
        c0639.m1457(AbstractC2124.class, c2878);
        c0639.m1457(C0688.class, c2878);
        C2792 c2792 = C2792.f9339;
        c0639.m1457(AbstractC0134.class, c2792);
        c0639.m1457(C3648.class, c2792);
        c0639.f2395 = true;
        this.f19055 = new C5086(26, c0639);
        this.f19051 = context;
        this.f19054 = (ConnectivityManager) context.getSystemService("connectivity");
        this.f19056 = m9599(C3518.f11648);
        this.f19052 = interfaceC5376;
        this.f19053 = interfaceC5375;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static URL m9599(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC3761.m6628("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    /* JADX INFO: renamed from: ۥۣ */
    public final C3245 m9600(C3245 c3245) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.f19054.getActiveNetworkInfo();
        C2457 c2457M5958 = c3245.m5958();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) c2457M5958.f8208;
        if (map2 == null) {
            C1078.m2276("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        c2457M5958.m4589("model", Build.MODEL);
        c2457M5958.m4589("hardware", Build.HARDWARE);
        c2457M5958.m4589("device", Build.DEVICE);
        c2457M5958.m4589("product", Build.PRODUCT);
        c2457M5958.m4589("os-uild", Build.ID);
        c2457M5958.m4589("manufacturer", Build.MANUFACTURER);
        c2457M5958.m4589("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) c2457M5958.f8208;
        if (map3 == null) {
            C1078.m2276("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = EnumC3808.f12638;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) c2457M5958.f8208;
        if (map4 == null) {
            C1078.m2276("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = EnumC3476.f11553;
                subtype = 100;
            } else if (((EnumC3476) EnumC3476.f11553.get(subtype)) == null) {
            }
            map = (HashMap) c2457M5958.f8208;
            if (map != null) {
                C1078.m2276("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c2457M5958.m4589("country", Locale.getDefault().getCountry());
            c2457M5958.m4589("locale", Locale.getDefault().getLanguage());
            Context context = this.f19051;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            c2457M5958.m4589("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                C3133.m5800("CctTransportBackend", "Unable to find version code for package", e);
            }
            c2457M5958.m4589("application_build", Integer.toString(i2));
            return c2457M5958.m4587();
        }
        SparseArray sparseArray3 = EnumC3476.f11553;
        subtype = 0;
        map = (HashMap) c2457M5958.f8208;
        if (map != null) {
            C1078.m2276("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c2457M5958.m4589("country", Locale.getDefault().getCountry());
        c2457M5958.m4589("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f19051;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        c2457M5958.m4589("mcc_mnc", simOperator);
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c2457M5958.m4589("application_build", Integer.toString(i2));
        return c2457M5958.m4587();
    }
}
