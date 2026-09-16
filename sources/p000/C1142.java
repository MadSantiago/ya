package p000;

import java.io.File;
import java.util.function.Predicate;

/* JADX INFO: renamed from: ۥؘّؑۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1142 implements Predicate {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f3984;

    public /* synthetic */ C1142(int i) {
        this.f3984 = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f3984) {
            case 0:
                return ((Integer) obj).intValue() != 0;
            case 1:
                return ((File) obj).exists();
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C3741) obj).f12463 == AbstractC5781.f19048;
            default:
                return ((C3741) obj).f12463 == AbstractC5781.f19047;
        }
    }
}
