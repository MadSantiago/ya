package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۦًٟؓٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3658 extends ArrayList {
    /* JADX INFO: renamed from: ۦؑ */
    public final Object m6536() {
        if (super.size() == 0) {
            return null;
        }
        E e = get(0);
        int size = super.size();
        for (int i = 1; i < size; i++) {
            if (!AbstractC3831.m6874(e, get(i))) {
                return null;
            }
        }
        return e;
    }
}
