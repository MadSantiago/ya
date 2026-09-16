package p000;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ۥٕٜؕ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1410 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final Pattern f4847 = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* JADX INFO: renamed from: ۥۗ */
    public static final Account f4846 = AbstractC3962.f13246;

    /* JADX INFO: renamed from: ۥؗ */
    public static final Set f4845 = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* JADX INFO: renamed from: ۦؑ */
    public static final Set f4848 = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}
