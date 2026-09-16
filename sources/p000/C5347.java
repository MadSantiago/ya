package p000;

import de.robv.android.xposed.XC_MethodHook;

/* JADX INFO: renamed from: ۦ۟ؔۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5347 extends XC_MethodHook {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ AbstractC4294 f17604;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5347(AbstractC4294 abstractC4294, int i) {
        super(i);
        this.f17604 = abstractC4294;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (methodHookParam == null) {
            return;
        }
        this.f17604.mo917(new C1414(new C0514(methodHookParam, 0), new C0514(methodHookParam, 1), new C0514(methodHookParam, 2), new C2263(methodHookParam, 0), new C2263(methodHookParam, 1), 14));
    }

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        if (methodHookParam == null) {
            return;
        }
        C0514 c0514 = new C0514(methodHookParam, 0);
        C0514 c0515 = new C0514(methodHookParam, 1);
        C0514 c0516 = new C0514(methodHookParam, 2);
        C2263 c2263 = new C2263(methodHookParam, 0);
        C1414 c1414 = new C1414(c0514, c0515, c0516, c2263, new C2263(methodHookParam, 1), 14);
        AbstractC4294 abstractC4294 = this.f17604;
        if (abstractC4294 instanceof AbstractC1246) {
            c2263.mo219(((AbstractC1246) abstractC4294).mo2634(c1414), Boolean.TRUE);
        } else {
            abstractC4294.mo2635(c1414);
        }
    }
}
