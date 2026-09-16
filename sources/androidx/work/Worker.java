package androidx.work;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C2972;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker {

    /* JADX INFO: renamed from: ۥؗ */
    public final AtomicInteger f243 = new AtomicInteger(-256);

    /* JADX INFO: renamed from: ۥۗ */
    public final WorkerParameters f244;

    /* JADX INFO: renamed from: ۥۣ */
    public final Context f245;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f246;

    public Worker(Context context, WorkerParameters workerParameters) {
        this.f245 = context;
        this.f244 = workerParameters;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract C2972 mo82();
}
