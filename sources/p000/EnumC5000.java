package p000;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦٍؚۘؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5000 implements Executor {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC5000[] f16542;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC5000 f16543;

    static {
        EnumC5000 enumC5000 = new EnumC5000("INSTANCE", 0);
        f16543 = enumC5000;
        f16542 = new EnumC5000[]{enumC5000};
    }

    public static EnumC5000 valueOf(String str) {
        return (EnumC5000) Enum.valueOf(EnumC5000.class, str);
    }

    public static EnumC5000[] values() {
        return (EnumC5000[]) f16542.clone();
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
