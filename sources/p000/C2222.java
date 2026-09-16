package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۥؙۙؔۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2222 implements Iterable, InterfaceC3984 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object f7358;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7359;

    public /* synthetic */ C2222(int i, Object obj) {
        this.f7359 = i;
        this.f7358 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f7359;
        Object obj = this.f7358;
        switch (i) {
            case 0:
                return new C0084(1, (Object[]) obj);
            case 1:
                return new C0084(2, (Iterator) ((C0101) obj).mo449());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C2960((C3306) obj);
            default:
                return new C0084((C2505) obj);
        }
    }
}
