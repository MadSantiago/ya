package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: renamed from: ۦۤؗ۟۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5680 implements FilenameFilter {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f18677;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f18677) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Object[] objArr = {"trigger-type-anomaly", "trigger-type-oom"};
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    Object obj = objArr[i];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                return Collections.unmodifiableList(arrayList).contains(str);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
