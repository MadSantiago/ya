package p000;

import java.util.Comparator;

/* JADX INFO: renamed from: ۥؘۙؑۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2201 implements Comparator {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f7293;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f7294;

    public /* synthetic */ C2201(int i, Object obj) {
        this.f7294 = i;
        this.f7293 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f7294;
        Object obj3 = this.f7293;
        switch (i) {
            case 0:
                for (InterfaceC4745 interfaceC4745 : (InterfaceC4745[]) obj3) {
                    int iM3368 = AbstractC1605.m3368((Comparable) interfaceC4745.mo211(obj), (Comparable) interfaceC4745.mo211(obj2));
                    if (iM3368 != 0) {
                        return iM3368;
                    }
                }
                return 0;
            default:
                return ((Number) ((InterfaceC5731) obj3).mo219(obj, obj2)).intValue();
        }
    }
}
