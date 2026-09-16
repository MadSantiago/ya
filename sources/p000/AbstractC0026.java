package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥ٘ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0026 implements InterfaceC4734 {
    /* JADX INFO: renamed from: ۥُ */
    public abstract Object mo194();

    /* JADX INFO: renamed from: ۥّ */
    public abstract int mo195(Object obj);

    @Override // p000.InterfaceC4734
    /* JADX INFO: renamed from: ۥۗ */
    public Object mo196(InterfaceC2125 interfaceC2125) {
        return m3302(interfaceC2125);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public abstract int mo539(Object obj);

    /* JADX INFO: renamed from: ۦؚ */
    public abstract Object mo198(Object obj);

    /* JADX INFO: renamed from: ۦِ */
    public abstract void mo540(InterfaceC5308 interfaceC5308, int i, Object obj);

    /* JADX INFO: renamed from: ۦٛ */
    public final Object m3302(InterfaceC2125 interfaceC2125) {
        Object objMo194 = mo194();
        int iMo195 = mo195(objMo194);
        InterfaceC5308 interfaceC5308Mo4114 = interfaceC2125.mo4114(mo193());
        while (true) {
            int iMo6291 = interfaceC5308Mo4114.mo6291(mo193());
            if (iMo6291 == -1) {
                interfaceC5308Mo4114.mo5156(mo193());
                return mo198(objMo194);
            }
            mo540(interfaceC5308Mo4114, iMo6291 + iMo195, objMo194);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public abstract Object mo541(Object obj);

    /* JADX INFO: renamed from: ۦۙ */
    public abstract Iterator mo200(Object obj);
}
