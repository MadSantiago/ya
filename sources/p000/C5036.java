package p000;

/* JADX INFO: renamed from: ۦۘؖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C5036 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ long f16701 = AbstractC3456.f11473.objectFieldOffset(C5036.class.getDeclaredField("_handled$volatile"));
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: ۥۣ */
    public final Throwable f16702;

    public C5036(Throwable th, boolean z) {
        this.f16702 = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f16702 + ']';
    }
}
