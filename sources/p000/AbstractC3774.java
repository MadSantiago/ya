package p000;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: ۦٍّٟؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3774 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final List f12546;

    static {
        try {
            f12546 = AbstractC1961.m3843(new C4299(new C3527(2, Arrays.asList(new C3328()).iterator())));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
