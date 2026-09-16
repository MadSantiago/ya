package p000;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ۥٕؓٝٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1397 implements InterfaceC1027, InterfaceC2003, InterfaceC5346, InterfaceC2218, InterfaceC0241, InterfaceC1655, InterfaceC4861, InterfaceC2521, InterfaceC1367, InterfaceC3195, InterfaceC1646 {

    /* JADX INFO: renamed from: ۥؓ */
    public static C1414 f4778;

    /* JADX INFO: renamed from: ۦُ */
    public static C3269 f4795;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f4803;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C1397 f4802 = new C1397(1);

    /* JADX INFO: renamed from: ۥْ */
    public static final C1397 f4783 = new C1397(2);

    /* JADX INFO: renamed from: ۥٓ */
    public static final C1397 f4784 = new C1397(3);

    /* JADX INFO: renamed from: ۥَ */
    public static final C1397 f4782 = new C1397(4);

    /* JADX INFO: renamed from: ۥٖ */
    public static final C5763 f4786 = new C5763(1);

    /* JADX INFO: renamed from: ۦٗ */
    public static final C5763 f4798 = new C5763(2);

    /* JADX INFO: renamed from: ۦۛ */
    public static final C1397 f4800 = new C1397(6);

    /* JADX INFO: renamed from: ۥۖ */
    public static final C1397 f4788 = new C1397(7);

    /* JADX INFO: renamed from: ۦٕ */
    public static final C1397 f4796 = new C1397(8);

    /* JADX INFO: renamed from: ۥٙ */
    public static final C1397 f4787 = new C1397(9);

    /* JADX INFO: renamed from: ۥؖ */
    public static final C1397 f4780 = new C1397(11);

    /* JADX INFO: renamed from: ۥۧ */
    public static final /* synthetic */ C1397 f4791 = new C1397(12);

    /* JADX INFO: renamed from: ۥً */
    public static final C1397 f4781 = new C1397(13);

    /* JADX INFO: renamed from: ۦٚ */
    public static final C1397 f4799 = new C1397(14);

    /* JADX INFO: renamed from: ۥٕ */
    public static final C1397 f4785 = new C1397(15);

    /* JADX INFO: renamed from: ۥۙ */
    public static final C1397 f4789 = new C1397(16);

    /* JADX INFO: renamed from: ۦؙ */
    public static final C1397 f4794 = new C1397(17);

    /* JADX INFO: renamed from: ۦؖ */
    public static final C1397 f4792 = new C1397(18);

    /* JADX INFO: renamed from: ۥۦ */
    public static final C1397 f4790 = new C1397(19);

    /* JADX INFO: renamed from: ۦؗ */
    public static final C1397 f4793 = new C1397(20);

    /* JADX INFO: renamed from: ۦٖ */
    public static final C1397 f4797 = new C1397(21);

    /* JADX INFO: renamed from: ۥؔ */
    public static final C1397 f4779 = new C1397(22);

    /* JADX INFO: renamed from: ۦۜ */
    public static final C1397 f4801 = new C1397(23);

    public /* synthetic */ C1397(int i) {
        this.f4803 = i;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static ArrayList m2957(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = C2340.f7777;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runningAppProcesses) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC5573.m9402(arrayList2, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList2) {
            C1376 c1376 = new C1376();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                C0178.m387("Null processName");
                return null;
            }
            c1376.f4709 = str2;
            c1376.f4708 = runningAppProcessInfo.pid;
            byte b = (byte) (c1376.f4707 | 1);
            c1376.f4706 = runningAppProcessInfo.importance;
            c1376.f4707 = (byte) (b | 2);
            c1376.f4710 = AbstractC3831.m6874(str2, str);
            c1376.f4707 = (byte) (c1376.f4707 | 4);
            arrayList3.add(c1376.m2913());
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static void m2958(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && AbstractC3831.m6874(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            C2316.m4362(parentFile, "Failed to delete conflicting file: ");
            return;
        }
        if (parentFile.isDirectory()) {
            return;
        }
        try {
            Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
        } catch (Exception e) {
            throw new IOException("Failed to create directory: " + parentFile, e);
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public static C3192 m2959(Object obj) {
        AbstractC5212 abstractC5212 = (AbstractC5212) obj;
        C3192 c3192 = abstractC5212.zzc;
        if (c3192 != C3192.f10721) {
            return c3192;
        }
        C3192 c3192M5886 = C3192.m5886();
        abstractC5212.zzc = c3192M5886;
        return c3192M5886;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public static boolean m2960(int i, C4902 c4902, Object obj) throws C5463 {
        AbstractC4650 abstractC4650 = (AbstractC4650) c4902.f16167;
        int i2 = c4902.f16168;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c4902.m8260(0);
            ((C3192) obj).m5890(i3 << 3, Long.valueOf(abstractC4650.mo4602()));
            return true;
        }
        if (i4 == 1) {
            c4902.m8260(1);
            ((C3192) obj).m5890((i3 << 3) | 1, Long.valueOf(abstractC4650.mo4604()));
            return true;
        }
        if (i4 == 2) {
            ((C3192) obj).m5890((i3 << 3) | 2, c4902.m8294());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                C2316.m4358("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                C2316.m4361();
                return false;
            }
            c4902.m8260(5);
            ((C3192) obj).m5890(5 | (i3 << 3), Integer.valueOf(abstractC4650.mo4621()));
            return true;
        }
        C3192 c3192M5886 = C3192.m5886();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            C2316.m4358("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (c4902.m8272() != Integer.MAX_VALUE && m2960(i6, c4902, c3192M5886)) {
        }
        if ((i5 | 4) != c4902.f16168) {
            C2316.m4358("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (c3192M5886.f10723) {
            c3192M5886.f10723 = false;
        }
        ((C3192) obj).m5890(i5 | 3, c3192M5886);
        return true;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static C4482 m2961(InterfaceC0999 interfaceC0999, C4122 c4122, C3950 c3950, InterfaceC4448 interfaceC4448) {
        C2340 c2340 = C2340.f7777;
        int i = 19;
        InterfaceC0443 interfaceC0443 = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new C4482(new C0365(interfaceC0999, new C2932(22, c3950), interfaceC4448), Collections.singletonList(new C0023(c2340, interfaceC0443, i)), c4122, c3950);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new C4482(new C0365(interfaceC0999, interfaceC4448), Collections.singletonList(new C0023(c2340, interfaceC0443, i)), c4122, c3950);
        }
    }

    public String toString() {
        switch (this.f4803) {
            case 15:
                return "coil.request.NullRequestData";
            case 18:
                return "ReferentialEqualityPolicy";
            case 27:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0241
    /* JADX INFO: renamed from: ۥؗ */
    public boolean mo502(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX INFO: renamed from: ۥَ */
    public AbstractC1355 m2962(Context context) {
        Object next;
        String processName;
        int iMyPid = Process.myPid();
        Iterator it = m2957(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C5498) ((AbstractC1355) next)).f18157 != iMyPid);
        AbstractC1355 abstractC1355 = (AbstractC1355) next;
        if (abstractC1355 != null) {
            return abstractC1355;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            processName = Process.myProcessName();
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        C1376 c1376 = new C1376();
        c1376.f4709 = processName;
        c1376.f4708 = iMyPid;
        byte b = (byte) (c1376.f4707 | 1);
        c1376.f4706 = 0;
        c1376.f4710 = false;
        c1376.f4707 = (byte) (((byte) (b | 2)) | 4);
        return c1376.m2913();
    }

    @Override // p000.InterfaceC4861
    /* JADX INFO: renamed from: ۥُ */
    public C2546 mo2963(ContextWrapper contextWrapper, InterfaceC4230 interfaceC4230) {
        Context baseContext = contextWrapper;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = contextWrapper;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper2.getBaseContext();
        }
        if (baseContext instanceof Activity) {
            return mo2964((Activity) baseContext, interfaceC4230);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            C1078.m2272("Must provide a UiContext or Application Context");
            return null;
        }
        Display defaultDisplay = ((WindowManager) contextWrapper.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new C2546(new Rect(0, 0, point.x, point.y), interfaceC4230.mo2767(contextWrapper));
    }

    @Override // p000.InterfaceC4861
    /* JADX INFO: renamed from: ۥّ */
    public C2546 mo2964(Activity activity, InterfaceC4230 interfaceC4230) {
        InterfaceC1027.f3628.getClass();
        return new C2546(new C2999(C3012.m5602().mo805(activity)), interfaceC4230.mo2767(activity));
    }

    /* JADX INFO: renamed from: ۥْ */
    public void m2965(String str) {
        if (m2969(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    @Override // p000.InterfaceC2521
    /* JADX INFO: renamed from: ۥۗ */
    public boolean mo610(SSLSocket sSLSocket) {
        return sSLSocket.getClass().getName().startsWith("com.google.android.gms.org.conscrypt.");
    }

    @Override // p000.InterfaceC1655
    /* JADX INFO: renamed from: ۥۜ */
    public long mo2764(C4902 c4902, int i) {
        return ((C3828) c4902.f16167).m6832(i);
    }

    @Override // p000.InterfaceC1367, p000.InterfaceC3195
    /* JADX INFO: renamed from: ۥۣ */
    public float mo2868() {
        return 0.0f;
    }

    @Override // p000.InterfaceC1646
    /* JADX INFO: renamed from: ۦؑ */
    public byte[] mo803(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.InterfaceC3195
    /* JADX INFO: renamed from: ۦؚ */
    public void mo2265(InterfaceC2880 interfaceC2880, int i, int[] iArr, int[] iArr2) {
        AbstractC4225.m7440(i, iArr, iArr2, false);
    }

    @Override // p000.InterfaceC5346
    /* JADX INFO: renamed from: ۦٌ */
    public Object mo400(C2813 c2813) {
        return AbstractC4489.m7819((Executor) c2813.mo5376(new C1166(InterfaceC2053.class, Executor.class)));
    }

    @Override // p000.InterfaceC2003
    /* JADX INFO: renamed from: ۦِ */
    public Object mo804(Object obj) {
        switch (this.f4803) {
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return (AbstractC2577) obj;
            default:
                ((AbstractC2978) obj).close();
                return null;
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public void m2966(String str) {
        if (m2969(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    @Override // p000.InterfaceC1027
    /* JADX INFO: renamed from: ۦٛ */
    public Rect mo805(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            return new Rect((Rect) obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null));
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            InterfaceC1027.f3628.getClass();
            Log.w(C3012.f10148, e);
            return C1298.f4430.mo805(activity);
        }
    }

    @Override // p000.InterfaceC1367
    /* JADX INFO: renamed from: ۦۗ */
    public void mo2869(InterfaceC2880 interfaceC2880, int i, int[] iArr, EnumC2459 enumC2459, int[] iArr2) {
        if (enumC2459 == EnumC2459.f8215) {
            AbstractC4225.m7440(i, iArr, iArr2, false);
        } else {
            AbstractC4225.m7440(i, iArr, iArr2, true);
        }
    }

    @Override // p000.InterfaceC2521
    /* JADX INFO: renamed from: ۦۙ */
    public InterfaceC4131 mo611(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C0306(superclass);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public void m2967(final InterfaceC0705 interfaceC0705, float f, long j, C5362 c5362, final int i) {
        final float f2;
        final long j2;
        long jM216;
        float f3;
        c5362.m8979(-1498258020);
        int i2 = (c5362.m8963(interfaceC0705) ? 4 : 2) | i | 176;
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            c5362.m8971();
            if ((i & 1) == 0 || c5362.m8969()) {
                int i3 = AbstractC1431.f4910;
                jM216 = AbstractC0118.m216(26, c5362);
                f3 = 3.0f;
            } else {
                c5362.m8982();
                f3 = f;
                jM216 = j;
            }
            c5362.m8964();
            AbstractC1089.m2299(AbstractC5568.m9382(AbstractC4410.m7703(interfaceC0705.mo1571(AbstractC4410.f14521), f3), jM216, AbstractC2552.f8518), c5362, 0);
            j2 = jM216;
            f2 = f3;
        } else {
            c5362.m8982();
            f2 = f;
            j2 = j;
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new InterfaceC5731(interfaceC0705, f2, j2, i) { // from class: ۥؚٟ٘ؔ

                /* JADX INFO: renamed from: ۥْ */
                public final /* synthetic */ float f5286;

                /* JADX INFO: renamed from: ۥٓ */
                public final /* synthetic */ long f5287;

                /* JADX INFO: renamed from: ۦ۟ */
                public final /* synthetic */ InterfaceC0705 f5288;

                @Override // p000.InterfaceC5731
                /* JADX INFO: renamed from: ۥۜ */
                public final Object mo219(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM6835 = AbstractC3831.m6835(3073);
                    this.f5289.m2967(this.f5288, this.f5286, this.f5287, (C5362) obj, iM6835);
                    return C2358.f7817;
                }
            };
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public void m2968(String str, Exception exc) {
        if (m2969(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public boolean m2969(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }
}
