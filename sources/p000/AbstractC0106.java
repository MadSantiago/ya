package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥٟؐؑۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0106 extends AbstractC5224 {

    /* JADX INFO: renamed from: ۥۗ */
    public final C3907 f423;

    public AbstractC0106(InterfaceC4734 interfaceC4734) {
        super(interfaceC4734);
        this.f423 = new C3907(interfaceC4734.mo193());
    }

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC0103 mo193() {
        return this.f423;
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo194() {
        return (AbstractC3445) mo541(mo201());
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۥّ */
    public final int mo195(Object obj) {
        return ((AbstractC3445) obj).mo2859();
    }

    @Override // p000.AbstractC0026, p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo196(InterfaceC2125 interfaceC2125) {
        return m3302(interfaceC2125);
    }

    @Override // p000.AbstractC5224, p000.InterfaceC4734
    /* JADX INFO: renamed from: ۦؑ */
    public final void mo197(C3782 c3782, Object obj) {
        int iMo539 = mo539(obj);
        C3782 c3782M6691 = c3782.m6691(this.f423);
        mo202(c3782M6691, obj, iMo539);
        c3782M6691.m6683();
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo198(Object obj) {
        return ((AbstractC3445) obj).mo2858();
    }

    @Override // p000.AbstractC5224
    /* JADX INFO: renamed from: ۦٌ */
    public final void mo199(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    @Override // p000.AbstractC0026
    /* JADX INFO: renamed from: ۦۙ */
    public final Iterator mo200(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    /* JADX INFO: renamed from: ۦۚ */
    public abstract Object mo201();

    /* JADX INFO: renamed from: ۦۨ */
    public abstract void mo202(C3782 c3782, Object obj, int i);
}
