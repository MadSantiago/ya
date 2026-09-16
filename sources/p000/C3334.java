package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؚؖؒ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3334 implements InterfaceC3281 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f11154;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f11155;

    public /* synthetic */ C3334(int i, Object obj) {
        this.f11155 = i;
        this.f11154 = obj;
    }

    @Override // p000.InterfaceC3281
    public final void accept(Object obj) {
        switch (this.f11155) {
            case 0:
                C2413 c2413 = (C2413) obj;
                if (c2413 == null) {
                    c2413 = new C2413(-3);
                }
                ((C5002) this.f11154).m8406(c2413);
                return;
            default:
                C2413 c2414 = (C2413) obj;
                synchronized (AbstractC5610.f18467) {
                    try {
                        C0796 c0796 = AbstractC5610.f18470;
                        ArrayList arrayList = (ArrayList) c0796.get((String) this.f11154);
                        if (arrayList == null) {
                            return;
                        }
                        c0796.remove((String) this.f11154);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC3281) arrayList.get(i)).accept(c2414);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
