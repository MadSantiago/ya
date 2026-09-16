package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: ۥْ۠ؔۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2504 implements Comparator {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Comparator f8323;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f8324 = 0;

    public C2504(C2504 c2504) {
        this.f8323 = c2504;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f8324;
        Comparator comparator = this.f8323;
        switch (i) {
            case 0:
                int iCompare = comparator.compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return C0605.f2234.compare(((C3129) obj).f10471, ((C3129) obj2).f10471);
            default:
                int iCompare2 = ((C2504) comparator).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : Integer.valueOf(((C3129) obj).f10473).compareTo(Integer.valueOf(((C3129) obj2).f10473));
        }
    }

    public C2504(Comparator comparator) {
        this.f8323 = comparator;
    }
}
