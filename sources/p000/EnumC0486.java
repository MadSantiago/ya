package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥَؕؗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0486 implements Executor {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC0486[] f1766;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC0486 f1767;

    static {
        EnumC0486 enumC0486 = new EnumC0486("INSTANCE", 0);
        f1767 = enumC0486;
        f1766 = new EnumC0486[]{enumC0486};
    }

    public static EnumC0486 valueOf(String str) {
        return (EnumC0486) Enum.valueOf(EnumC0486.class, str);
    }

    public static EnumC0486[] values() {
        return (EnumC0486[]) f1766.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
