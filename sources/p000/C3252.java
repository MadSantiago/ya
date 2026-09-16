package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ۦْۣؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3252 implements InterfaceC4734 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3252 f10922 = new C3252();

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2722 f10921 = C2722.f9017;

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return f10921;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        AbstractC4593.m7968(interfaceC2125);
        return new C5832((List) new C4109(C3107.f10419, 0).m3302(interfaceC2125));
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        AbstractC4593.m7969(c3782);
        C3107 c3107 = C3107.f10419;
        C4362 c4362 = new C4362(C3107.f10418, 1);
        List list = ((C5832) obj).f19213;
        int size = list.size();
        C3782 c3782M6691 = c3782.m6691(c4362);
        Iterator it = list.iterator();
        for (int i = 0; i < size; i++) {
            c3782M6691.m6699(c4362, i, c3107, it.next());
        }
        c3782M6691.m6683();
    }
}
