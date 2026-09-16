package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ۦؘؑؒ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3021 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: ۦۨ */
    public final TimeUnit f10178;

    EnumC3021(TimeUnit timeUnit) {
        this.f10178 = timeUnit;
    }
}
