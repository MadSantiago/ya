package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦٌۛؓۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5224 extends AbstractC0026 {

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC4734 f17249;

    public AbstractC5224(InterfaceC4734 interfaceC4734) {
        this.f17249 = interfaceC4734;
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public void mo197(C3782 c3782, Object obj) {
        int iMo539 = mo539(obj);
        C3782 c3782M6691 = c3782.m6691(mo193());
        Iterator itMo200 = mo200(obj);
        for (int i = 0; i < iMo539; i++) {
            c3782M6691.m6699(mo193(), i, this.f17249, itMo200.next());
        }
        c3782M6691.m6683();
    }

    /* JADX INFO: renamed from: ۦٌ */
    public abstract void mo199(int i, Object obj, Object obj2);

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦِ */
    public void mo540(InterfaceC5308 interfaceC5308, int i, Object obj) {
        mo199(i, obj, interfaceC5308.mo5162(mo193(), i, this.f17249, null));
    }
}
