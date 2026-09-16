package p000;

import android.app.Application;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦؘۗؑؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4985 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f16495;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f16496;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16497;

    public RunnableC4985(C5235 c5235, InterfaceC3838 interfaceC3838) {
        this.f16497 = 26;
        this.f16496 = interfaceC3838;
        Objects.requireNonNull(c5235);
        this.f16495 = c5235;
    }

    /* JADX INFO: renamed from: ۥؗ */
    private final void m8366() {
        C3517 c3517 = (C3517) this.f16495;
        synchronized (c3517.f11644) {
            ((InterfaceC2659) c3517.f11645).mo3987((C3580) this.f16496);
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    private final void m8367() {
        C3517 c3517 = (C3517) this.f16495;
        synchronized (c3517.f11644) {
            InterfaceC1463 interfaceC1463 = (InterfaceC1463) c3517.f11645;
            Exception excM6387 = ((C3580) this.f16496).m6387();
            AbstractC0487.m1047(excM6387);
            interfaceC1463.mo2243(excM6387);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a8 A[Catch: all -> 0x00a6, TryCatch #1 {all -> 0x00a6, blocks: (B:33:0x0088, B:35:0x008c, B:37:0x0090, B:42:0x009d, B:47:0x00a8, B:48:0x00b2), top: B:61:0x0088 }] */
    /* JADX INFO: renamed from: ۥۗ */
    private final void m8368() {
        boolean z;
        boolean z2;
        C1795 c1795 = (C1795) this.f16496;
        C3743 c3743 = (C3743) this.f16495;
        Object obj = c1795.f5993;
        if (obj == null) {
            return;
        }
        C0430 c0430 = (C0430) obj;
        try {
            byte[] bArr = (byte[]) c3743.f12466;
            C2955 c2955 = C2955.f9912;
            int i = AbstractC5529.f18251;
            C1454 c1454M3077 = C1454.m3077(bArr, C2955.f9911);
            boolean z3 = false;
            for (C0128 c0128 : c0430.f1546.f7234) {
                List listM3078 = c1454M3077.m3078();
                c0128.getClass();
                C4601 c4601 = C3001.f10092;
                c4601.getClass();
                if (listM3078 == null || listM3078.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = listM3078.iterator();
                    z = false;
                    while (it.hasNext()) {
                        C0417 c0417 = (C0417) c4601.f15183.get((String) it.next());
                        if (c0417 != null) {
                            C3001 c3001 = c0417.f1508;
                            if (c3001.f10099) {
                                C4752 c4752 = c3001.f10098;
                                if (c4752 != null && (c4752.f15687 || ((C2268) c4752.f15685).f7527 == 3 || c3001.f10100.m9131())) {
                                    synchronized (c3001) {
                                        try {
                                            C4752 c4753 = c3001.f10098;
                                            if (c4753 != null) {
                                                if (c4753.f15687) {
                                                    c3001.f10098 = null;
                                                    c3001.f10096.f1284.incrementAndGet();
                                                } else if ((((C2268) c4753.f15685).f7527 == 3) || c3001.f10100.m9131()) {
                                                    c3001.f10098 = null;
                                                    c3001.f10096.f1284.incrementAndGet();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            z |= z2;
                        }
                    }
                }
                if (z && !z3) {
                    c0430.f1547.mo3893();
                    z3 = true;
                }
            }
        } catch (C5463 unused) {
            c0430.getClass();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m8369() {
        InterfaceC0443 interfaceC0443;
        C4142 c4142;
        C3654 c3654 = ((C5021) this.f16495).f16618.f11988;
        String str = (String) this.f16496;
        synchronized (c3654.f12236) {
            try {
                C5789 c5789M6531 = c3654.m6531(str);
                interfaceC0443 = null;
                if (c5789M6531 != null) {
                    c4142 = c5789M6531.f19075;
                } else {
                    c4142 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4142 == null || AbstractC3831.m6874(C4628.f15275, c4142.f13791)) {
            return;
        }
        synchronized (((C5021) this.f16495).f16611) {
            ((C5021) this.f16495).f16613.put(AbstractC0993.m2155(c4142), c4142);
            C5021 c5021 = (C5021) this.f16495;
            C2391 c2391 = c5021.f16616;
            AbstractC2132 abstractC2132 = (AbstractC2132) c5021.f16617.f5057;
            String str2 = AbstractC3182.f10689;
            ((C5021) this.f16495).f16615.put(AbstractC0993.m2155(c4142), AbstractC2765.m5135(AbstractC4009.m7151(abstractC2132), null, 0, new C5416(c2391, c4142, c5021, interfaceC0443, 4), 3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:104:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:109:0x02e8 A[Catch: NotFoundException -> 0x02ed, TRY_LEAVE, TryCatch #4 {NotFoundException -> 0x02ed, blocks: (B:106:0x02d6, B:109:0x02e8), top: B:303:0x02d6 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:117:0x0304  */
    /* JADX WARN: Code duplicated, block: B:118:0x030f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0319  */
    /* JADX WARN: Code duplicated, block: B:124:0x032d A[EDGE_INSN: B:124:0x032d->B:125:0x032f BREAK  A[LOOP:0: B:119:0x0313->B:311:?]] */
    /* JADX WARN: Code duplicated, block: B:126:0x0331  */
    /* JADX WARN: Code duplicated, block: B:127:0x0338  */
    /* JADX WARN: Code duplicated, block: B:130:0x035f  */
    /* JADX WARN: Code duplicated, block: B:132:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x040b  */
    /* JADX WARN: Code duplicated, block: B:140:0x040d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0412  */
    /* JADX WARN: Code duplicated, block: B:146:0x041e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x0420  */
    /* JADX WARN: Code duplicated, block: B:148:0x0421 A[PHI: r13
  0x0421: PHI (r13v16 boolean) = (r13v10 boolean), (r13v9 boolean) binds: [B:147:0x0420, B:144:0x041b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x044a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0452  */
    /* JADX WARN: Code duplicated, block: B:154:0x0467  */
    /* JADX WARN: Code duplicated, block: B:157:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:162:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:163:0x04dc A[PHI: r28 r29 r30
  0x04dc: PHI (r28v2 ۦّٕ۠ؑ) = (r28v0 ۦّٕ۠ؑ), (r28v3 ۦّٕ۠ؑ) binds: [B:161:0x04c7, B:159:0x04aa] A[DONT_GENERATE, DONT_INLINE]
  0x04dc: PHI (r29v2 ۦُۣؓؖ) = (r29v0 ۦُۣؓؖ), (r29v3 ۦُۣؓؖ) binds: [B:161:0x04c7, B:159:0x04aa] A[DONT_GENERATE, DONT_INLINE]
  0x04dc: PHI (r30v2 ۥٗؒٔۛ) = (r30v0 ۥٗؒٔۛ), (r30v3 ۥٗؒٔۛ) binds: [B:161:0x04c7, B:159:0x04aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:165:0x04ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x050c  */
    /* JADX WARN: Code duplicated, block: B:178:0x0516  */
    /* JADX WARN: Code duplicated, block: B:181:0x0540  */
    /* JADX WARN: Code duplicated, block: B:184:0x0550  */
    /* JADX WARN: Code duplicated, block: B:187:0x056f  */
    /* JADX WARN: Code duplicated, block: B:189:0x057d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x059a  */
    /* JADX WARN: Code duplicated, block: B:197:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:199:0x05be  */
    /* JADX WARN: Code duplicated, block: B:203:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:206:0x0606  */
    /* JADX WARN: Code duplicated, block: B:211:0x0621  */
    /* JADX WARN: Code duplicated, block: B:213:0x0627  */
    /* JADX WARN: Code duplicated, block: B:215:0x0631  */
    /* JADX WARN: Code duplicated, block: B:216:0x063c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0646  */
    /* JADX WARN: Code duplicated, block: B:222:0x065c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0668  */
    /* JADX WARN: Code duplicated, block: B:229:0x0676  */
    /* JADX WARN: Code duplicated, block: B:232:0x068a  */
    /* JADX WARN: Code duplicated, block: B:233:0x068f  */
    /* JADX WARN: Code duplicated, block: B:235:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:237:0x06c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x0737  */
    /* JADX WARN: Code duplicated, block: B:250:0x0753  */
    /* JADX WARN: Code duplicated, block: B:253:0x075f  */
    /* JADX WARN: Code duplicated, block: B:262:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:264:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:265:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:267:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:271:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:275:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:277:0x0808  */
    /* JADX WARN: Code duplicated, block: B:279:0x0839  */
    /* JADX WARN: Code duplicated, block: B:282:0x084f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0861  */
    /* JADX WARN: Code duplicated, block: B:303:0x02d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0202  */
    /* JADX WARN: Code duplicated, block: B:74:0x0206  */
    /* JADX WARN: Code duplicated, block: B:75:0x021b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0226  */
    /* JADX WARN: Code duplicated, block: B:77:0x0231  */
    /* JADX WARN: Code duplicated, block: B:78:0x023c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0247  */
    /* JADX WARN: Code duplicated, block: B:80:0x0252  */
    /* JADX WARN: Code duplicated, block: B:81:0x025d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0271  */
    /* JADX WARN: Code duplicated, block: B:86:0x0272 A[Catch: IllegalStateException -> 0x0294, TryCatch #2 {IllegalStateException -> 0x0294, blocks: (B:83:0x0269, B:87:0x0278, B:91:0x0280, B:93:0x0284, B:86:0x0272), top: B:299:0x0269 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x027e  */
    /* JADX WARN: Code duplicated, block: B:90:0x027f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0284 A[Catch: IllegalStateException -> 0x0294, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0294, blocks: (B:83:0x0269, B:87:0x0278, B:91:0x0280, B:93:0x0284, B:86:0x0272), top: B:299:0x0269 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02b7  */
    /* JADX WARN: Type inference failed for: r0v26, types: [ۦٍؚؒۘ] */
    /* JADX INFO: renamed from: ۦؑ */
    private final void m8370() {
        String str;
        C3610 c3610;
        C3610 c3611;
        String installerPackageName;
        String string;
        String str2;
        int i;
        String str3;
        int iM9027;
        C5371 c5371;
        Bundle bundleM1154;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        C4666 c4666;
        Object obj;
        C5371 c5372;
        C3610 c3612;
        C5590 c5590;
        C5590 c5591;
        C5590 c5592;
        C5590 c5593;
        String strM3854;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final C5235 c5235;
        int iM8030;
        boolean zM1162;
        boolean z;
        C1405 c1405;
        C5211 c5211M7754;
        EnumC3687 enumC3687M1163;
        EnumC3687 enumC3687M1164;
        EnumC4635 enumC4635;
        EnumC3687 enumC3687;
        C5371 c5373;
        C5590 c5594;
        C1512 c1512;
        C5211 c5211;
        C5211 c5212;
        C5371 c5374;
        EnumC3687 enumC3687M1165;
        EnumC3687 enumC3687M1166;
        Boolean boolM1166;
        C4173 c4173;
        C3743 c3743;
        C5371 c5375;
        C1512 c1513;
        C1405 c1406;
        C3610 c3613;
        boolean zM9024;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        C0826 c0826;
        C5590 c5595;
        Context context;
        IntentFilter intentFilter;
        C0775 c0775;
        boolean z2;
        Context context2;
        Iterator it;
        String str4;
        C1512 c1514;
        String strM1934;
        Bundle bundle;
        C5371 c5376 = (C5371) this.f16495;
        C0540 c0540 = (C0540) this.f16496;
        C3644 c3644 = c5376.f17733;
        C3610 c3614 = c5376.f17717;
        C4474 c4474 = c5376.f17713;
        C1512 c1515 = c5376.f17721;
        C5371.m9020(c3644);
        c3644.mo6517();
        C0515 c0515 = c5376.f17715;
        ((C5371) c0515.f18660).getClass();
        C2753 c2753 = new C2753(c5376);
        ((C5371) c2753.f18660).f17738++;
        c2753.m505();
        c5376.f17729 = c2753;
        C1302 c1302 = c0540.f1941;
        long j2 = c1302 == null ? 0L : c1302.f4473;
        String string2 = (c1302 == null || (bundle = c1302.f4471) == null) ? "" : bundle.getString("runtime_google_app_id", "");
        long j3 = c0540.f1935;
        String str5 = "";
        C1968 c1968 = new C1968(c5376, j3, j2, string2);
        c1968.m7642();
        c5376.f17727 = c1968;
        C5403 c5403 = new C5403(c5376);
        c5403.m7642();
        c5376.f17716 = c5403;
        C5695 c5695 = new C5695(c5376);
        c5695.m7642();
        c5376.f17722 = c5695;
        boolean z3 = c1515.f911;
        C5371 c5377 = (C5371) c1515.f18660;
        if (z3) {
            C1078.m2276("Can't initialize twice");
            return;
        }
        c1515.mo6517();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                C3610 c3615 = ((C5371) c1515.f18660).f17717;
                C5371.m9020(c3615);
                c3615.f12022.m9432("Utils falling back to Random for random id");
            }
        }
        c1515.f5133.set(jNextLong);
        c5377.f17720.incrementAndGet();
        c1515.f911 = true;
        if (c4474.f911) {
            C1078.m2276("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = ((C5371) c4474.f18660).f17739.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        c4474.f14756 = sharedPreferences2;
        boolean z4 = sharedPreferences2.getBoolean("has_been_opened", false);
        c4474.f14762 = z4;
        if (!z4) {
            SharedPreferences.Editor editorEdit = c4474.f14756.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        long jMax2 = Math.max(0L, ((Long) AbstractC4936.f16307.m4592(null)).longValue());
        C3250 c3250 = new C3250();
        c3250.f10915 = c4474;
        AbstractC0487.m1090("health_monitor");
        AbstractC0487.m1088(jMax2 > 0);
        c3250.f10916 = jMax2;
        c4474.f14755 = c3250;
        ((C5371) c4474.f18660).f17720.incrementAndGet();
        c4474.f911 = true;
        C1968 c1969 = c5376.f17727;
        if (c1969.f14347) {
            C1078.m2276("Can't initialize twice");
            return;
        }
        C5371 c5378 = (C5371) c1969.f18660;
        C3610 c3616 = c5378.f17717;
        C3610 c3617 = c5378.f17717;
        C5371.m9020(c3616);
        c3616.f12023.m9434(Long.valueOf(c1969.f6515), Long.valueOf(c1969.f6512), "sdkVersion bundled with app, dynamiteVersion");
        Context context3 = c5378.f17739;
        String packageName = context3.getPackageName();
        PackageManager packageManager = context3.getPackageManager();
        String str6 = "Unknown";
        String str7 = "unknown";
        try {
            if (packageManager != null) {
                str = "Can't initialize twice";
                c3610 = c3614;
                c3611 = c3617;
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    C5371.m9020(c3611);
                    c3611.f12020.m9430(C3610.m6440(packageName), "Error retrieving app installer package name. appId");
                    installerPackageName = "unknown";
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = str5;
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        str7 = installerPackageName;
                        try {
                            str2 = packageInfo.versionName;
                            try {
                                i = packageInfo.versionCode;
                                packageManager = packageManager;
                                str3 = str7;
                            } catch (PackageManager.NameNotFoundException unused2) {
                                str6 = str2;
                                C5371.m9020(c3611);
                                c3611.f12020.m9434(C3610.m6440(packageName), string, "Error retrieving package info. appId, appName");
                                str2 = str6;
                                str3 = str7;
                                i = Integer.MIN_VALUE;
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                        }
                    } else {
                        str7 = installerPackageName;
                    }
                } catch (PackageManager.NameNotFoundException unused4) {
                    str7 = installerPackageName;
                    string = "Unknown";
                }
                c1969.f6507 = packageName;
                c1969.f6510 = str3;
                c1969.f6508 = str2;
                c1969.f6506 = i;
                c1969.f6516 = string;
                c1969.f6518 = 0L;
                iM9027 = c5378.m9027();
                if (iM9027 != 0) {
                    C5371.m9020(c3611);
                    c3611.f12023.m9432("App measurement collection enabled");
                } else if (iM9027 != 1) {
                    C5371.m9020(c3611);
                    c3611.f12016.m9432("App measurement deactivated via the manifest");
                } else if (iM9027 != 3) {
                    C5371.m9020(c3611);
                    c3611.f12016.m9432("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iM9027 != 4) {
                    C5371.m9020(c3611);
                    c3611.f12016.m9432("App measurement disabled via the manifest");
                } else if (iM9027 != 6) {
                    C5371.m9020(c3611);
                    c3611.f12021.m9432("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iM9027 != 7) {
                    C5371.m9020(c3611);
                    c3611.f12016.m9432("App measurement disabled via the global data collection setting");
                } else if (iM9027 != 8) {
                    C5371.m9020(c3611);
                    c3611.f12016.m9432("App measurement disabled");
                    C5371.m9020(c3611);
                    c3611.f12025.m9432("Invalid scion state in identity");
                } else {
                    C5371.m9020(c3611);
                    c3611.f12016.m9432("App measurement disabled due to denied storage consent");
                }
                c1969.f6505 = str5;
                strM1934 = c1969.f6503;
                if (!TextUtils.isEmpty(strM1934)) {
                    strM1934 = AbstractC0949.m1934(context3, c5378.f17734);
                }
                if (TextUtils.isEmpty(strM1934)) {
                    str5 = strM1934;
                }
                c1969.f6505 = str5;
                if (iM9027 == 0) {
                    C5371.m9020(c3611);
                    c3611.f12023.m9434(c1969.f6507, c1969.f6505, "App measurement enabled for app package, google app id");
                }
                c1969.f6511 = null;
                C0515 c0516 = c5378.f17715;
                c5371 = (C5371) c0516.f18660;
                AbstractC0487.m1090("analytics.safelisted_events");
                bundleM1154 = c0516.m1154();
                if (bundleM1154 == null) {
                    if (!bundleM1154.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleM1154.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        try {
                            stringArray = c5371.f17739.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = null;
                            } else {
                                listAsList = Arrays.asList(stringArray);
                            }
                        } catch (Resources.NotFoundException e) {
                            C3610 c3618 = c5371.f17717;
                            C5371.m9020(c3618);
                            c3618.f12020.m9430(e, "Failed to load string array from metadata: resource not found");
                        }
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        c1969.f6511 = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                c1969.f6511 = listAsList;
                                break;
                            } else {
                                str4 = (String) it.next();
                                c1514 = c5378.f17721;
                                C5371.m9021(c1514);
                            }
                        } while (c1514.m3211("safelisted event", str4));
                    } else {
                        C5371.m9020(c3611);
                        c3611.f12021.m9432("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        c1969.f6514 = AbstractC3933.m7083(context3) ? 1 : 0;
                    } else {
                        c1969.f6514 = 0;
                    }
                    ((C5371) c1969.f18660).f17720.incrementAndGet();
                    c1969.f14347 = true;
                    c4666 = new C4666(c5376);
                    obj = c4666.f18660;
                    c5372 = (C5371) obj;
                    c5372.f17738++;
                    c4666.m7642();
                    c5376.f17724 = c4666;
                    if (!c4666.f14347) {
                        C1078.m2276(str);
                        return;
                    }
                    c4666.f15370 = (JobScheduler) ((C5371) obj).f17739.getSystemService("jobscheduler");
                    c5372.f17720.incrementAndGet();
                    c4666.f14347 = true;
                    C5371.m9020(c3610);
                    c3612 = c3610;
                    c5590 = c3612.f12015;
                    c5591 = c3612.f12016;
                    c5592 = c3612.f12023;
                    c5593 = c3612.f12020;
                    c0515.m1160();
                    c5591.m9430(161000L, "App measurement initialized, version");
                    C5371.m9020(c3612);
                    c5591.m9432("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strM3854 = c1968.m3854();
                    if (c1515.m3206(strM3854, c0515.f1840)) {
                        C5371.m9020(c3612);
                        c5591.m9432("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        C5371.m9020(c3612);
                        c5591.m9432("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM3854)));
                    }
                    C5371.m9020(c3612);
                    c5590.m9432("Debug-level message logging enabled");
                    i2 = c5376.f17738;
                    atomicInteger = c5376.f17720;
                    if (i2 != atomicInteger.get()) {
                        C5371.m9020(c3612);
                        c5593.m9434(Integer.valueOf(c5376.f17738), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    c5376.f17728 = true;
                    j = c5376.f17723;
                    c5235 = c5376.f17709;
                    C5371.m9020(c3644);
                    c3644.mo6517();
                    C5371.m9022(c5376.f17724);
                    iM8030 = c5376.f17724.m8030();
                    C0237.m498();
                    zM1162 = c0515.m1162(null, AbstractC4936.f16258);
                    if (iM8030 == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zM1162) {
                        c1515.mo6517();
                        if (c1515.m3241() == 1) {
                            c1515.mo6517();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            c0775 = new C0775(c5377);
                            z2 = z;
                            context2 = c5377.f17739;
                            if (Build.VERSION.SDK_INT >= 33) {
                                context2.registerReceiver(c0775, intentFilter, null, null, 2);
                            } else {
                                context2.registerReceiver(c0775, intentFilter, null, null, 0);
                            }
                            C3610 c3619 = c5377.f17717;
                            C5371.m9020(c3619);
                            c3619.f12015.m9432("Registered app receiver");
                            if (z2) {
                                C5371.m9022(c5376.f17724);
                                c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            c1515.mo6517();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            c0775 = new C0775(c5377);
                            z2 = z;
                            context2 = c5377.f17739;
                            if (Build.VERSION.SDK_INT >= 33) {
                                context2.registerReceiver(c0775, intentFilter, null, null, 2);
                            } else {
                                context2.registerReceiver(c0775, intentFilter, null, null, 0);
                            }
                            C3610 c36110 = c5377.f17717;
                            C5371.m9020(c36110);
                            c36110.f12015.m9432("Registered app receiver");
                            if (z2) {
                                C5371.m9022(c5376.f17724);
                                c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                            }
                        }
                    } else if (z) {
                        z = true;
                        c1515.mo6517();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        c0775 = new C0775(c5377);
                        z2 = z;
                        context2 = c5377.f17739;
                        if (Build.VERSION.SDK_INT >= 33) {
                            context2.registerReceiver(c0775, intentFilter, null, null, 2);
                        } else {
                            context2.registerReceiver(c0775, intentFilter, null, null, 0);
                        }
                        C3610 c36111 = c5377.f17717;
                        C5371.m9020(c36111);
                        c36111.f12015.m9432("Registered app receiver");
                        if (z2) {
                            C5371.m9022(c5376.f17724);
                            c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                        }
                    }
                    c1405 = c4474.f14771;
                    c5211M7754 = c4474.m7754();
                    int i3 = c5211M7754.f17219;
                    enumC3687M1163 = c0515.m1163("google_analytics_default_allow_ad_storage", false);
                    enumC3687M1164 = c0515.m1163("google_analytics_default_allow_analytics_storage", false);
                    enumC4635 = EnumC4635.f15299;
                    enumC3687 = EnumC3687.f12307;
                    if (enumC3687M1163 == enumC3687 || enumC3687M1164 != enumC3687) {
                        c5373 = c5376;
                        c5594 = c5593;
                        c1512 = c1515;
                        if (C5211.m8812(-10, c4474.m7755().getInt("consent_source", 100))) {
                            EnumMap enumMap = new EnumMap(EnumC4635.class);
                            enumMap.put(EnumC4635.f15302, enumC3687M1163);
                            enumMap.put(enumC4635, enumC3687M1164);
                            c5211 = new C5211(enumMap, -10);
                        }
                        if (c5211 != null) {
                            C5371.m9023(c5235);
                            c5235.m8864(c5211, true);
                            c5212 = c5211;
                        } else {
                            c5212 = c5211M7754;
                        }
                        C5371.m9023(c5235);
                        c5374 = (C5371) c5235.f18660;
                        c5235.m8870(c5212);
                        c4474.mo6517();
                        int i4 = C5800.m9610(c4474.m7755().getString("dma_consent_settings", null)).f19115;
                        enumC3687M1165 = c0515.m1163("google_analytics_default_allow_ad_personalization_signals", true);
                        if (enumC3687M1165 != enumC3687) {
                            C5371.m9020(c3612);
                            c5592.m9430(enumC3687M1165, "Default ad personalization consent from Manifest");
                        }
                        enumC3687M1166 = c0515.m1163("google_analytics_default_allow_ad_user_data", true);
                        if (enumC3687M1166 == enumC3687 && C5211.m8812(-10, i4)) {
                            C5371.m9023(c5235);
                            EnumMap enumMap2 = new EnumMap(EnumC4635.class);
                            enumMap2.put(EnumC4635.f15300, enumC3687M1166);
                            c5235.m8880(new C5800(enumMap2, -10, (Boolean) null, (String) null), true);
                        } else if (!TextUtils.isEmpty(c5373.m9029().m3855()) && (i4 == 0 || i4 == 30)) {
                            C5371.m9023(c5235);
                            c5235.m8880(new C5800((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolM1166 = c0515.m1166("google_analytics_tcf_data_enabled");
                        if (boolM1166 != null || boolM1166.booleanValue()) {
                            C5371.m9020(c3612);
                            c5590.m9432("TCF client enabled.");
                            C5371.m9023(c5235);
                            c5235.mo6517();
                            C3610 c36112 = c5374.f17717;
                            C5371.m9020(c36112);
                            c36112.f12015.m9432("Register tcfPrefChangeListener.");
                            if (c5235.f17280 == null) {
                                c5235.f17278 = new C0826(c5235, c5374, 2);
                                c5235.f17280 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ۦٍؚؒۘ
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        C5235 c5236 = c5235;
                                        c5236.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            C3610 c36113 = ((C5371) c5236.f18660).f17717;
                                            C5371.m9020(c36113);
                                            c36113.f12023.m9432("IABTCF_TCString change picked up in listener.");
                                            C0826 c0827 = c5236.f17278;
                                            AbstractC0487.m1047(c0827);
                                            c0827.m2199(500L);
                                        }
                                    }
                                };
                            }
                            C4474 c4475 = c5374.f17713;
                            C5371.m9021(c4475);
                            c4475.m7756().registerOnSharedPreferenceChangeListener(c5235.f17280);
                            C5371.m9023(c5235);
                            c5235.m8871();
                        }
                        c4173 = c4474.f14759;
                        if (c4173.m7371() == 0) {
                            C5371.m9020(c3612);
                            c5592.m9430(Long.valueOf(j), "Persisting first open");
                            c4173.m7370(j);
                        }
                        C5371.m9023(c5235);
                        c3743 = c5235.f17273;
                        if (c3743.m6586() && c3743.m6582()) {
                            C4474 c4476 = ((C5371) c3743.f12466).f17713;
                            C5371.m9021(c4476);
                            c4476.f14768.m2971(null);
                        }
                        if (c5373.m9025()) {
                            c5375 = c5373;
                            c1513 = c1512;
                            if (TextUtils.isEmpty(c5375.m9029().m3855())) {
                                c1406 = c1405;
                            } else {
                                String strM3855 = c5375.m9029().m3855();
                                c4474.mo6517();
                                String string3 = c4474.m7755().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strM3855);
                                boolean zIsEmpty2 = TextUtils.isEmpty(string3);
                                if (!zIsEmpty || zIsEmpty2) {
                                    c1406 = c1405;
                                } else {
                                    AbstractC0487.m1047(strM3855);
                                    if (strM3855.equals(string3)) {
                                        c1406 = c1405;
                                    } else {
                                        C5371.m9020(c3612);
                                        c5591.m9432("Rechecking which service to use due to a GMP App Id change");
                                        c4474.mo6517();
                                        c4474.mo6517();
                                        Boolean boolValueOf = c4474.m7755().contains("measurement_enabled") ? Boolean.valueOf(c4474.m7755().getBoolean("measurement_enabled", true)) : null;
                                        SharedPreferences.Editor editorEdit2 = c4474.m7755().edit();
                                        editorEdit2.clear();
                                        editorEdit2.apply();
                                        if (boolValueOf != null) {
                                            c4474.mo6517();
                                            SharedPreferences.Editor editorEdit3 = c4474.m7755().edit();
                                            editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                            editorEdit3.apply();
                                        }
                                        c5375.m9026().m9084();
                                        c5375.f17722.m9510();
                                        c5375.f17722.m9511();
                                        c4173.m7370(j);
                                        c1406 = c1405;
                                        c1406.m2971(null);
                                    }
                                }
                                String strM3856 = c5375.m9029().m3855();
                                c4474.mo6517();
                                SharedPreferences.Editor editorEdit4 = c4474.m7755().edit();
                                editorEdit4.putString("gmp_app_id", strM3856);
                                editorEdit4.apply();
                            }
                            if (!c4474.m7754().m8815(enumC4635)) {
                                c1406.m2971(null);
                            }
                            C5371.m9023(c5235);
                            c5235.f17284.set(c1406.m2974());
                            try {
                                c5377.f17739.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            } catch (ClassNotFoundException unused5) {
                                C1405 c1407 = c4474.f14766;
                                if (!TextUtils.isEmpty(c1407.m2974())) {
                                    C5371.m9020(c3612);
                                    c3613 = c3612;
                                    c3613.f12022.m9432("Remote config removed with active feature rollouts");
                                    c1407.m2971(null);
                                }
                                if (!TextUtils.isEmpty(c5375.m9029().m3855())) {
                                    zM9024 = c5375.m9024();
                                    sharedPreferences = c4474.f14756;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        c4474.m7752(!zM9024);
                                    }
                                    if (zM9024) {
                                        C5371.m9023(c5235);
                                        c5235.m8866();
                                    }
                                    C4423 c4423 = c5375.f17735;
                                    C5371.m9023(c4423);
                                    c4423.f14590.m6584();
                                    c5375.m9028().m9519(new AtomicReference());
                                    c5375.m9028().m9521(c4474.f14752.m3130());
                                }
                                C0237.m498();
                                if (c0515.m1162(null, AbstractC4936.f16258)) {
                                    c1513.mo6517();
                                    if (c1513.m3241() == 1) {
                                        long jIntValue = ((Integer) AbstractC4936.f16352.m4592(null)).intValue();
                                        long jNextInt = new Random().nextInt(5000);
                                        c5375.f17719.getClass();
                                        jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            C5371.m9020(c3613);
                                            c5592.m9430(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        C5371.m9023(c5235);
                                        c5235.mo6517();
                                        c0826 = c5235.f17268;
                                        if (c0826 == null) {
                                            c0826 = new C0826(c5235, c5374, 0);
                                            c5235.f17268 = c0826;
                                        }
                                        c0826.m2199(jMax);
                                    }
                                }
                                c4474.f14754.m8174(true);
                            }
                            c3613 = c3612;
                            if (!TextUtils.isEmpty(c5375.m9029().m3855())) {
                                zM9024 = c5375.m9024();
                                sharedPreferences = c4474.f14756;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains && !c0515.m1157()) {
                                    c4474.m7752(!zM9024);
                                }
                                if (zM9024) {
                                    C5371.m9023(c5235);
                                    c5235.m8866();
                                }
                                C4423 c4424 = c5375.f17735;
                                C5371.m9023(c4424);
                                c4424.f14590.m6584();
                                c5375.m9028().m9519(new AtomicReference());
                                c5375.m9028().m9521(c4474.f14752.m3130());
                            }
                        } else {
                            if (c5373.m9024()) {
                                c1513 = c1512;
                                if (c1513.m3216("android.permission.INTERNET")) {
                                    c5595 = c5594;
                                } else {
                                    C5371.m9020(c3612);
                                    c5595 = c5594;
                                    c5595.m9432("App is missing INTERNET permission");
                                }
                                if (!c1513.m3216("android.permission.ACCESS_NETWORK_STATE")) {
                                    C5371.m9020(c3612);
                                    c5595.m9432("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                c5375 = c5373;
                                context = c5375.f17739;
                                if (!C3866.m6899(context).m563() && !c0515.m1158()) {
                                    if (!C1512.m3186(context)) {
                                        C5371.m9020(c3612);
                                        c5595.m9432("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!C1512.m3199(context)) {
                                        C5371.m9020(c3612);
                                        c5595.m9432("AppMeasurementService not registered/enabled");
                                    }
                                }
                                C5371.m9020(c3612);
                                c5595.m9432("Uploading is not possible. App measurement disabled");
                            } else {
                                c5375 = c5373;
                                c1513 = c1512;
                            }
                            c3613 = c3612;
                        }
                        C0237.m498();
                        if (c0515.m1162(null, AbstractC4936.f16258)) {
                            c1513.mo6517();
                            if (c1513.m3241() == 1) {
                                long jIntValue2 = ((Integer) AbstractC4936.f16352.m4592(null)).intValue();
                                long jNextInt2 = new Random().nextInt(5000);
                                c5375.f17719.getClass();
                                jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    C5371.m9020(c3613);
                                    c5592.m9430(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                C5371.m9023(c5235);
                                c5235.mo6517();
                                c0826 = c5235.f17268;
                                if (c0826 == null) {
                                    c0826 = new C0826(c5235, c5374, 0);
                                    c5235.f17268 = c0826;
                                }
                                c0826.m2199(jMax);
                            }
                        }
                        c4474.f14754.m8174(true);
                    }
                    c5373 = c5376;
                    c5594 = c5593;
                    c1512 = c1515;
                    if (!TextUtils.isEmpty(c5373.m9029().m3855()) && (i3 == 0 || i3 == 30 || i3 == 10 || i3 == 40)) {
                        C5371.m9023(c5235);
                        c5235.m8864(new C5211(-10), false);
                    }
                    c5211 = null;
                    if (c5211 != null) {
                        C5371.m9023(c5235);
                        c5235.m8864(c5211, true);
                        c5212 = c5211;
                    } else {
                        c5212 = c5211M7754;
                    }
                    C5371.m9023(c5235);
                    c5374 = (C5371) c5235.f18660;
                    c5235.m8870(c5212);
                    c4474.mo6517();
                    int i5 = C5800.m9610(c4474.m7755().getString("dma_consent_settings", null)).f19115;
                    enumC3687M1165 = c0515.m1163("google_analytics_default_allow_ad_personalization_signals", true);
                    if (enumC3687M1165 != enumC3687) {
                        C5371.m9020(c3612);
                        c5592.m9430(enumC3687M1165, "Default ad personalization consent from Manifest");
                    }
                    enumC3687M1166 = c0515.m1163("google_analytics_default_allow_ad_user_data", true);
                    if (enumC3687M1166 == enumC3687) {
                        if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                            C5371.m9023(c5235);
                            c5235.m8880(new C5800((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                        C5371.m9023(c5235);
                        c5235.m8880(new C5800((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolM1166 = c0515.m1166("google_analytics_tcf_data_enabled");
                    if (boolM1166 != null) {
                        C5371.m9020(c3612);
                        c5590.m9432("TCF client enabled.");
                        C5371.m9023(c5235);
                        c5235.mo6517();
                        C3610 c36113 = c5374.f17717;
                        C5371.m9020(c36113);
                        c36113.f12015.m9432("Register tcfPrefChangeListener.");
                        if (c5235.f17280 == null) {
                            c5235.f17278 = new C0826(c5235, c5374, 2);
                            c5235.f17280 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ۦٍؚؒۘ
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    C5235 c5236 = c5235;
                                    c5236.getClass();
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        C3610 c36114 = ((C5371) c5236.f18660).f17717;
                                        C5371.m9020(c36114);
                                        c36114.f12023.m9432("IABTCF_TCString change picked up in listener.");
                                        C0826 c0827 = c5236.f17278;
                                        AbstractC0487.m1047(c0827);
                                        c0827.m2199(500L);
                                    }
                                }
                            };
                        }
                        C4474 c4477 = c5374.f17713;
                        C5371.m9021(c4477);
                        c4477.m7756().registerOnSharedPreferenceChangeListener(c5235.f17280);
                        C5371.m9023(c5235);
                        c5235.m8871();
                    } else {
                        C5371.m9020(c3612);
                        c5590.m9432("TCF client enabled.");
                        C5371.m9023(c5235);
                        c5235.mo6517();
                        C3610 c36114 = c5374.f17717;
                        C5371.m9020(c36114);
                        c36114.f12015.m9432("Register tcfPrefChangeListener.");
                        if (c5235.f17280 == null) {
                            c5235.f17278 = new C0826(c5235, c5374, 2);
                            c5235.f17280 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ۦٍؚؒۘ
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    C5235 c5236 = c5235;
                                    c5236.getClass();
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        C3610 c36115 = ((C5371) c5236.f18660).f17717;
                                        C5371.m9020(c36115);
                                        c36115.f12023.m9432("IABTCF_TCString change picked up in listener.");
                                        C0826 c0827 = c5236.f17278;
                                        AbstractC0487.m1047(c0827);
                                        c0827.m2199(500L);
                                    }
                                }
                            };
                        }
                        C4474 c4478 = c5374.f17713;
                        C5371.m9021(c4478);
                        c4478.m7756().registerOnSharedPreferenceChangeListener(c5235.f17280);
                        C5371.m9023(c5235);
                        c5235.m8871();
                    }
                    c4173 = c4474.f14759;
                    if (c4173.m7371() == 0) {
                        C5371.m9020(c3612);
                        c5592.m9430(Long.valueOf(j), "Persisting first open");
                        c4173.m7370(j);
                    }
                    C5371.m9023(c5235);
                    c3743 = c5235.f17273;
                    if (c3743.m6586()) {
                        C4474 c4479 = ((C5371) c3743.f12466).f17713;
                        C5371.m9021(c4479);
                        c4479.f14768.m2971(null);
                    }
                    if (c5373.m9025()) {
                        if (c5373.m9024()) {
                            c1513 = c1512;
                            if (c1513.m3216("android.permission.INTERNET")) {
                                C5371.m9020(c3612);
                                c5595 = c5594;
                                c5595.m9432("App is missing INTERNET permission");
                            } else {
                                c5595 = c5594;
                            }
                            if (!c1513.m3216("android.permission.ACCESS_NETWORK_STATE")) {
                                C5371.m9020(c3612);
                                c5595.m9432("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            c5375 = c5373;
                            context = c5375.f17739;
                            if (!C3866.m6899(context).m563()) {
                                if (!C1512.m3186(context)) {
                                    C5371.m9020(c3612);
                                    c5595.m9432("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!C1512.m3199(context)) {
                                    C5371.m9020(c3612);
                                    c5595.m9432("AppMeasurementService not registered/enabled");
                                }
                            }
                            C5371.m9020(c3612);
                            c5595.m9432("Uploading is not possible. App measurement disabled");
                        } else {
                            c5375 = c5373;
                            c1513 = c1512;
                        }
                        c3613 = c3612;
                    } else {
                        c5375 = c5373;
                        c1513 = c1512;
                        if (TextUtils.isEmpty(c5375.m9029().m3855())) {
                            String strM3857 = c5375.m9029().m3855();
                            c4474.mo6517();
                            String string4 = c4474.m7755().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strM3857);
                            boolean zIsEmpty3 = TextUtils.isEmpty(string4);
                            if (zIsEmpty) {
                                c1406 = c1405;
                            } else {
                                c1406 = c1405;
                            }
                            String strM3858 = c5375.m9029().m3855();
                            c4474.mo6517();
                            SharedPreferences.Editor editorEdit5 = c4474.m7755().edit();
                            editorEdit5.putString("gmp_app_id", strM3858);
                            editorEdit5.apply();
                        } else {
                            c1406 = c1405;
                        }
                        if (!c4474.m7754().m8815(enumC4635)) {
                            c1406.m2971(null);
                        }
                        C5371.m9023(c5235);
                        c5235.f17284.set(c1406.m2974());
                        c5377.f17739.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        c3613 = c3612;
                        if (!TextUtils.isEmpty(c5375.m9029().m3855())) {
                            zM9024 = c5375.m9024();
                            sharedPreferences = c4474.f14756;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                c4474.m7752(!zM9024);
                            }
                            if (zM9024) {
                                C5371.m9023(c5235);
                                c5235.m8866();
                            }
                            C4423 c4425 = c5375.f17735;
                            C5371.m9023(c4425);
                            c4425.f14590.m6584();
                            c5375.m9028().m9519(new AtomicReference());
                            c5375.m9028().m9521(c4474.f14752.m3130());
                        }
                    }
                    C0237.m498();
                    if (c0515.m1162(null, AbstractC4936.f16258)) {
                        c1513.mo6517();
                        if (c1513.m3241() == 1) {
                            long jIntValue3 = ((Integer) AbstractC4936.f16352.m4592(null)).intValue();
                            long jNextInt3 = new Random().nextInt(5000);
                            c5375.f17719.getClass();
                            jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                C5371.m9020(c3613);
                                c5592.m9430(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            C5371.m9023(c5235);
                            c5235.mo6517();
                            c0826 = c5235.f17268;
                            if (c0826 == null) {
                                c0826 = new C0826(c5235, c5374, 0);
                                c5235.f17268 = c0826;
                            }
                            c0826.m2199(jMax);
                        }
                    }
                    c4474.f14754.m8174(true);
                }
                C3610 c36115 = c5371.f17717;
                C5371.m9020(c36115);
                c36115.f12020.m9432("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = c5371.f17739.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(stringArray);
                    }
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    c1969.f6511 = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            c1969.f6511 = listAsList;
                            break;
                        } else {
                            str4 = (String) it.next();
                            c1514 = c5378.f17721;
                            C5371.m9021(c1514);
                        }
                    } while (c1514.m3211("safelisted event", str4));
                } else {
                    C5371.m9020(c3611);
                    c3611.f12021.m9432("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    c1969.f6514 = AbstractC3933.m7083(context3) ? 1 : 0;
                } else {
                    c1969.f6514 = 0;
                }
                ((C5371) c1969.f18660).f17720.incrementAndGet();
                c1969.f14347 = true;
                c4666 = new C4666(c5376);
                obj = c4666.f18660;
                c5372 = (C5371) obj;
                c5372.f17738++;
                c4666.m7642();
                c5376.f17724 = c4666;
                if (!c4666.f14347) {
                    C1078.m2276(str);
                    return;
                }
                c4666.f15370 = (JobScheduler) ((C5371) obj).f17739.getSystemService("jobscheduler");
                c5372.f17720.incrementAndGet();
                c4666.f14347 = true;
                C5371.m9020(c3610);
                c3612 = c3610;
                c5590 = c3612.f12015;
                c5591 = c3612.f12016;
                c5592 = c3612.f12023;
                c5593 = c3612.f12020;
                c0515.m1160();
                c5591.m9430(161000L, "App measurement initialized, version");
                C5371.m9020(c3612);
                c5591.m9432("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strM3854 = c1968.m3854();
                if (c1515.m3206(strM3854, c0515.f1840)) {
                    C5371.m9020(c3612);
                    c5591.m9432("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    C5371.m9020(c3612);
                    c5591.m9432("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM3854)));
                }
                C5371.m9020(c3612);
                c5590.m9432("Debug-level message logging enabled");
                i2 = c5376.f17738;
                atomicInteger = c5376.f17720;
                if (i2 != atomicInteger.get()) {
                    C5371.m9020(c3612);
                    c5593.m9434(Integer.valueOf(c5376.f17738), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                c5376.f17728 = true;
                j = c5376.f17723;
                c5235 = c5376.f17709;
                C5371.m9020(c3644);
                c3644.mo6517();
                C5371.m9022(c5376.f17724);
                iM8030 = c5376.f17724.m8030();
                C0237.m498();
                zM1162 = c0515.m1162(null, AbstractC4936.f16258);
                if (iM8030 == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zM1162) {
                    c1515.mo6517();
                    if (c1515.m3241() == 1) {
                        c1515.mo6517();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        c0775 = new C0775(c5377);
                        z2 = z;
                        context2 = c5377.f17739;
                        if (Build.VERSION.SDK_INT >= 33) {
                            context2.registerReceiver(c0775, intentFilter, null, null, 2);
                        } else {
                            context2.registerReceiver(c0775, intentFilter, null, null, 0);
                        }
                        C3610 c36116 = c5377.f17717;
                        C5371.m9020(c36116);
                        c36116.f12015.m9432("Registered app receiver");
                        if (z2) {
                            C5371.m9022(c5376.f17724);
                            c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        c1515.mo6517();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        c0775 = new C0775(c5377);
                        z2 = z;
                        context2 = c5377.f17739;
                        if (Build.VERSION.SDK_INT >= 33) {
                            context2.registerReceiver(c0775, intentFilter, null, null, 2);
                        } else {
                            context2.registerReceiver(c0775, intentFilter, null, null, 0);
                        }
                        C3610 c36117 = c5377.f17717;
                        C5371.m9020(c36117);
                        c36117.f12015.m9432("Registered app receiver");
                        if (z2) {
                            C5371.m9022(c5376.f17724);
                            c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                        }
                    }
                } else if (z) {
                    z = true;
                    c1515.mo6517();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    c0775 = new C0775(c5377);
                    z2 = z;
                    context2 = c5377.f17739;
                    if (Build.VERSION.SDK_INT >= 33) {
                        context2.registerReceiver(c0775, intentFilter, null, null, 2);
                    } else {
                        context2.registerReceiver(c0775, intentFilter, null, null, 0);
                    }
                    C3610 c36118 = c5377.f17717;
                    C5371.m9020(c36118);
                    c36118.f12015.m9432("Registered app receiver");
                    if (z2) {
                        C5371.m9022(c5376.f17724);
                        c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                    }
                }
                c1405 = c4474.f14771;
                c5211M7754 = c4474.m7754();
                int i6 = c5211M7754.f17219;
                enumC3687M1163 = c0515.m1163("google_analytics_default_allow_ad_storage", false);
                enumC3687M1164 = c0515.m1163("google_analytics_default_allow_analytics_storage", false);
                enumC4635 = EnumC4635.f15299;
                enumC3687 = EnumC3687.f12307;
                if (enumC3687M1163 == enumC3687) {
                    c5373 = c5376;
                    c5594 = c5593;
                    c1512 = c1515;
                    if (C5211.m8812(-10, c4474.m7755().getInt("consent_source", 100))) {
                        EnumMap enumMap3 = new EnumMap(EnumC4635.class);
                        enumMap3.put(EnumC4635.f15302, enumC3687M1163);
                        enumMap3.put(enumC4635, enumC3687M1164);
                        c5211 = new C5211(enumMap3, -10);
                    } else {
                        if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                            C5371.m9023(c5235);
                            c5235.m8864(new C5211(-10), false);
                        }
                        c5211 = null;
                    }
                } else {
                    c5373 = c5376;
                    c5594 = c5593;
                    c1512 = c1515;
                    if (C5211.m8812(-10, c4474.m7755().getInt("consent_source", 100))) {
                        EnumMap enumMap4 = new EnumMap(EnumC4635.class);
                        enumMap4.put(EnumC4635.f15302, enumC3687M1163);
                        enumMap4.put(enumC4635, enumC3687M1164);
                        c5211 = new C5211(enumMap4, -10);
                    } else {
                        if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                            C5371.m9023(c5235);
                            c5235.m8864(new C5211(-10), false);
                        }
                        c5211 = null;
                    }
                }
                if (c5211 != null) {
                    C5371.m9023(c5235);
                    c5235.m8864(c5211, true);
                    c5212 = c5211;
                } else {
                    c5212 = c5211M7754;
                }
                C5371.m9023(c5235);
                c5374 = (C5371) c5235.f18660;
                c5235.m8870(c5212);
                c4474.mo6517();
                int i7 = C5800.m9610(c4474.m7755().getString("dma_consent_settings", null)).f19115;
                enumC3687M1165 = c0515.m1163("google_analytics_default_allow_ad_personalization_signals", true);
                if (enumC3687M1165 != enumC3687) {
                    C5371.m9020(c3612);
                    c5592.m9430(enumC3687M1165, "Default ad personalization consent from Manifest");
                }
                enumC3687M1166 = c0515.m1163("google_analytics_default_allow_ad_user_data", true);
                if (enumC3687M1166 == enumC3687) {
                    if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                        C5371.m9023(c5235);
                        c5235.m8880(new C5800((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                    C5371.m9023(c5235);
                    c5235.m8880(new C5800((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolM1166 = c0515.m1166("google_analytics_tcf_data_enabled");
                if (boolM1166 != null) {
                    C5371.m9020(c3612);
                    c5590.m9432("TCF client enabled.");
                    C5371.m9023(c5235);
                    c5235.mo6517();
                    C3610 c36119 = c5374.f17717;
                    C5371.m9020(c36119);
                    c36119.f12015.m9432("Register tcfPrefChangeListener.");
                    if (c5235.f17280 == null) {
                        c5235.f17278 = new C0826(c5235, c5374, 2);
                        c5235.f17280 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ۦٍؚؒۘ
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                C5235 c5236 = c5235;
                                c5236.getClass();
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    C3610 c361110 = ((C5371) c5236.f18660).f17717;
                                    C5371.m9020(c361110);
                                    c361110.f12023.m9432("IABTCF_TCString change picked up in listener.");
                                    C0826 c0827 = c5236.f17278;
                                    AbstractC0487.m1047(c0827);
                                    c0827.m2199(500L);
                                }
                            }
                        };
                    }
                    C4474 c44710 = c5374.f17713;
                    C5371.m9021(c44710);
                    c44710.m7756().registerOnSharedPreferenceChangeListener(c5235.f17280);
                    C5371.m9023(c5235);
                    c5235.m8871();
                } else {
                    C5371.m9020(c3612);
                    c5590.m9432("TCF client enabled.");
                    C5371.m9023(c5235);
                    c5235.mo6517();
                    C3610 c361110 = c5374.f17717;
                    C5371.m9020(c361110);
                    c361110.f12015.m9432("Register tcfPrefChangeListener.");
                    if (c5235.f17280 == null) {
                        c5235.f17278 = new C0826(c5235, c5374, 2);
                        c5235.f17280 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ۦٍؚؒۘ
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                C5235 c5236 = c5235;
                                c5236.getClass();
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    C3610 c361111 = ((C5371) c5236.f18660).f17717;
                                    C5371.m9020(c361111);
                                    c361111.f12023.m9432("IABTCF_TCString change picked up in listener.");
                                    C0826 c0827 = c5236.f17278;
                                    AbstractC0487.m1047(c0827);
                                    c0827.m2199(500L);
                                }
                            }
                        };
                    }
                    C4474 c44711 = c5374.f17713;
                    C5371.m9021(c44711);
                    c44711.m7756().registerOnSharedPreferenceChangeListener(c5235.f17280);
                    C5371.m9023(c5235);
                    c5235.m8871();
                }
                c4173 = c4474.f14759;
                if (c4173.m7371() == 0) {
                    C5371.m9020(c3612);
                    c5592.m9430(Long.valueOf(j), "Persisting first open");
                    c4173.m7370(j);
                }
                C5371.m9023(c5235);
                c3743 = c5235.f17273;
                if (c3743.m6586()) {
                    C4474 c44712 = ((C5371) c3743.f12466).f17713;
                    C5371.m9021(c44712);
                    c44712.f14768.m2971(null);
                }
                if (c5373.m9025()) {
                    if (c5373.m9024()) {
                        c1513 = c1512;
                        if (c1513.m3216("android.permission.INTERNET")) {
                            C5371.m9020(c3612);
                            c5595 = c5594;
                            c5595.m9432("App is missing INTERNET permission");
                        } else {
                            c5595 = c5594;
                        }
                        if (!c1513.m3216("android.permission.ACCESS_NETWORK_STATE")) {
                            C5371.m9020(c3612);
                            c5595.m9432("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        c5375 = c5373;
                        context = c5375.f17739;
                        if (!C3866.m6899(context).m563()) {
                            if (!C1512.m3186(context)) {
                                C5371.m9020(c3612);
                                c5595.m9432("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!C1512.m3199(context)) {
                                C5371.m9020(c3612);
                                c5595.m9432("AppMeasurementService not registered/enabled");
                            }
                        }
                        C5371.m9020(c3612);
                        c5595.m9432("Uploading is not possible. App measurement disabled");
                    } else {
                        c5375 = c5373;
                        c1513 = c1512;
                    }
                    c3613 = c3612;
                } else {
                    c5375 = c5373;
                    c1513 = c1512;
                    if (TextUtils.isEmpty(c5375.m9029().m3855())) {
                        String strM3859 = c5375.m9029().m3855();
                        c4474.mo6517();
                        String string5 = c4474.m7755().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strM3859);
                        boolean zIsEmpty4 = TextUtils.isEmpty(string5);
                        if (zIsEmpty) {
                            c1406 = c1405;
                        } else {
                            c1406 = c1405;
                        }
                        String strM38510 = c5375.m9029().m3855();
                        c4474.mo6517();
                        SharedPreferences.Editor editorEdit6 = c4474.m7755().edit();
                        editorEdit6.putString("gmp_app_id", strM38510);
                        editorEdit6.apply();
                    } else {
                        c1406 = c1405;
                    }
                    if (!c4474.m7754().m8815(enumC4635)) {
                        c1406.m2971(null);
                    }
                    C5371.m9023(c5235);
                    c5235.f17284.set(c1406.m2974());
                    c5377.f17739.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    c3613 = c3612;
                    if (!TextUtils.isEmpty(c5375.m9029().m3855())) {
                        zM9024 = c5375.m9024();
                        sharedPreferences = c4474.f14756;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            c4474.m7752(!zM9024);
                        }
                        if (zM9024) {
                            C5371.m9023(c5235);
                            c5235.m8866();
                        }
                        C4423 c4426 = c5375.f17735;
                        C5371.m9023(c4426);
                        c4426.f14590.m6584();
                        c5375.m9028().m9519(new AtomicReference());
                        c5375.m9028().m9521(c4474.f14752.m3130());
                    }
                }
                C0237.m498();
                if (c0515.m1162(null, AbstractC4936.f16258)) {
                    c1513.mo6517();
                    if (c1513.m3241() == 1) {
                        long jIntValue4 = ((Integer) AbstractC4936.f16352.m4592(null)).intValue();
                        long jNextInt4 = new Random().nextInt(5000);
                        c5375.f17719.getClass();
                        jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            C5371.m9020(c3613);
                            c5592.m9430(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        C5371.m9023(c5235);
                        c5235.mo6517();
                        c0826 = c5235.f17268;
                        if (c0826 == null) {
                            c0826 = new C0826(c5235, c5374, 0);
                            c5235.f17268 = c0826;
                        }
                        c0826.m2199(jMax);
                    }
                }
                c4474.f14754.m8174(true);
            }
            C5371.m9020(c3617);
            c3611 = c3617;
            str = "Can't initialize twice";
            c3610 = c3614;
            c3611.f12020.m9430(C3610.m6440(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strM1934 = c1969.f6503;
            if (!TextUtils.isEmpty(strM1934)) {
                strM1934 = AbstractC0949.m1934(context3, c5378.f17734);
            }
            if (TextUtils.isEmpty(strM1934)) {
                str5 = strM1934;
            }
            c1969.f6505 = str5;
            if (iM9027 == 0) {
                C5371.m9020(c3611);
                c3611.f12023.m9434(c1969.f6507, c1969.f6505, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e2) {
            C5371.m9020(c3611);
            c3611.f12020.m9434(C3610.m6440(packageName), e2, "Fetching Google App Id failed with exception. appId");
        }
        str2 = "Unknown";
        string = str2;
        str3 = str7;
        i = Integer.MIN_VALUE;
        c1969.f6507 = packageName;
        c1969.f6510 = str3;
        c1969.f6508 = str2;
        c1969.f6506 = i;
        c1969.f6516 = string;
        c1969.f6518 = 0L;
        iM9027 = c5378.m9027();
        if (iM9027 != 0) {
            C5371.m9020(c3611);
            c3611.f12023.m9432("App measurement collection enabled");
        } else if (iM9027 != 1) {
            C5371.m9020(c3611);
            c3611.f12016.m9432("App measurement deactivated via the manifest");
        } else if (iM9027 != 3) {
            C5371.m9020(c3611);
            c3611.f12016.m9432("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iM9027 != 4) {
            C5371.m9020(c3611);
            c3611.f12016.m9432("App measurement disabled via the manifest");
        } else if (iM9027 != 6) {
            C5371.m9020(c3611);
            c3611.f12021.m9432("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iM9027 != 7) {
            C5371.m9020(c3611);
            c3611.f12016.m9432("App measurement disabled via the global data collection setting");
        } else if (iM9027 != 8) {
            C5371.m9020(c3611);
            c3611.f12016.m9432("App measurement disabled");
            C5371.m9020(c3611);
            c3611.f12025.m9432("Invalid scion state in identity");
        } else {
            C5371.m9020(c3611);
            c3611.f12016.m9432("App measurement disabled due to denied storage consent");
        }
        c1969.f6505 = str5;
        c1969.f6511 = null;
        C0515 c0517 = c5378.f17715;
        c5371 = (C5371) c0517.f18660;
        AbstractC0487.m1090("analytics.safelisted_events");
        bundleM1154 = c0517.m1154();
        if (bundleM1154 == null) {
            if (!bundleM1154.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleM1154.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = c5371.f17739.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = null;
                } else {
                    listAsList = Arrays.asList(stringArray);
                }
            } else {
                listAsList = null;
            }
            if (listAsList != null) {
                c1969.f6511 = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        c1969.f6511 = listAsList;
                        break;
                    } else {
                        str4 = (String) it.next();
                        c1514 = c5378.f17721;
                        C5371.m9021(c1514);
                    }
                } while (c1514.m3211("safelisted event", str4));
            } else {
                C5371.m9020(c3611);
                c3611.f12021.m9432("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                c1969.f6514 = AbstractC3933.m7083(context3) ? 1 : 0;
            } else {
                c1969.f6514 = 0;
            }
            ((C5371) c1969.f18660).f17720.incrementAndGet();
            c1969.f14347 = true;
            c4666 = new C4666(c5376);
            obj = c4666.f18660;
            c5372 = (C5371) obj;
            c5372.f17738++;
            c4666.m7642();
            c5376.f17724 = c4666;
            if (!c4666.f14347) {
                C1078.m2276(str);
                return;
            }
            c4666.f15370 = (JobScheduler) ((C5371) obj).f17739.getSystemService("jobscheduler");
            c5372.f17720.incrementAndGet();
            c4666.f14347 = true;
            C5371.m9020(c3610);
            c3612 = c3610;
            c5590 = c3612.f12015;
            c5591 = c3612.f12016;
            c5592 = c3612.f12023;
            c5593 = c3612.f12020;
            c0515.m1160();
            c5591.m9430(161000L, "App measurement initialized, version");
            C5371.m9020(c3612);
            c5591.m9432("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strM3854 = c1968.m3854();
            if (c1515.m3206(strM3854, c0515.f1840)) {
                C5371.m9020(c3612);
                c5591.m9432("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                C5371.m9020(c3612);
                c5591.m9432("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM3854)));
            }
            C5371.m9020(c3612);
            c5590.m9432("Debug-level message logging enabled");
            i2 = c5376.f17738;
            atomicInteger = c5376.f17720;
            if (i2 != atomicInteger.get()) {
                C5371.m9020(c3612);
                c5593.m9434(Integer.valueOf(c5376.f17738), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
            }
            c5376.f17728 = true;
            j = c5376.f17723;
            c5235 = c5376.f17709;
            C5371.m9020(c3644);
            c3644.mo6517();
            C5371.m9022(c5376.f17724);
            iM8030 = c5376.f17724.m8030();
            C0237.m498();
            zM1162 = c0515.m1162(null, AbstractC4936.f16258);
            if (iM8030 == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zM1162) {
                c1515.mo6517();
                if (c1515.m3241() == 1) {
                    c1515.mo6517();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    c0775 = new C0775(c5377);
                    z2 = z;
                    context2 = c5377.f17739;
                    if (Build.VERSION.SDK_INT >= 33) {
                        context2.registerReceiver(c0775, intentFilter, null, null, 2);
                    } else {
                        context2.registerReceiver(c0775, intentFilter, null, null, 0);
                    }
                    C3610 c361111 = c5377.f17717;
                    C5371.m9020(c361111);
                    c361111.f12015.m9432("Registered app receiver");
                    if (z2) {
                        C5371.m9022(c5376.f17724);
                        c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    c1515.mo6517();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    c0775 = new C0775(c5377);
                    z2 = z;
                    context2 = c5377.f17739;
                    if (Build.VERSION.SDK_INT >= 33) {
                        context2.registerReceiver(c0775, intentFilter, null, null, 2);
                    } else {
                        context2.registerReceiver(c0775, intentFilter, null, null, 0);
                    }
                    C3610 c361112 = c5377.f17717;
                    C5371.m9020(c361112);
                    c361112.f12015.m9432("Registered app receiver");
                    if (z2) {
                        C5371.m9022(c5376.f17724);
                        c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                    }
                }
            } else if (z) {
                z = true;
                c1515.mo6517();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                c0775 = new C0775(c5377);
                z2 = z;
                context2 = c5377.f17739;
                if (Build.VERSION.SDK_INT >= 33) {
                    context2.registerReceiver(c0775, intentFilter, null, null, 2);
                } else {
                    context2.registerReceiver(c0775, intentFilter, null, null, 0);
                }
                C3610 c361113 = c5377.f17717;
                C5371.m9020(c361113);
                c361113.f12015.m9432("Registered app receiver");
                if (z2) {
                    C5371.m9022(c5376.f17724);
                    c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                }
            }
            c1405 = c4474.f14771;
            c5211M7754 = c4474.m7754();
            int i8 = c5211M7754.f17219;
            enumC3687M1163 = c0515.m1163("google_analytics_default_allow_ad_storage", false);
            enumC3687M1164 = c0515.m1163("google_analytics_default_allow_analytics_storage", false);
            enumC4635 = EnumC4635.f15299;
            enumC3687 = EnumC3687.f12307;
            if (enumC3687M1163 == enumC3687) {
                c5373 = c5376;
                c5594 = c5593;
                c1512 = c1515;
                if (C5211.m8812(-10, c4474.m7755().getInt("consent_source", 100))) {
                    EnumMap enumMap5 = new EnumMap(EnumC4635.class);
                    enumMap5.put(EnumC4635.f15302, enumC3687M1163);
                    enumMap5.put(enumC4635, enumC3687M1164);
                    c5211 = new C5211(enumMap5, -10);
                } else {
                    if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                        C5371.m9023(c5235);
                        c5235.m8864(new C5211(-10), false);
                    }
                    c5211 = null;
                }
            } else {
                c5373 = c5376;
                c5594 = c5593;
                c1512 = c1515;
                if (C5211.m8812(-10, c4474.m7755().getInt("consent_source", 100))) {
                    EnumMap enumMap6 = new EnumMap(EnumC4635.class);
                    enumMap6.put(EnumC4635.f15302, enumC3687M1163);
                    enumMap6.put(enumC4635, enumC3687M1164);
                    c5211 = new C5211(enumMap6, -10);
                } else {
                    if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                        C5371.m9023(c5235);
                        c5235.m8864(new C5211(-10), false);
                    }
                    c5211 = null;
                }
            }
            if (c5211 != null) {
                C5371.m9023(c5235);
                c5235.m8864(c5211, true);
                c5212 = c5211;
            } else {
                c5212 = c5211M7754;
            }
            C5371.m9023(c5235);
            c5374 = (C5371) c5235.f18660;
            c5235.m8870(c5212);
            c4474.mo6517();
            int i9 = C5800.m9610(c4474.m7755().getString("dma_consent_settings", null)).f19115;
            enumC3687M1165 = c0515.m1163("google_analytics_default_allow_ad_personalization_signals", true);
            if (enumC3687M1165 != enumC3687) {
                C5371.m9020(c3612);
                c5592.m9430(enumC3687M1165, "Default ad personalization consent from Manifest");
            }
            enumC3687M1166 = c0515.m1163("google_analytics_default_allow_ad_user_data", true);
            if (enumC3687M1166 == enumC3687) {
                if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                    C5371.m9023(c5235);
                    c5235.m8880(new C5800((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
            } else if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                C5371.m9023(c5235);
                c5235.m8880(new C5800((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
            boolM1166 = c0515.m1166("google_analytics_tcf_data_enabled");
            if (boolM1166 != null) {
                C5371.m9020(c3612);
                c5590.m9432("TCF client enabled.");
                C5371.m9023(c5235);
                c5235.mo6517();
                C3610 c361114 = c5374.f17717;
                C5371.m9020(c361114);
                c361114.f12015.m9432("Register tcfPrefChangeListener.");
                if (c5235.f17280 == null) {
                    c5235.f17278 = new C0826(c5235, c5374, 2);
                    c5235.f17280 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ۦٍؚؒۘ
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                            C5235 c5236 = c5235;
                            c5236.getClass();
                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                C3610 c361115 = ((C5371) c5236.f18660).f17717;
                                C5371.m9020(c361115);
                                c361115.f12023.m9432("IABTCF_TCString change picked up in listener.");
                                C0826 c0827 = c5236.f17278;
                                AbstractC0487.m1047(c0827);
                                c0827.m2199(500L);
                            }
                        }
                    };
                }
                C4474 c44713 = c5374.f17713;
                C5371.m9021(c44713);
                c44713.m7756().registerOnSharedPreferenceChangeListener(c5235.f17280);
                C5371.m9023(c5235);
                c5235.m8871();
            } else {
                C5371.m9020(c3612);
                c5590.m9432("TCF client enabled.");
                C5371.m9023(c5235);
                c5235.mo6517();
                C3610 c361115 = c5374.f17717;
                C5371.m9020(c361115);
                c361115.f12015.m9432("Register tcfPrefChangeListener.");
                if (c5235.f17280 == null) {
                    c5235.f17278 = new C0826(c5235, c5374, 2);
                    c5235.f17280 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ۦٍؚؒۘ
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                            C5235 c5236 = c5235;
                            c5236.getClass();
                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                C3610 c361116 = ((C5371) c5236.f18660).f17717;
                                C5371.m9020(c361116);
                                c361116.f12023.m9432("IABTCF_TCString change picked up in listener.");
                                C0826 c0827 = c5236.f17278;
                                AbstractC0487.m1047(c0827);
                                c0827.m2199(500L);
                            }
                        }
                    };
                }
                C4474 c44714 = c5374.f17713;
                C5371.m9021(c44714);
                c44714.m7756().registerOnSharedPreferenceChangeListener(c5235.f17280);
                C5371.m9023(c5235);
                c5235.m8871();
            }
            c4173 = c4474.f14759;
            if (c4173.m7371() == 0) {
                C5371.m9020(c3612);
                c5592.m9430(Long.valueOf(j), "Persisting first open");
                c4173.m7370(j);
            }
            C5371.m9023(c5235);
            c3743 = c5235.f17273;
            if (c3743.m6586()) {
                C4474 c44715 = ((C5371) c3743.f12466).f17713;
                C5371.m9021(c44715);
                c44715.f14768.m2971(null);
            }
            if (c5373.m9025()) {
                if (c5373.m9024()) {
                    c1513 = c1512;
                    if (c1513.m3216("android.permission.INTERNET")) {
                        C5371.m9020(c3612);
                        c5595 = c5594;
                        c5595.m9432("App is missing INTERNET permission");
                    } else {
                        c5595 = c5594;
                    }
                    if (!c1513.m3216("android.permission.ACCESS_NETWORK_STATE")) {
                        C5371.m9020(c3612);
                        c5595.m9432("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    c5375 = c5373;
                    context = c5375.f17739;
                    if (!C3866.m6899(context).m563()) {
                        if (!C1512.m3186(context)) {
                            C5371.m9020(c3612);
                            c5595.m9432("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!C1512.m3199(context)) {
                            C5371.m9020(c3612);
                            c5595.m9432("AppMeasurementService not registered/enabled");
                        }
                    }
                    C5371.m9020(c3612);
                    c5595.m9432("Uploading is not possible. App measurement disabled");
                } else {
                    c5375 = c5373;
                    c1513 = c1512;
                }
                c3613 = c3612;
            } else {
                c5375 = c5373;
                c1513 = c1512;
                if (TextUtils.isEmpty(c5375.m9029().m3855())) {
                    String strM38511 = c5375.m9029().m3855();
                    c4474.mo6517();
                    String string6 = c4474.m7755().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strM38511);
                    boolean zIsEmpty5 = TextUtils.isEmpty(string6);
                    if (zIsEmpty) {
                        c1406 = c1405;
                    } else {
                        c1406 = c1405;
                    }
                    String strM38512 = c5375.m9029().m3855();
                    c4474.mo6517();
                    SharedPreferences.Editor editorEdit7 = c4474.m7755().edit();
                    editorEdit7.putString("gmp_app_id", strM38512);
                    editorEdit7.apply();
                } else {
                    c1406 = c1405;
                }
                if (!c4474.m7754().m8815(enumC4635)) {
                    c1406.m2971(null);
                }
                C5371.m9023(c5235);
                c5235.f17284.set(c1406.m2974());
                c5377.f17739.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                c3613 = c3612;
                if (!TextUtils.isEmpty(c5375.m9029().m3855())) {
                    zM9024 = c5375.m9024();
                    sharedPreferences = c4474.f14756;
                    if (sharedPreferences == null) {
                        zContains = false;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        c4474.m7752(!zM9024);
                    }
                    if (zM9024) {
                        C5371.m9023(c5235);
                        c5235.m8866();
                    }
                    C4423 c4427 = c5375.f17735;
                    C5371.m9023(c4427);
                    c4427.f14590.m6584();
                    c5375.m9028().m9519(new AtomicReference());
                    c5375.m9028().m9521(c4474.f14752.m3130());
                }
            }
            C0237.m498();
            if (c0515.m1162(null, AbstractC4936.f16258)) {
                c1513.mo6517();
                if (c1513.m3241() == 1) {
                    long jIntValue5 = ((Integer) AbstractC4936.f16352.m4592(null)).intValue();
                    long jNextInt5 = new Random().nextInt(5000);
                    c5375.f17719.getClass();
                    jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        C5371.m9020(c3613);
                        c5592.m9430(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    C5371.m9023(c5235);
                    c5235.mo6517();
                    c0826 = c5235.f17268;
                    if (c0826 == null) {
                        c0826 = new C0826(c5235, c5374, 0);
                        c5235.f17268 = c0826;
                    }
                    c0826.m2199(jMax);
                }
            }
            c4474.f14754.m8174(true);
        }
        C3610 c361116 = c5371.f17717;
        C5371.m9020(c361116);
        c361116.f12020.m9432("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = c5371.f17739.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = null;
            } else {
                listAsList = Arrays.asList(stringArray);
            }
        } else {
            listAsList = null;
        }
        if (listAsList != null) {
            c1969.f6511 = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    c1969.f6511 = listAsList;
                    break;
                } else {
                    str4 = (String) it.next();
                    c1514 = c5378.f17721;
                    C5371.m9021(c1514);
                }
            } while (c1514.m3211("safelisted event", str4));
        } else {
            C5371.m9020(c3611);
            c3611.f12021.m9432("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            c1969.f6514 = AbstractC3933.m7083(context3) ? 1 : 0;
        } else {
            c1969.f6514 = 0;
        }
        ((C5371) c1969.f18660).f17720.incrementAndGet();
        c1969.f14347 = true;
        c4666 = new C4666(c5376);
        obj = c4666.f18660;
        c5372 = (C5371) obj;
        c5372.f17738++;
        c4666.m7642();
        c5376.f17724 = c4666;
        if (!c4666.f14347) {
            C1078.m2276(str);
            return;
        }
        c4666.f15370 = (JobScheduler) ((C5371) obj).f17739.getSystemService("jobscheduler");
        c5372.f17720.incrementAndGet();
        c4666.f14347 = true;
        C5371.m9020(c3610);
        c3612 = c3610;
        c5590 = c3612.f12015;
        c5591 = c3612.f12016;
        c5592 = c3612.f12023;
        c5593 = c3612.f12020;
        c0515.m1160();
        c5591.m9430(161000L, "App measurement initialized, version");
        C5371.m9020(c3612);
        c5591.m9432("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strM3854 = c1968.m3854();
        if (c1515.m3206(strM3854, c0515.f1840)) {
            C5371.m9020(c3612);
            c5591.m9432("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            C5371.m9020(c3612);
            c5591.m9432("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM3854)));
        }
        C5371.m9020(c3612);
        c5590.m9432("Debug-level message logging enabled");
        i2 = c5376.f17738;
        atomicInteger = c5376.f17720;
        if (i2 != atomicInteger.get()) {
            C5371.m9020(c3612);
            c5593.m9434(Integer.valueOf(c5376.f17738), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
        }
        c5376.f17728 = true;
        j = c5376.f17723;
        c5235 = c5376.f17709;
        C5371.m9020(c3644);
        c3644.mo6517();
        C5371.m9022(c5376.f17724);
        iM8030 = c5376.f17724.m8030();
        C0237.m498();
        zM1162 = c0515.m1162(null, AbstractC4936.f16258);
        if (iM8030 == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zM1162) {
            c1515.mo6517();
            if (c1515.m3241() == 1) {
                c1515.mo6517();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                c0775 = new C0775(c5377);
                z2 = z;
                context2 = c5377.f17739;
                if (Build.VERSION.SDK_INT >= 33) {
                    context2.registerReceiver(c0775, intentFilter, null, null, 2);
                } else {
                    context2.registerReceiver(c0775, intentFilter, null, null, 0);
                }
                C3610 c361117 = c5377.f17717;
                C5371.m9020(c361117);
                c361117.f12015.m9432("Registered app receiver");
                if (z2) {
                    C5371.m9022(c5376.f17724);
                    c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                }
            } else if (z) {
                z = true;
                c1515.mo6517();
                intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                c0775 = new C0775(c5377);
                z2 = z;
                context2 = c5377.f17739;
                if (Build.VERSION.SDK_INT >= 33) {
                    context2.registerReceiver(c0775, intentFilter, null, null, 2);
                } else {
                    context2.registerReceiver(c0775, intentFilter, null, null, 0);
                }
                C3610 c361118 = c5377.f17717;
                C5371.m9020(c361118);
                c361118.f12015.m9432("Registered app receiver");
                if (z2) {
                    C5371.m9022(c5376.f17724);
                    c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
                }
            }
        } else if (z) {
            z = true;
            c1515.mo6517();
            intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            c0775 = new C0775(c5377);
            z2 = z;
            context2 = c5377.f17739;
            if (Build.VERSION.SDK_INT >= 33) {
                context2.registerReceiver(c0775, intentFilter, null, null, 2);
            } else {
                context2.registerReceiver(c0775, intentFilter, null, null, 0);
            }
            C3610 c361119 = c5377.f17717;
            C5371.m9020(c361119);
            c361119.f12015.m9432("Registered app receiver");
            if (z2) {
                C5371.m9022(c5376.f17724);
                c5376.f17724.m8029(((Long) AbstractC4936.f16267.m4592(null)).longValue());
            }
        }
        c1405 = c4474.f14771;
        c5211M7754 = c4474.m7754();
        int i10 = c5211M7754.f17219;
        enumC3687M1163 = c0515.m1163("google_analytics_default_allow_ad_storage", false);
        enumC3687M1164 = c0515.m1163("google_analytics_default_allow_analytics_storage", false);
        enumC4635 = EnumC4635.f15299;
        enumC3687 = EnumC3687.f12307;
        if (enumC3687M1163 == enumC3687) {
            c5373 = c5376;
            c5594 = c5593;
            c1512 = c1515;
            if (C5211.m8812(-10, c4474.m7755().getInt("consent_source", 100))) {
                EnumMap enumMap7 = new EnumMap(EnumC4635.class);
                enumMap7.put(EnumC4635.f15302, enumC3687M1163);
                enumMap7.put(enumC4635, enumC3687M1164);
                c5211 = new C5211(enumMap7, -10);
            } else {
                if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                    C5371.m9023(c5235);
                    c5235.m8864(new C5211(-10), false);
                }
                c5211 = null;
            }
        } else {
            c5373 = c5376;
            c5594 = c5593;
            c1512 = c1515;
            if (C5211.m8812(-10, c4474.m7755().getInt("consent_source", 100))) {
                EnumMap enumMap8 = new EnumMap(EnumC4635.class);
                enumMap8.put(EnumC4635.f15302, enumC3687M1163);
                enumMap8.put(enumC4635, enumC3687M1164);
                c5211 = new C5211(enumMap8, -10);
            } else {
                if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                    C5371.m9023(c5235);
                    c5235.m8864(new C5211(-10), false);
                }
                c5211 = null;
            }
        }
        if (c5211 != null) {
            C5371.m9023(c5235);
            c5235.m8864(c5211, true);
            c5212 = c5211;
        } else {
            c5212 = c5211M7754;
        }
        C5371.m9023(c5235);
        c5374 = (C5371) c5235.f18660;
        c5235.m8870(c5212);
        c4474.mo6517();
        int i11 = C5800.m9610(c4474.m7755().getString("dma_consent_settings", null)).f19115;
        enumC3687M1165 = c0515.m1163("google_analytics_default_allow_ad_personalization_signals", true);
        if (enumC3687M1165 != enumC3687) {
            C5371.m9020(c3612);
            c5592.m9430(enumC3687M1165, "Default ad personalization consent from Manifest");
        }
        enumC3687M1166 = c0515.m1163("google_analytics_default_allow_ad_user_data", true);
        if (enumC3687M1166 == enumC3687) {
            if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
                C5371.m9023(c5235);
                c5235.m8880(new C5800((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
        } else if (!TextUtils.isEmpty(c5373.m9029().m3855())) {
            C5371.m9023(c5235);
            c5235.m8880(new C5800((Boolean) null, -10, (Boolean) null, (String) null), true);
        }
        boolM1166 = c0515.m1166("google_analytics_tcf_data_enabled");
        if (boolM1166 != null) {
            C5371.m9020(c3612);
            c5590.m9432("TCF client enabled.");
            C5371.m9023(c5235);
            c5235.mo6517();
            C3610 c3611110 = c5374.f17717;
            C5371.m9020(c3611110);
            c3611110.f12015.m9432("Register tcfPrefChangeListener.");
            if (c5235.f17280 == null) {
                c5235.f17278 = new C0826(c5235, c5374, 2);
                c5235.f17280 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ۦٍؚؒۘ
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                        C5235 c5236 = c5235;
                        c5236.getClass();
                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                            C3610 c3611111 = ((C5371) c5236.f18660).f17717;
                            C5371.m9020(c3611111);
                            c3611111.f12023.m9432("IABTCF_TCString change picked up in listener.");
                            C0826 c0827 = c5236.f17278;
                            AbstractC0487.m1047(c0827);
                            c0827.m2199(500L);
                        }
                    }
                };
            }
            C4474 c44716 = c5374.f17713;
            C5371.m9021(c44716);
            c44716.m7756().registerOnSharedPreferenceChangeListener(c5235.f17280);
            C5371.m9023(c5235);
            c5235.m8871();
        } else {
            C5371.m9020(c3612);
            c5590.m9432("TCF client enabled.");
            C5371.m9023(c5235);
            c5235.mo6517();
            C3610 c3611111 = c5374.f17717;
            C5371.m9020(c3611111);
            c3611111.f12015.m9432("Register tcfPrefChangeListener.");
            if (c5235.f17280 == null) {
                c5235.f17278 = new C0826(c5235, c5374, 2);
                c5235.f17280 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ۦٍؚؒۘ
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                        C5235 c5236 = c5235;
                        c5236.getClass();
                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                            C3610 c3611112 = ((C5371) c5236.f18660).f17717;
                            C5371.m9020(c3611112);
                            c3611112.f12023.m9432("IABTCF_TCString change picked up in listener.");
                            C0826 c0827 = c5236.f17278;
                            AbstractC0487.m1047(c0827);
                            c0827.m2199(500L);
                        }
                    }
                };
            }
            C4474 c44717 = c5374.f17713;
            C5371.m9021(c44717);
            c44717.m7756().registerOnSharedPreferenceChangeListener(c5235.f17280);
            C5371.m9023(c5235);
            c5235.m8871();
        }
        c4173 = c4474.f14759;
        if (c4173.m7371() == 0) {
            C5371.m9020(c3612);
            c5592.m9430(Long.valueOf(j), "Persisting first open");
            c4173.m7370(j);
        }
        C5371.m9023(c5235);
        c3743 = c5235.f17273;
        if (c3743.m6586()) {
            C4474 c44718 = ((C5371) c3743.f12466).f17713;
            C5371.m9021(c44718);
            c44718.f14768.m2971(null);
        }
        if (c5373.m9025()) {
            if (c5373.m9024()) {
                c1513 = c1512;
                if (c1513.m3216("android.permission.INTERNET")) {
                    C5371.m9020(c3612);
                    c5595 = c5594;
                    c5595.m9432("App is missing INTERNET permission");
                } else {
                    c5595 = c5594;
                }
                if (!c1513.m3216("android.permission.ACCESS_NETWORK_STATE")) {
                    C5371.m9020(c3612);
                    c5595.m9432("App is missing ACCESS_NETWORK_STATE permission");
                }
                c5375 = c5373;
                context = c5375.f17739;
                if (!C3866.m6899(context).m563()) {
                    if (!C1512.m3186(context)) {
                        C5371.m9020(c3612);
                        c5595.m9432("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!C1512.m3199(context)) {
                        C5371.m9020(c3612);
                        c5595.m9432("AppMeasurementService not registered/enabled");
                    }
                }
                C5371.m9020(c3612);
                c5595.m9432("Uploading is not possible. App measurement disabled");
            } else {
                c5375 = c5373;
                c1513 = c1512;
            }
            c3613 = c3612;
        } else {
            c5375 = c5373;
            c1513 = c1512;
            if (TextUtils.isEmpty(c5375.m9029().m3855())) {
                String strM38513 = c5375.m9029().m3855();
                c4474.mo6517();
                String string7 = c4474.m7755().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strM38513);
                boolean zIsEmpty6 = TextUtils.isEmpty(string7);
                if (zIsEmpty) {
                    c1406 = c1405;
                } else {
                    c1406 = c1405;
                }
                String strM38514 = c5375.m9029().m3855();
                c4474.mo6517();
                SharedPreferences.Editor editorEdit8 = c4474.m7755().edit();
                editorEdit8.putString("gmp_app_id", strM38514);
                editorEdit8.apply();
            } else {
                c1406 = c1405;
            }
            if (!c4474.m7754().m8815(enumC4635)) {
                c1406.m2971(null);
            }
            C5371.m9023(c5235);
            c5235.f17284.set(c1406.m2974());
            c5377.f17739.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            c3613 = c3612;
            if (!TextUtils.isEmpty(c5375.m9029().m3855())) {
                zM9024 = c5375.m9024();
                sharedPreferences = c4474.f14756;
                if (sharedPreferences == null) {
                    zContains = false;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    c4474.m7752(!zM9024);
                }
                if (zM9024) {
                    C5371.m9023(c5235);
                    c5235.m8866();
                }
                C4423 c4428 = c5375.f17735;
                C5371.m9023(c4428);
                c4428.f14590.m6584();
                c5375.m9028().m9519(new AtomicReference());
                c5375.m9028().m9521(c4474.f14752.m3130());
            }
        }
        C0237.m498();
        if (c0515.m1162(null, AbstractC4936.f16258)) {
            c1513.mo6517();
            if (c1513.m3241() == 1) {
                long jIntValue6 = ((Integer) AbstractC4936.f16352.m4592(null)).intValue();
                long jNextInt6 = new Random().nextInt(5000);
                c5375.f17719.getClass();
                jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    C5371.m9020(c3613);
                    c5592.m9430(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                C5371.m9023(c5235);
                c5235.mo6517();
                c0826 = c5235.f17268;
                if (c0826 == null) {
                    c0826 = new C0826(c5235, c5374, 0);
                    c5235.f17268 = c0826;
                }
                c0826.m2199(jMax);
            }
        }
        c4474.f14754.m8174(true);
    }

    /* JADX WARN: Code duplicated, block: B:279:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thM3768;
        InterfaceC0614 interfaceC0614;
        InterfaceC4814 interfaceC4814;
        InterfaceC4814 c5331;
        Long lValueOf;
        int i = 0;
        int i2 = 1;
        switch (this.f16497) {
            case 0:
                C2346 c2346 = (C2346) this.f16495;
                InterfaceFutureC4378 interfaceFutureC4378 = (InterfaceFutureC4378) this.f16496;
                if ((interfaceFutureC4378 instanceof AbstractC0032) && (thM3768 = ((AbstractC0032) interfaceFutureC4378).m3768()) != null) {
                    c2346.m4399(thM3768);
                    return;
                }
                try {
                    AbstractC2552.m4816(interfaceFutureC4378);
                    C5235 c5235 = (C5235) c2346.f7785;
                    c5235.mo6517();
                    C5371 c5371 = (C5371) c5235.f18660;
                    C4474 c4474 = c5371.f17713;
                    C5371.m9021(c4474);
                    SparseArray sparseArrayM7753 = c4474.m7753();
                    C4012 c4012 = (C4012) c2346.f7786;
                    sparseArrayM7753.put(c4012.f13377, Long.valueOf(c4012.f13378));
                    C4474 c4475 = c5371.f17713;
                    C5371.m9021(c4475);
                    int[] iArr = new int[sparseArrayM7753.size()];
                    long[] jArr = new long[sparseArrayM7753.size()];
                    for (int i3 = 0; i3 < sparseArrayM7753.size(); i3++) {
                        iArr[i3] = sparseArrayM7753.keyAt(i3);
                        jArr[i3] = ((Long) sparseArrayM7753.valueAt(i3)).longValue();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putIntArray("uriSources", iArr);
                    bundle.putLongArray("uriTimestamps", jArr);
                    c4475.f14764.m3144(bundle);
                    c5235.f17276 = false;
                    c5235.f17283 = 1;
                    C3610 c3610 = c5371.f17717;
                    C5371.m9020(c3610);
                    c3610.f12015.m9430(c4012.f13379, "Successfully registered trigger URI");
                    c5235.m8868();
                    return;
                } catch (Error e) {
                    e = e;
                    c2346.m4399(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    c2346.m4399(e);
                    return;
                } catch (ExecutionException e3) {
                    c2346.m4399(e3.getCause());
                    return;
                }
            case 1:
                C0911 c0911 = (C0911) this.f16496;
                C4718 c4718 = (C4718) this.f16495;
                MenuC4903 menuC4903 = c4718.f15555;
                if (menuC4903 != null && (interfaceC0614 = menuC4903.f16174) != null) {
                    interfaceC0614.mo1378(menuC4903);
                }
                View view = (View) c4718.f15571;
                if (view != null && view.getWindowToken() != null) {
                    if (c0911.m4342()) {
                        c4718.f15566 = c0911;
                    } else if (c0911.f7600 != null) {
                        c0911.m4344(0, 0, false, false);
                        c4718.f15566 = c0911;
                    }
                }
                c4718.f15562 = null;
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C0239) this.f16496).f895 = this.f16495;
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((Application) this.f16496).unregisterActivityLifecycleCallbacks((C0239) this.f16495);
                return;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                Object obj = this.f16495;
                Object obj2 = this.f16496;
                try {
                    Method method = AbstractC4587.f15137;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC4587.f15133.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e4) {
                    if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                        throw e4;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C5513) this.f16495).invalidateDrawable((Drawable) this.f16496);
                return;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C3121 c3121 = (C3121) this.f16496;
                Typeface typeface = (Typeface) this.f16495;
                C0835 c0835 = (C0835) c3121.f10451;
                if (c0835 != null) {
                    c0835.m1741(typeface);
                    return;
                }
                return;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C1984 c1984M3874 = C1984.m3874();
                String str = C3336.f11159;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                C4142 c4142 = (C4142) this.f16496;
                sb.append(c4142.f13787);
                c1984M3874.m3878(str, sb.toString());
                ((C3336) this.f16495).f11162.mo2234(c4142);
                return;
            case 8:
                AbstractC2776.m5232((C4121) this.f16496).mo335(new C4535((Throwable) this.f16495));
                return;
            case 9:
                break;
            case 10:
                ((C3334) this.f16496).accept(this.f16495);
                return;
            case 11:
                ((C2600) this.f16495).m4901((C5254) this.f16496);
                return;
            case 12:
                try {
                    m8371();
                    return;
                } catch (Error e5) {
                    synchronized (((ExecutorC3331) this.f16495).f11148) {
                        ((ExecutorC3331) this.f16495).f11146 = 1;
                        throw e5;
                    }
                }
            case 13:
                try {
                    ((Runnable) this.f16495).run();
                    synchronized (((ExecutorC2205) this.f16496).f7310) {
                        ((ExecutorC2205) this.f16496).m4263();
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((ExecutorC2205) this.f16496).f7310) {
                        ((ExecutorC2205) this.f16496).m4263();
                        throw th2;
                    }
                }
            case 14:
                m8369();
                return;
            case 15:
                C2612 c2612 = (C2612) this.f16496;
                C2566 c2566 = (C2566) this.f16495;
                InterfaceC0858 interfaceC0858 = (InterfaceC0858) c2566.f8568;
                C3184 c3184 = (C3184) ((C4085) c2566.f8567).f13635.get((C5001) c2566.f8565);
                if (c3184 == null) {
                    return;
                }
                if (c2612.f8713 != 0) {
                    c3184.m5874(c2612, null);
                    return;
                }
                c2566.f8569 = true;
                if (interfaceC0858.mo1833()) {
                    if (!c2566.f8569 || (interfaceC4814 = (InterfaceC4814) c2566.f8566) == null) {
                        return;
                    }
                    interfaceC0858.m1830(interfaceC4814, (Set) c2566.f8564);
                    return;
                }
                try {
                    interfaceC0858.m1830(null, interfaceC0858.mo1826());
                    return;
                } catch (SecurityException e6) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e6);
                    interfaceC0858.m1829("Failed to get service from broker.");
                    c3184.m5874(new C2612(10, null, null), null);
                    return;
                }
            case 16:
                m8368();
                return;
            case 17:
                BinderC0913 binderC0913 = (BinderC0913) this.f16495;
                C2209 c2209 = (C2209) this.f16496;
                C2612 c2613 = c2209.f7316;
                if (c2613.f8713 == 0) {
                    C3976 c3976 = c2209.f7315;
                    AbstractC0487.m1047(c3976);
                    C2612 c2614 = c3976.f13289;
                    if (c2614.f8713 != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c2614)), new Exception());
                        binderC0913.f3283.m4839(c2614);
                        binderC0913.f3282.m7345();
                        return;
                    }
                    C2566 c2567 = binderC0913.f3283;
                    IBinder iBinder = c3976.f13291;
                    if (iBinder == null) {
                        c5331 = null;
                    } else {
                        int i4 = AbstractBinderC4339.f14321;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        c5331 = iInterfaceQueryLocalInterface instanceof InterfaceC4814 ? (InterfaceC4814) iInterfaceQueryLocalInterface : new C5331(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    Set set = binderC0913.f3278;
                    c2567.getClass();
                    if (c5331 == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        c2567.m4839(new C2612(4, null, null));
                    } else {
                        c2567.f8566 = c5331;
                        c2567.f8564 = set;
                        if (c2567.f8569) {
                            ((InterfaceC0858) c2567.f8568).m1830(c5331, set);
                        }
                    }
                } else {
                    binderC0913.f3283.m4839(c2613);
                }
                binderC0913.f3282.m7345();
                return;
            case 18:
                InterfaceC1150 interfaceC1150 = (InterfaceC1150) this.f16496;
                interfaceC1150.mo2405();
                if (C4452.m7739()) {
                    interfaceC1150.mo2406().m6515(this);
                    return;
                }
                AbstractC1003 abstractC1003 = (AbstractC1003) this.f16495;
                byte b = abstractC1003.f3583 != 0 ? (byte) 1 : (byte) 0;
                abstractC1003.f3583 = 0L;
                if (b != 0) {
                    abstractC1003.mo1720();
                    return;
                }
                return;
            case 19:
                C3580 c3580 = (C3580) this.f16496;
                boolean z = c3580.f11913;
                C3590 c3590 = (C3590) this.f16495;
                if (z) {
                    c3590.f11943.m6394();
                    return;
                }
                try {
                    ((C3590) this.f16495).f11943.m6395(c3590.f11942.mo396(c3580));
                    return;
                } catch (C3441 e7) {
                    boolean z2 = e7.getCause() instanceof Exception;
                    C3590 c3591 = (C3590) this.f16495;
                    if (z2) {
                        c3591.f11943.m6393((Exception) e7.getCause());
                        return;
                    } else {
                        c3591.f11943.m6393(e7);
                        return;
                    }
                } catch (Exception e8) {
                    ((C3590) this.f16495).f11943.m6393(e8);
                    return;
                }
            case 20:
                C3590 c3592 = (C3590) this.f16495;
                C3580 c3581 = c3592.f11943;
                try {
                    C3580 c3582 = (C3580) c3592.f11942.mo396((C3580) this.f16496);
                    if (c3582 == null) {
                        c3592.mo2243(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC3678 executorC3678 = AbstractC4007.f13359;
                    c3582.m6389(executorC3678, c3592);
                    c3582.m6391(executorC3678, c3592);
                    c3582.f11911.m9159(new C3517((Executor) executorC3678, (InterfaceC2342) c3592));
                    c3582.m6400();
                    return;
                } catch (C3441 e9) {
                    if (e9.getCause() instanceof Exception) {
                        c3581.m6393((Exception) e9.getCause());
                        return;
                    } else {
                        c3581.m6393(e9);
                        return;
                    }
                } catch (Exception e10) {
                    c3581.m6393(e10);
                    return;
                }
            case 21:
                ServiceConnectionC2098 serviceConnectionC2098 = (ServiceConnectionC2098) this.f16495;
                C5371 c5372 = serviceConnectionC2098.f6911.f11283;
                C3644 c3644 = c5372.f17733;
                C5371.m9020(c3644);
                c3644.mo6517();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", serviceConnectionC2098.f6912);
                try {
                    C5198 c5198 = (C5198) ((InterfaceC4498) this.f16496);
                    Parcel parcelM7504 = c5198.m7504();
                    AbstractC5564.m9345(parcelM7504, bundle2);
                    Parcel parcelM7507 = c5198.m7507(parcelM7504, 1);
                    Bundle bundle3 = (Bundle) AbstractC5564.m9346(parcelM7507, Bundle.CREATOR);
                    parcelM7507.recycle();
                    if (bundle3 == null) {
                        C3610 c3611 = c5372.f17717;
                        C5371.m9020(c3611);
                        c3611.f12020.m9432("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e11) {
                    C3610 c3612 = c5372.f17717;
                    C5371.m9020(c3612);
                    c3612.f12020.m9430(e11.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                C3644 c3645 = c5372.f17733;
                C5371.m9020(c3645);
                c3645.mo6517();
                throw new IllegalStateException("Unexpected call on client side");
            case 22:
                m8366();
                return;
            case 23:
                m8370();
                return;
            case 24:
                C5034 c5034 = ((BinderC5179) this.f16495).f17131;
                c5034.m8494();
                C1513 c1513 = (C1513) this.f16496;
                if (c1513.f5138.m3090() == null) {
                    c5034.getClass();
                    String str2 = c1513.f5147;
                    AbstractC0487.m1047(str2);
                    C5855 c5855M8504 = c5034.m8504(str2);
                    if (c5855M8504 != null) {
                        c5034.m8516(c1513, c5855M8504);
                        return;
                    }
                    return;
                }
                c5034.getClass();
                String str3 = c1513.f5147;
                AbstractC0487.m1047(str3);
                C5855 c5855M8505 = c5034.m8504(str3);
                if (c5855M8505 != null) {
                    c5034.m8513(c1513, c5855M8505);
                    return;
                }
                return;
            case 25:
                m8367();
                return;
            case 26:
                InterfaceC3838 interfaceC3838 = (InterfaceC3838) this.f16496;
                C5235 c5236 = (C5235) this.f16495;
                C4423 c4423 = ((C5371) c5236.f18660).f17735;
                C5371.m9023(c4423);
                C5371 c5373 = (C5371) c4423.f18660;
                C4474 c4476 = c5373.f17713;
                C4474 c4477 = c5373.f17713;
                C5371.m9021(c4476);
                if (c4476.m7754().m8815(EnumC4635.f15299)) {
                    C5371.m9021(c4477);
                    c5373.f17719.getClass();
                    if (!c4477.m7751(System.currentTimeMillis())) {
                        C5371.m9021(c4477);
                        if (c4477.f14758.m7371() != 0) {
                            C5371.m9021(c4477);
                            lValueOf = Long.valueOf(c4477.f14758.m7371());
                        }
                    }
                    if (lValueOf == null) {
                        C1512 c1512 = ((C5371) c5236.f18660).f17721;
                        C5371.m9021(c1512);
                        c1512.m3230(interfaceC3838, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            interfaceC3838.mo1888(null);
                            return;
                        } catch (RemoteException e12) {
                            C3610 c3613 = ((C5371) c5236.f18660).f17717;
                            C5371.m9020(c3613);
                            c3613.f12020.m9430(e12, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                C3610 c3614 = c5373.f17717;
                C5371.m9020(c3614);
                c3614.f12021.m9432("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    interfaceC3838.mo1888(null);
                    return;
                }
                C1512 c1514 = ((C5371) c5236.f18660).f17721;
                C5371.m9021(c1514);
                c1514.m3230(interfaceC3838, lValueOf.longValue());
                return;
            case 27:
                ((C5235) this.f16495).m8875((Boolean) this.f16496, true);
                return;
            case 28:
                C5371 c5374 = (C5371) ((C5235) this.f16495).f18660;
                C4474 c4478 = c5374.f17713;
                C3610 c3615 = c5374.f17717;
                C5371.m9021(c4478);
                c4478.mo6517();
                c4478.mo6517();
                C5800 c5800M9610 = C5800.m9610(c4478.m7755().getString("dma_consent_settings", null));
                C5800 c5800 = (C5800) this.f16496;
                int i5 = c5800.f19115;
                if (!C5211.m8812(i5, c5800M9610.f19115)) {
                    C5371.m9020(c3615);
                    c3615.f12016.m9430(Integer.valueOf(i5), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = c4478.m7755().edit();
                editorEdit.putString("dma_consent_settings", c5800.f19114);
                editorEdit.apply();
                C5371.m9020(c3615);
                c3615.f12023.m9430(c5800, "Setting DMA consent(FE)");
                if (c5374.m9028().m9506()) {
                    C5695 c5695M9028 = c5374.m9028();
                    c5695M9028.mo6517();
                    c5695M9028.m7643();
                    c5695M9028.m9509(new RunnableC3936(c5695M9028, i2));
                    return;
                }
                C5695 c5695M9029 = c5374.m9028();
                c5695M9029.mo6517();
                c5695M9029.m7643();
                if (c5695M9029.m9507()) {
                    c5695M9029.m9509(new RunnableC4292(c5695M9029, c5695M9029.m9517(false)));
                    return;
                }
                return;
            default:
                C5235 c5237 = ((AppMeasurementDynamiteService) this.f16495).f309.f17709;
                C5371.m9023(c5237);
                C4898 c4898 = (C4898) this.f16496;
                c5237.mo6517();
                c5237.m7643();
                C4898 c4899 = c5237.f17272;
                if (c4898 != c4899) {
                    AbstractC0487.m1082("EventInterceptor already set.", c4899 == null);
                }
                c5237.f17272 = c4898;
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f16496).run();
            } catch (Throwable th3) {
                AbstractC1605.m3338(C4794.f15814, th3);
            }
            try {
                Runnable runnableM1550 = ((C0698) this.f16495).m1550();
                if (runnableM1550 == null) {
                    return;
                }
                this.f16496 = runnableM1550;
                i++;
                if (i >= 16) {
                    C0698 c0698 = (C0698) this.f16495;
                    if (AbstractC5378.m9049(c0698.f2535, c0698)) {
                        C0698 c0699 = (C0698) this.f16495;
                        AbstractC5378.m9042(c0699.f2535, c0699, this);
                        return;
                    }
                }
            } catch (Throwable th4) {
                C0698 c06910 = (C0698) this.f16495;
                synchronized (c06910.f2537) {
                    C0698.f2532.decrementAndGet(c06910);
                    throw th4;
                }
            }
        }
    }

    public String toString() {
        String str;
        int i = this.f16497;
        Object obj = this.f16495;
        switch (i) {
            case 0:
                C2808 c2808 = new C2808(RunnableC4985.class.getSimpleName());
                C3369 c3369 = new C3369(14, false);
                ((C3369) c2808.f9377).f11254 = c3369;
                c2808.f9377 = c3369;
                c3369.f11255 = (C2346) obj;
                return c2808.toString();
            case 12:
                Runnable runnable = (Runnable) this.f16496;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((ExecutorC3331) obj).f11146;
                if (i2 == 1) {
                    str = "IDLE";
                } else if (i2 == 2) {
                    str = "QUEUING";
                } else if (i2 != 3) {
                    str = i2 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f16496).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        p000.ExecutorC3331.f11144.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f16496), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f16496 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ۥّ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m8371() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f16495     // Catch: java.lang.Throwable -> L58
            ۦؘؖؒۨ r2 = (p000.ExecutorC3331) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f11148     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f16495     // Catch: java.lang.Throwable -> L20
            ۦؘؖؒۨ r0 = (p000.ExecutorC3331) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f11146     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L7d
        L22:
            long r6 = r0.f11147     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f11147 = r6     // Catch: java.lang.Throwable -> L20
            r0.f11146 = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f16495     // Catch: java.lang.Throwable -> L20
            ۦؘؖؒۨ r4 = (p000.ExecutorC3331) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f11148     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f16496 = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.f16495     // Catch: java.lang.Throwable -> L20
            ۦؘؖؒۨ r10 = (p000.ExecutorC3331) r10     // Catch: java.lang.Throwable -> L20
            r10.f11146 = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f16496     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f16496 = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = p000.ExecutorC3331.f11144     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f16496     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f16496 = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L88:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.RunnableC4985.m8371():void");
    }

    public /* synthetic */ RunnableC4985(int i, Object obj, Object obj2, boolean z) {
        this.f16497 = i;
        this.f16495 = obj;
        this.f16496 = obj2;
    }

    public RunnableC4985(ServiceConnectionC2098 serviceConnectionC2098, InterfaceC4498 interfaceC4498, ServiceConnectionC2098 serviceConnectionC2099) {
        this.f16497 = 21;
        this.f16496 = interfaceC4498;
        this.f16495 = serviceConnectionC2098;
    }

    public /* synthetic */ RunnableC4985(int i, Object obj, Object obj2) {
        this.f16497 = i;
        this.f16496 = obj;
        this.f16495 = obj2;
    }

    public RunnableC4985(ExecutorC3331 executorC3331) {
        this.f16497 = 12;
        this.f16495 = executorC3331;
    }
}
