package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦۘؒۛۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5010 extends AbstractC4489 {

    /* JADX INFO: renamed from: ۥؔ */
    public final boolean f16582;

    /* JADX INFO: renamed from: ۦُ */
    public final /* synthetic */ int f16583;

    /* JADX INFO: renamed from: ۦٖ */
    public final String f16584;

    public C5010(int i, String str, boolean z) {
        this.f16583 = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(str, "name == null");
                this.f16584 = str;
                this.f16582 = z;
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Objects.requireNonNull(str, "name == null");
                this.f16584 = str;
                this.f16582 = z;
                break;
            default:
                Objects.requireNonNull(str, "name == null");
                this.f16584 = str;
                this.f16582 = z;
                break;
        }
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo963(C1781 c1781, Object obj) {
        String string;
        String string2;
        String string3;
        int i = this.f16583;
        boolean z = this.f16582;
        String str = this.f16584;
        switch (i) {
            case 0:
                if (obj != null && (string = obj.toString()) != null) {
                    c1781.m3567(str, string, z);
                }
                break;
            case 1:
                if (obj != null && (string2 = obj.toString()) != null) {
                    c1781.m3566(str, string2, z);
                }
                break;
            default:
                if (obj != null && (string3 = obj.toString()) != null) {
                    c1781.m3568(str, string3, z);
                }
                break;
        }
    }
}
