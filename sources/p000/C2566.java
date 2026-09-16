package p000;

/* JADX INFO: renamed from: ۥٌّۡؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2566 implements InterfaceC3151 {

    /* JADX INFO: renamed from: ۥَ */
    public Object f8564;

    /* JADX INFO: renamed from: ۥْ */
    public final Object f8565;

    /* JADX INFO: renamed from: ۥٓ */
    public Object f8566;

    /* JADX INFO: renamed from: ۥٖ */
    public final Object f8567;

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f8568;

    /* JADX INFO: renamed from: ۦۨ */
    public boolean f8569;

    public C2566(int i, float f, AbstractC0631 abstractC0631) {
        this.f8568 = abstractC0631;
        this.f8565 = new C0169(i);
        this.f8566 = new C0811(f);
        this.f8567 = new C3779(i);
    }

    @Override // p000.InterfaceC3151
    /* JADX INFO: renamed from: ۥّ */
    public void mo4838(C2612 c2612) {
        ((C4085) this.f8567).f13634.post(new RunnableC4985(15, this, c2612, false));
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m4839(C2612 c2612) {
        C3184 c3184 = (C3184) ((C4085) this.f8567).f13635.get((C5001) this.f8565);
        if (c3184 != null) {
            c3184.m5863(c2612);
        }
    }

    public C2566(C4085 c4085, InterfaceC0858 interfaceC0858, C5001 c5001) {
        this.f8567 = c4085;
        this.f8566 = null;
        this.f8564 = null;
        this.f8569 = false;
        this.f8568 = interfaceC0858;
        this.f8565 = c5001;
    }
}
