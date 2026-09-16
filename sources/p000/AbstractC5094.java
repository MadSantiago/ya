package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ۦۣٜۙؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5094 extends CancellationException {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16889;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC5094(int i, String str) {
        super(str);
        this.f16889 = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f16889) {
            case 0:
                setStackTrace(AbstractC3801.f12616);
                break;
            case 1:
                setStackTrace(AbstractC1605.f5389);
                break;
            default:
                setStackTrace(AbstractC2774.f9246);
                break;
        }
        return this;
    }
}
