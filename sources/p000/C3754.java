package p000;

/* JADX INFO: renamed from: ۦٌۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3754 extends Exception {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12488;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3754(String str, Throwable th) {
        super(str, th);
        this.f12488 = 1;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f12488) {
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                synchronized (this) {
                    setStackTrace(new StackTraceElement[0]);
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3754(int i, String str) {
        super(str);
        this.f12488 = i;
    }
}
