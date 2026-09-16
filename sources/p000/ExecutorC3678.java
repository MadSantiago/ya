package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ۦًُؗٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC3678 implements Executor {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12286;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final ExecutorC3678 f12285 = new ExecutorC3678(0);

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ ExecutorC3678 f12284 = new ExecutorC3678(2);

    public /* synthetic */ ExecutorC3678(int i) {
        this.f12286 = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f12286) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
