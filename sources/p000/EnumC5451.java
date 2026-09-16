package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦؙۡؒۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5451 implements Executor {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC5451[] f17966;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final Handler f17967;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC5451 f17968;

    static {
        EnumC5451 enumC5451 = new EnumC5451("INSTANCE", 0);
        f17968 = enumC5451;
        f17966 = new EnumC5451[]{enumC5451};
        f17967 = new Handler(Looper.getMainLooper());
    }

    public static EnumC5451 valueOf(String str) {
        return (EnumC5451) Enum.valueOf(EnumC5451.class, str);
    }

    public static EnumC5451[] values() {
        return (EnumC5451[]) f17966.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f17967.post(runnable);
    }
}
