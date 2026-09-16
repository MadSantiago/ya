package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦؙؑۡؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3527 implements InterfaceC0806 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f11692;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f11693;

    public /* synthetic */ C3527(int i, Object obj) {
        this.f11693 = i;
        this.f11692 = obj;
    }

    @Override // p000.InterfaceC0806
    public final Iterator iterator() {
        int i = this.f11693;
        Object obj = this.f11692;
        switch (i) {
            case 0:
                return new C0084(1, (Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return (Iterator) obj;
            default:
                return new C5019((CharSequence) obj);
        }
    }
}
