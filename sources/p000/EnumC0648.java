package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥؘؑۚۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0648 implements Executor {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC0648[] f2421;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC0648 f2422;

    static {
        EnumC0648 enumC0648 = new EnumC0648("INSTANCE", 0);
        f2422 = enumC0648;
        f2421 = new EnumC0648[]{enumC0648};
    }

    public static EnumC0648 valueOf(String str) {
        return (EnumC0648) Enum.valueOf(EnumC0648.class, str);
    }

    public static EnumC0648[] values() {
        return (EnumC0648[]) f2421.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
