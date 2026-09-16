package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۥۚؒۘۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2263 implements InterfaceC5731 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f7517;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7518;

    public /* synthetic */ C2263(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f7518 = i;
        this.f7517 = methodHookParam;
    }

    @Override // p000.InterfaceC5731
    /* JADX INFO: renamed from: ۥۜ */
    public final Object mo219(Object obj, Object obj2) {
        int i = this.f7518;
        XC_MethodHook.MethodHookParam methodHookParam = this.f7517;
        switch (i) {
            case 0:
                if (((Boolean) obj2).booleanValue()) {
                    methodHookParam.setResult(obj);
                }
                return methodHookParam.getResult();
            default:
                Throwable th = (Throwable) obj;
                if (((Boolean) obj2).booleanValue()) {
                    methodHookParam.setThrowable(th);
                }
                return methodHookParam.getThrowable();
        }
    }
}
