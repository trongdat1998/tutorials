import { TestBed } from '@angular/core/testing';

import { DirectiveNameService } from './directive-name.service';

describe('DirectiveNameService', () => {
  let service: DirectiveNameService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DirectiveNameService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
