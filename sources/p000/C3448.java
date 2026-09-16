package p000;

/* JADX INFO: renamed from: ۦؘؗؔۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3448 extends AbstractC3019 implements InterfaceC0349, InterfaceC4825 {

    /* JADX INFO: renamed from: ۥٕ */
    public final C3468 f11455;

    /* JADX INFO: renamed from: ۥۙ */
    public C1506 f11456;

    public C3448() {
        C3468 c3468 = new C3468(0, new C2492(2, this, C3448.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0), 9);
        m5603(c3468);
        this.f11455 = c3468;
    }

    @Override // p000.InterfaceC0349
    /* JADX INFO: renamed from: ۦٖ */
    public final void mo772() {
        C5450 c5450 = new C5450();
        AbstractC5568.m9359(this, new C5304(4, c5450, this));
        C1506 c1506 = (C1506) c5450.f17965;
        if (this.f11455.m6254().m7315()) {
            C1506 c1507 = this.f11456;
            if (c1507 != null) {
                c1507.m3182();
            }
            if (c1506 != null) {
                c1506.m3183();
            } else {
                c1506 = null;
            }
            this.f11456 = c1506;
        }
    }
}
