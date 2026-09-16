package p000;

import android.content.ComponentName;

/* JADX INFO: renamed from: ۦؘؚۜۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5307 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ ComponentName f17481;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f17482;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ BinderC4778 f17483;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f17484;

    public /* synthetic */ RunnableC5307(BinderC4778 binderC4778, ComponentName componentName, int i, int i2) {
        this.f17484 = i2;
        this.f17483 = binderC4778;
        this.f17481 = componentName;
        this.f17482 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f17484;
        int i2 = this.f17482;
        ComponentName componentName = this.f17481;
        BinderC4778 binderC4778 = this.f17483;
        switch (i) {
            case 0:
                componentName.getClassName();
                binderC4778.m8161(i2, componentName);
                break;
            default:
                componentName.getClassName();
                binderC4778.m8161(-1, componentName);
                binderC4778.m8162(i2);
                break;
        }
    }
}
