package p000;

import android.util.Log;

/* JADX INFO: renamed from: ۥٟۣٓؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1247 extends AbstractC2426 implements InterfaceC2609 {

    /* JADX INFO: renamed from: ۥَ */
    public int f4300;

    /* JADX INFO: renamed from: ۥٖ */
    public /* synthetic */ InterfaceC4161 f4301;

    /* JADX INFO: renamed from: ۦٗ */
    public /* synthetic */ Throwable f4302;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C0909 f4303;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1247(C0909 c0909, InterfaceC0443 interfaceC0443) {
        super(3, interfaceC0443);
        this.f4303 = c0909;
    }

    @Override // p000.AbstractC2870
    /* JADX INFO: renamed from: ۥٖ */
    public final Object mo218(Object obj) {
        int i = this.f4300;
        if (i == 0) {
            AbstractC0186.m409(obj);
            InterfaceC4161 interfaceC4161 = this.f4301;
            Throwable th = this.f4302;
            C1521 c1521M3709 = this.f4303.f3264.m3709(null);
            C1109 c1109 = new C1109(c1521M3709, null, null);
            Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + c1521M3709.f5162);
            this.f4301 = null;
            this.f4300 = 1;
            Object objMo978 = interfaceC4161.mo978(c1109, this);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objMo978 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC0186.m409(obj);
        }
        return C2358.f7817;
    }

    @Override // p000.InterfaceC2609
    /* JADX INFO: renamed from: ۦۙ */
    public final Object mo1173(Object obj, Object obj2, Object obj3) {
        C1247 c1247 = new C1247(this.f4303, (InterfaceC0443) obj3);
        c1247.f4301 = (InterfaceC4161) obj;
        c1247.f4302 = (Throwable) obj2;
        return c1247.mo218(C2358.f7817);
    }
}
