package p000;

import android.os.Build;

/* JADX INFO: renamed from: ۥۦؑۨۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2782 extends AbstractC0818 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ int f9274;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2782(AbstractC3959 abstractC3959, int i) {
        super(abstractC3959);
        this.f9274 = i;
    }

    @Override // p000.AbstractC0818
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1302() {
        switch (this.f9274) {
            case 0:
                return 6;
            case 1:
                return 5;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return 7;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return 7;
            default:
                return 9;
        }
    }

    @Override // p000.InterfaceC5721
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo1303(C4142 c4142) {
        switch (this.f9274) {
            case 0:
                return c4142.f13791.f15276;
            case 1:
                return c4142.f13791.f15277;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return c4142.f13791.f15281 == 2;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                int i = c4142.f13791.f15281;
                if (i != 3) {
                    return Build.VERSION.SDK_INT >= 30 && i == 6;
                }
                return true;
            default:
                return c4142.f13791.f15278;
        }
    }

    @Override // p000.AbstractC0818
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo1304(Object obj) {
        boolean zBooleanValue;
        switch (this.f9274) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5862 c5862 = (C5862) obj;
                return (!c5862.f19356 && c5862.f19358 && c5862.f19357) ? false : true;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5862 c5863 = (C5862) obj;
                return !c5863.f19358 || c5863.f19355 || c5863.f19356;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
