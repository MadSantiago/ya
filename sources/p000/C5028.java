package p000;

import android.util.Log;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: ۦٍۘؕٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5028 implements InterfaceC3015, InterfaceC2456, InterfaceC5346, InterfaceC1463, InterfaceC0557, InterfaceC4573, InterfaceC2740 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16642;

    public /* synthetic */ C5028(C2352 c2352) {
        this.f16642 = 4;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static /* synthetic */ void m8444(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: ۥْ */
    public static /* synthetic */ void m8445(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static /* synthetic */ void m8446(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static /* synthetic */ void m8447(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX INFO: renamed from: ۦِ */
    public static /* synthetic */ void m8448(String str) throws IOException {
        throw new IOException(str);
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static /* synthetic */ void m8449(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static /* synthetic */ void m8450(Throwable th) {
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static /* synthetic */ void m8451(Object obj, Object obj2) {
        throw new C4145("Fragment " + obj + obj2);
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static /* synthetic */ void m8452(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static /* synthetic */ void m8453(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static /* synthetic */ void m8454(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    @Override // p000.InterfaceC2456
    public Object apply(Object obj) {
        String strM8700 = C4802.f15840.m8700((C4193) obj);
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        return strM8700.getBytes(AbstractC4637.f15306);
    }

    @Override // p000.InterfaceC4573
    /* JADX INFO: renamed from: ۥؗ */
    public void mo395(C3267 c3267) {
        ArrayList arrayList;
        if (c3267.m6030()) {
            C2432 c2432 = AbstractC5239.f17296;
            if (((String) c2432.getValue()) != null) {
                String str = (String) c2432.getValue();
                int i = C3806.f12632;
                AbstractC1333[] abstractC1333ArrMo2848 = (AbstractC2552.m4818().m6030() ? new C3806(str) : new C3152(str)).listFiles();
                ArrayList arrayList2 = null;
                if (abstractC1333ArrMo2848 != null) {
                    arrayList = new ArrayList();
                    for (AbstractC1333 abstractC1333 : abstractC1333ArrMo2848) {
                        if (AbstractC0684.m1527(abstractC1333.getName(), new C4441(new long[]{4254198685292248823L, 4287070956676137222L}).toString(), false)) {
                            arrayList.add(abstractC1333);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    arrayList2 = arrayList;
                }
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1333) it.next()).delete();
                    }
                }
                String[] strArr = {new C4441(new long[]{1381279603497356804L, 8710888779138575240L, -4293349845388098868L, 5439526930977415725L, 65236200568220316L, -5279714407088054359L}).toString()};
                ExecutorService executorService = C3267.f10970;
                AbstractC2552.m4793(strArr).m7727();
            }
        }
    }

    @Override // p000.InterfaceC1463
    /* JADX INFO: renamed from: ۥُ */
    public void mo2243(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // p000.InterfaceC0557
    /* JADX INFO: renamed from: ۥۣ */
    public boolean mo1245() {
        return false;
    }

    @Override // p000.InterfaceC5346
    /* JADX INFO: renamed from: ۦٌ */
    public Object mo400(C2813 c2813) {
        switch (this.f16642) {
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f350.get();
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f348.get();
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.f349.get();
            case 8:
                C0916 c0916 = ExecutorsRegistrar.f350;
                return EnumC5451.f17968;
            case 16:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(c2813);
            case 18:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(c2813);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(c2813);
        }
    }

    public /* synthetic */ C5028(int i) {
        this.f16642 = i;
    }

    @Override // p000.InterfaceC2740
    /* JADX INFO: renamed from: ۥۗ */
    public void mo397(InterfaceC2090 interfaceC2090) {
    }

    @Override // p000.InterfaceC3015
    /* JADX INFO: renamed from: ۦؑ */
    public float mo1642(float f) {
        return f;
    }
}
