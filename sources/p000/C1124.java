package p000;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥِٖؗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1124 extends AbstractC4489 {

    /* JADX INFO: renamed from: ۦُ */
    public final /* synthetic */ int f3950;

    /* JADX INFO: renamed from: ۦٖ */
    public final /* synthetic */ AbstractC4489 f3951;

    public /* synthetic */ C1124(AbstractC4489 abstractC4489, int i) {
        this.f3950 = i;
        this.f3951 = abstractC4489;
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo963(C1781 c1781, Object obj) {
        int i = this.f3950;
        AbstractC4489 abstractC4489 = this.f3951;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        abstractC4489.mo963(c1781, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        abstractC4489.mo963(c1781, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}
